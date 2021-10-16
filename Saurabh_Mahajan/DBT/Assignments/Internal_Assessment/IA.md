```SQL


1. Find number of customers in each city.

sunbeam>SELECT p.city CITY, COUNT(c.cid) NO_OF_CUSTOMERS FROM customers c INNER JOIN city_pin p ON p.pin = c.cpin GROUP BY p.city;
+--------+-----------------+
| CITY   | NO_OF_CUSTOMERS |
+--------+-----------------+
| Mumbai |               3 |
| Pune   |               4 |
| Karad  |               2 |
+--------+-----------------+
3 rows in set (0.00 sec)













2. Find number of pending and number of delivered orders whose total amount is more than 100.

sunbeam>SELECT ostatus STATUS, COUNT(cid) NO_OF_ORDERS FROM orders WHERE ostatus IN ('delivered', 'pending') GROUP BY ostatus HAVING SUM(oamount) > 100;
+-----------+--------------+
| STATUS    | NO_OF_ORDERS |
+-----------+--------------+
| delivered |            4 |
| pending   |            1 |
+-----------+--------------+
2 rows in set (0.00 sec)













3. Display top 3 products that produce highest revenue (quantity * rate).

sunbeam>SELECT p.pid PRODUCT_ID, p.pname PRODUCT_NAME, (SUM(o.pqty)*p.prate) REVENUE FROM products p INNER JOIN order_items o ON o.pid = p.pid GROUP BY p.pid ORDER BY REVENUE DESC LIMIT 3;
+------------+--------------+---------+
| PRODUCT_ID | PRODUCT_NAME | REVENUE |
+------------+--------------+---------+
|          4 | Notebook     |     840 |
|          6 | Marker       |     450 |
|          5 | SketchPen    |     250 |
+------------+--------------+---------+
3 rows in set (0.00 sec)













4. Find total number of orders by customer John, Mac and Donald.

sunbeam>SELECT c.cname CUSTOMER_NAME, COUNT(o.cid) NO_OF_ORDERS FROM customers c INNER JOIN orders o ON o.cid = c.cid WHERE c.cname IN('John', 'Mac', 'Donald') GROUP BY c.cname;
+---------------+--------------+
| CUSTOMER_NAME | NO_OF_ORDERS |
+---------------+--------------+
| John          |            1 |
| Mac           |            1 |
| Donald        |            1 |
+---------------+--------------+
3 rows in set (0.00 sec)














5. Mark last order of John as Delivered.


sunbeam>SELECT * FROM orders WHERE cid = (SELECT cid FROM customers WHERE cname = 'John') ORDER BY odate DESC LIMIT 1;
+-----+------------+------------+---------+------+
| oid | odate      | ostatus    | oamount | cid  |
+-----+------------+------------+---------+------+
|   1 | 2021-10-02 | dispatched |  150.00 |  101 |
+-----+------------+------------+---------+------+
1 row in set (0.00 sec)




sunbeam>UPDATE orders SET ostatus = 'delivered' WHERE cid = (SELECT cid FROM customers WHERE cname = 'John') ORDER BY odate DESC LIMIT 1;
Query OK, 1 row affected (0.16 sec)
Rows matched: 1  Changed: 1  Warnings: 0


sunbeam>SELECT * FROM orders WHERE cid = (SELECT cid FROM customers WHERE cname = 'John') ORDER BY odate LIMIT 1;
+-----+------------+-----------+---------+------+
| oid | odate      | ostatus   | oamount | cid  |
+-----+------------+-----------+---------+------+
|   1 | 2021-10-02 | delivered |  150.00 |  101 |
+-----+------------+-----------+---------+------+
1 row in set (0.00 sec)











6. Display the customer name and their total order amount where order status is delivered and total is more than 300

sunbeam>SELECT C.CNAME CUSTOMER_NAME, SUM(o.oamount) TOTAL FROM customers c INNER JOIN orders o ON o.cid = c.cid WHERE o.ostatus = 'delivered' GROUP BY o.cid HAVING SUM(o.oamount) > 300;
+---------------+--------+
| CUSTOMER_NAME | TOTAL  |
+---------------+--------+
| Millar        | 500.00 |
| Merry         | 450.00 |
+---------------+--------+
2 rows in set (0.00 sec)














7. Update the last order of Adam from Pending to dispatch and then dispatch to Delivered (in two different queries).




sunbeam>SELECT * FROM orders WHERE cid = (SELECT cid FROM customers WHERE cname = 'Adam') ORDER BY odate DESC LIMIT 1;
+-----+------------+---------+---------+------+
| oid | odate      | ostatus | oamount | cid  |
+-----+------------+---------+---------+------+
|   9 | 2021-10-01 | pending |  130.00 |  107 |
+-----+------------+---------+---------+------+
1 row in set (0.00 sec)



sunbeam>UPDATE orders SET ostatus = 'dispatch' WHERE cid = (SELECT cid FROM customers WHERE cname = 'Adam') ORDER BY odate DESC LIMIT 1;
Query OK, 1 row affected (0.19 sec)
Rows matched: 1  Changed: 1  Warnings: 0

sunbeam>SELECT * FROM orders WHERE cid = (SELECT cid FROM customers WHERE cname = 'Adam') ORDER BY odate DESC LIMIT 1;
+-----+------------+----------+---------+------+
| oid | odate      | ostatus  | oamount | cid  |
+-----+------------+----------+---------+------+
|   9 | 2021-10-01 | dispatch |  130.00 |  107 |
+-----+------------+----------+---------+------+
1 row in set (0.01 sec)




sunbeam>UPDATE orders SET ostatus = 'delivered' WHERE cid = (SELECT cid FROM customers WHERE cname = 'Adam') ORDER BY odate DESC LIMIT 1;
Query OK, 1 row affected (0.27 sec)
Rows matched: 1  Changed: 1  Warnings: 0

sunbeam>SELECT * FROM orders WHERE cid = (SELECT cid FROM customers WHERE cname = 'Adam') ORDER BY odate DESC LIMIT 1;
+-----+------------+-----------+---------+------+
| oid | odate      | ostatus   | oamount | cid  |
+-----+------------+-----------+---------+------+
|   9 | 2021-10-01 | delivered |  130.00 |  107 |
+-----+------------+-----------+---------+------+
1 row in set (0.00 sec)















8. Display pins and cities of all customers whose name start and end with a vowel (a, e, i, o, u).

sunbeam>SELECT c.cname CUSTOMER_NAME, c.cpin PIN, ci.city CITY FROM customers c LEFT JOIN city_pin ci ON c.cpin = ci.pin WHERE LEFT(c.cname,1) IN ('a', 'e', 'i', 'o', 'u') AND RIGHT(c.cname,1) IN ('a', 'e', 'i', 'o', 'u');
+---------------+--------+--------+
| CUSTOMER_NAME | PIN    | CITY   |
+---------------+--------+--------+
| Ileana        | 400027 | Mumbai |
+---------------+--------+--------+
1 row in set (0.00 sec)














9. Display cities, number of orders and total amount of orders from cities in asc order of city name.

sunbeam>SELECT ci.city CITY, COUNT(o.cid) NO_OF_ORDERS, SUM(o.oamount) TOTAL_AMOUNT FROM city_pin ci LEFT JOIN customers c ON ci.pin = c.cpin INNER JOIN orders o ON o.cid = c.cid GROUP BY ci.city ORDER BY ci.city;
+--------+--------------+--------------+
| CITY   | NO_OF_ORDERS | TOTAL_AMOUNT |
+--------+--------------+--------------+
| Karad  |            3 |       630.00 |
| Mumbai |            2 |       600.00 |
| Pune   |            3 |       240.00 |
+--------+--------------+--------------+
3 rows in set (0.14 sec)













10. Print total order amount from each city in descending order of amount.

sunbeam>SELECT ci.city CITY, SUM(o.oamount) TOTAL_AMOUNT FROM city_pin ci LEFT JOIN customers c ON ci.pin = c.cpin INNER JOIN orders o ON o.cid = c.cid GROUP BY ci.city ORDER BY SUM(o.oamount) DESC;
+--------+--------------+
| CITY   | TOTAL_AMOUNT |
+--------+--------------+
| Karad  |       630.00 |
| Mumbai |       600.00 |
| Pune   |       240.00 |
+--------+--------------+
3 rows in set (0.00 sec)












```