1. Write a query that uses a subquery to obtain all orders for the customer named Cisneros. Assume you do not know his customer number ( cnum ).

d2_56660>SELECT * FROM orders WHERE cnum = (SELECT cnum FROM customers WHERE cname = 'Cisneros');
+------+---------+------------+------+------+
| onum | amt     | odate      | cnum | snum |
+------+---------+------------+------+------+
| 3001 |   18.69 | 1990-10-03 | 2008 | 1007 |
| 3006 | 1098.16 | 1990-10-03 | 2008 | 1007 |
+------+---------+------------+------+------+
2 rows in set (0.00 sec)

2. Write a query that produces the names and ratings of all customers who 
have above average(amt) orders.

d2_56660>SELECT cname,rating FROM customers WHERE cnum=
    -> ANY(SELECT cnum FROM orders WHERE amt>(SELECT AVG(amt) FROM orders));
+---------+--------+
| cname   | rating |
+---------+--------+
| Liu     |    200 |
| Clemens |    100 |
+---------+--------+
2 rows in set (0.06 sec)

3. Write a query that selects the total amount in orders for each salesperson 
for whom this total is greater than the amount of the largest order in the table

d2_56660>SELECT snum,SUM(amt) FROM orders GROUP BY snum HAVING
    -> SUM(amt)> (SELECT MAX(amt) FROM orders);
