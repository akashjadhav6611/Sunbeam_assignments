Note: To solve below queries use “sales” database


*Use sub-query to solve following problems.


1. Write a query that uses a subquery to obtain all orders for the customer named Cisneros. Assume you do not know his customer number ( cnum ).

D3_56588>SELECT * FROM orders WHERE cnum = (SELECT cnum FROM customers WHERE cname = 'Cisneros');
+------+---------+------------+------+------+
| onum | amt     | odate      | cnum | snum |
+------+---------+------------+------+------+
| 3001 |   18.69 | 1990-10-03 | 2008 | 1007 |
| 3006 | 1098.16 | 1990-10-03 | 2008 | 1007 |
+------+---------+------------+------+------+
2 rows in set (0.00 sec)








2. Write a query that produces the names and ratings of all customers who have above average(amt) orders.

D3_56588>select cname, rating from customers WHERE cnum = ANY(SELECT cnum FROM orders WHERE amt > (SELECT AVG(amt) FROM orders));
+---------+--------+
| cname   | rating |
+---------+--------+
| Liu     |    200 |
| Clemens |    100 |
+---------+--------+
2 rows in set (0.00 sec)












3. Write a query that selects the total amount in orders for each salesperson for whom this total is greater than the amount of the largest order 
in the table.

D3_56588>SELECT snum, SUM(amt) FROM orders GROUP BY snum HAVING SUM(amt) > (SELECT MAX(amt) FROM orders);
+------+----------+
| snum | SUM(amt) |
+------+----------+
| 1001 | 15382.07 |
+------+----------+
1 row in set (0.00 sec)










4. Write a query that selects all customers whose ratings are equal to or greater than ANY of ‘Serres’.

D3_56588>SELECT cname FROM customers WHERE rating >= ANY(SELECT rating FROM customers WHERE snum = ANY(SELECT snum FROM salespeople WHERE sname = 'Serres'));
+----------+
| cname    |
+----------+
| Giovanni |
| Liu      |
| Grass    |
| Cisneros |
+----------+
4 rows in set (0.00 sec)












5. Write a query that will find all salespeople who have no customers located in their city.

D3_56588>SELECT sname FROM salespeople s WHERE NOT EXISTS (SELECT c.city FROM customers c WHERE c.city = s.city);
+---------+
| sname   |
+---------+
| Rifkin  |
| Axelrod |
+---------+
2 rows in set (0.00 sec)












6. Write a query that selects all orders for amounts greater than any for the customers in London.

D3_56588>SELECT onum FROM orders WHERE amt > ANY(SELECT amt FROM orders WHERE cnum = ANY(SELECT cnum FROM customers WHERE city = 'London'));
+------+
| onum |
+------+
| 3002 |
| 3005 |
| 3006 |
| 3009 |
| 3008 |
| 3011 |
+------+
6 rows in set (0.00 sec)












7. Extract all the orders of Motika.

D3_56588>SELECT onum FROM orders WHERE snum = (SELECT snum FROM salespeople WHERE sname = 'Motika');
+------+
| onum |
+------+
| 3002 |
+------+
1 row in set (0.00 sec)












8. Find all the order attribute to salespeople servicing customers in London.

D3_56588>SELECT onum FROM orders WHERE cnum = ANY(SELECT cnum FROM customers WHERE city = 'London');
+------+
| onum |
+------+
| 3003 |
| 3008 |
| 3011 |
+------+
3 rows in set (0.00 sec)













9. Find names and numbers of all salesperson who have more than one customer.

D3_56588>select snum, sname FROM salespeople WHERE snum = ANY(SELECT snum FROM customers GROUP BY snum HAVING COUNT(snum) > 1);
+------+--------+
| snum | sname  |
+------+--------+
| 1001 | Peel   |
| 1002 | Serres |
+------+--------+
2 rows in set (0.10 sec)













10. Find salespeople number, name and city who have multiple customers.

D3_56588>select snum, sname, city FROM salespeople WHERE snum = ANY(SELECT snum FROM customers GROUP BY snum HAVING COUNT(snum) > 1);
+------+--------+----------+
| snum | sname  | city     |
+------+--------+----------+
| 1001 | Peel   | London   |
| 1002 | Serres | San Jose |
+------+--------+----------+
2 rows in set (0.00 sec)













11. Select customers who have a greater rating than any other customer in Rome.

D3_56588>SELECT cname FROM customers WHERE rating > ANY(SELECT rating FROM customers WHERE city = 'Rome');
+----------+
| cname    |
+----------+
| Giovanni |
| Liu      |
| Grass    |
| Cisneros |
+----------+
4 rows in set (0.00 sec)












12. Select all orders that had amounts that were greater that atleast one of the orders from ‘1990-10-04’.

D3_56588>SELECT onum FROM orders WHERE amt > ANY(SELECT amt FROM orders WHERE odate = '1990-10-04');
+------+
| onum |
+------+
| 3003 |
| 3002 |
| 3005 |
| 3006 |
| 3009 |
| 3008 |
| 3010 |
| 3011 |
+------+
8 rows in set (0.12 sec)













13. Find all orders with amounts smaller than any amount for a customer in San Jose.

D3_56588>SELECT onum FROM orders WHERE amt < ANY(SELECT amt FROM orders WHERE cnum = ANY(SELECT cnum FROM customers WHERE city = 'San Jose'));
+------+
| onum |
+------+
| 3001 |
| 3003 |
| 3002 |
| 3006 |
| 3009 |
| 3007 |
| 3008 |
| 3010 |
+------+
8 rows in set (0.00 sec)














D3_56588>SELECT cname FROM customers WHERE rating > ALL(SELECT rating FROM customers WHERE city = 'Paris');
+----------+
| cname    |
+----------+
| Hoffman  |
| Giovanni |
| Liu      |
| Grass    |
| Clemens  |
| Cisneros |
| Pereira  |
+----------+
7 rows in set (0.01 sec)