+------+----------+
| snum | SUM(amt) |
+------+----------+
| 1001 | 15382.07 |
+------+----------+
1 row in set (0.00 s

4. Write a query that selects all customers whose ratings are equal to or 
greater than ANY of ‘Serres’

d2_56660>SELECT * FROM customers WHERE rating>= ANY(SELECT rating FROM customers WHERE
    -> snum = (SELECT snum FROM salespeople WHERE sname = 'Serres'));
+------+----------+----------+--------+------+
| cnum | cname    | city     | rating | snum |
+------+----------+----------+--------+------+
| 2002 | Giovanni | Rome     |    200 | 1003 |
| 2003 | Liu      | San Jose |    200 | 1002 |
| 2004 | Grass    | Berlin   |    300 | 1002 |
| 2008 | Cisneros | San Jose |    300 | 1007 |
+------+----------+----------+--------+------+
4 rows in set (0.03 sec)

5. Write a query that will find all salespeople who have no customers located in 
their city.

d2_56660>SELECT * FROM salespeople WHERE city NOT IN(SELECT city FROM customers);
+------+---------+-----------+------+
| snum | sname   | city      | comm |
+------+---------+-----------+------+
| 1007 | Rifkin  | Barcelona | 0.15 |
| 1003 | Axelrod | New York  | 0.10 |
+------+---------+-----------+------+
2 rows in set (0.00 sec)

6. Write a query that selects all orders for amounts greater than any for the 
customers in London.

d2_56660>SELECT * FROM orders WHERE amt > ANY(SELECT
    -> amt FROM orders WHERE cnum =ANY(SELECT cnum FROM customers WHERE city='London'));
+------+---------+------------+------+------+
| onum | amt     | odate      | cnum | snum |
+------+---------+------------+------+------+
| 3002 | 1900.10 | 1990-10-03 | 2007 | 1004 |
| 3005 | 5160.45 | 1990-10-03 | 2003 | 1002 |
| 3006 | 1098.16 | 1990-10-03 | 2008 | 1007 |
| 3009 | 1713.23 | 1990-10-04 | 2002 | 1003 |
| 3008 | 4723.00 | 1990-10-04 | 2006 | 1001 |
| 3011 | 9891.88 | 1990-10-04 | 2006 | 1001 |
+------+---------+------------+------+------+
6 rows in set (0.00 sec)

7. Extract all the orders of Motika

d2_56660>SELECT * FROM orders WHERE snum = (SELECT snum FROM salespeople
    -> WHERE sname = 'Motika');
+------+---------+------------+------+------+
| onum | amt     | odate      | cnum | snum |
+------+---------+------------+------+------+
| 3002 | 1900.10 | 1990-10-03 | 2007 | 1004 |
+------+---------+------------+------+------+
1 row in set (0.04 sec)

8. Find all the order attribute to salespeople servicing customers in London

d2_56660>SELECT * FROM orders WHERE snum = ANY(SELECT snum FROM customers WHERE city ='London');
+------+---------+------------+------+------+
| onum | amt     | odate      | cnum | snum |
+------+---------+------------+------+------+
| 3003 |  767.19 | 1990-10-03 | 2001 | 1001 |
| 3008 | 4723.00 | 1990-10-04 | 2006 | 1001 |
| 3011 | 9891.88 | 1990-10-04 | 2006 | 1001 |
+------+---------+------------+------+------+
3 rows in set (0.00 sec)

10. Find salespeople number, name and city who have multiple customers.

d2_56660>SELECT snum,sname,city FROM salespeople WHERE snum =ANY(SELECT snum FROM customers
    -> GROUP BY snum HAVING COUNT(snum)>1);
+------+--------+----------+
| snum | sname  | city     |
+------+--------+----------+
| 1001 | Peel   | London   |
| 1002 | Serres | San Jose |
+------+--------+----------+
2 rows in set (0.00 sec)

11. Select customers who have a greater rating than any other customer in Rome
d2_56660>SELECT * FROM customers WHERE rating >ANY(SELECT rating from customers WHERE city ='Rome');
+------+----------+----------+--------+------+
| cnum | cname    | city     | rating | snum |
+------+----------+----------+--------+------+
| 2002 | Giovanni | Rome     |    200 | 1003 |
| 2003 | Liu      | San Jose |    200 | 1002 |
| 2004 | Grass    | Berlin   |    300 | 1002 |
| 2008 | Cisneros | San Jose |    300 | 1007 |
+------+----------+----------+--------+------+
4 rows in set (0.04 sec)

12. Select all orders that had amounts that were greater that atleast one of the 
orders from ‘1990-10-04’.

d2_56660>SELECT * FROM orders WHERE amt> ANY(SELECT amt FROM orders WHERE
    -> odate ='1990-10-04');
+------+---------+------------+------+------+
| onum | amt     | odate      | cnum | snum |
+------+---------+------------+------+------+
| 3003 |  767.19 | 1990-10-03 | 2001 | 1001 |
| 3002 | 1900.10 | 1990-10-03 | 2007 | 1004 |
| 3005 | 5160.45 | 1990-10-03 | 2003 | 1002 |
| 3006 | 1098.16 | 1990-10-03 | 2008 | 1007 |
| 3009 | 1713.23 | 1990-10-04 | 2002 | 1003 |
| 3008 | 4723.00 | 1990-10-04 | 2006 | 1001 |
| 3010 |  309.95 | 1990-10-04 | 2004 | 1002 |
| 3011 | 9891.88 | 1990-10-04 | 2006 | 1001 |
+------+---------+------------+------+------+
8 rows in set (0.08 sec)

13. Find all orders with amounts smaller than any amount for a customer in 
San Jose.
d2_56660>SELECT * FROM orders WHERE amt< ANY(SELECT amt FROM orders WHERE
    -> cnum =ANY(SELECT cnum FROM customers WHERE city = 'San Jose'));
+------+---------+------------+------+------+
| onum | amt     | odate      | cnum | snum |
+------+---------+------------+------+------+
| 3001 |   18.69 | 1990-10-03 | 2008 | 1007 |
| 3003 |  767.19 | 1990-10-03 | 2001 | 1001 |
| 3002 | 1900.10 | 1990-10-03 | 2007 | 1004 |
| 3006 | 1098.16 | 1990-10-03 | 2008 | 1007 |
| 3009 | 1713.23 | 1990-10-04 | 2002 | 1003 |
| 3007 |   75.75 | 1990-10-04 | 2004 | 1002 |
| 3008 | 4723.00 | 1990-10-04 | 2006 | 1001 |
| 3010 |  309.95 | 1990-10-04 | 2004 | 1002 |
+------+---------+------------+------+------+
8 rows in set (0.00 sec)

14. Select those customers whose rating are higher than every customer in 
Paris

d2_56660>SELECT * FROM customers WHERE rating >ALL(SELECT rating FROM customers WHERE
    -> city ='Paris');
+------+----------+----------+--------+------+
| cnum | cname    | city     | rating | snum |
+------+----------+----------+--------+------+
| 2001 | Hoffman  | London   |    100 | 1001 |
| 2002 | Giovanni | Rome     |    200 | 1003 |
| 2003 | Liu      | San Jose |    200 | 1002 |
| 2004 | Grass    | Berlin   |    300 | 1002 |
| 2006 | Clemens  | London   |    100 | 1001 |
| 2008 | Cisneros | San Jose |    300 | 1007 |
| 2007 | Pereira  | Rome     |    100 | 1004 |
+------+----------+----------+--------+------+
7 rows in set (0.00 sec)