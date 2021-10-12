Note: To solve below queries use “sales” database 

*Use appropriate joins to solve following queries.



D3_56588>CREATE VIEW v_cos AS SELECT o.onum ONUM, o.amt AMOUNT, o.odate ODATE, o.cnum CNUM, c.cname CNAME, c.city C_CITY, c.rating RATING, s.snum SNUM, s.sname SNAME, s.city S_CITY, s.comm S_COMM FROM orders o LEFT JOIN customers c ON c.cnum = o.cnum LEFT JOIN salespeople s ON s.snum = o.snum;
Query OK, 0 rows affected (0.37 sec)






D3_56588>SELECT * FROM v_cos;
+------+---------+------------+------+----------+----------+--------+------+---------+-----------+--------+
| ONUM | AMOUNT  | ODATE      | CNUM | CNAME    | C_CITY   | RATING | SNUM | SNAME   | S_CITY    | S_COMM |
+------+---------+------------+------+----------+----------+--------+------+---------+-----------+--------+
| 3001 |   18.69 | 1990-10-03 | 2008 | Cisneros | San Jose |    300 | 1007 | Rifkin  | Barcelona |   0.15 |
| 3003 |  767.19 | 1990-10-03 | 2001 | Hoffman  | London   |    100 | 1001 | Peel    | London    |   0.12 |
| 3002 | 1900.10 | 1990-10-03 | 2007 | Pereira  | Rome     |    100 | 1004 | Motika  | London    |   0.11 |
| 3005 | 5160.45 | 1990-10-03 | 2003 | Liu      | San Jose |    200 | 1002 | Serres  | San Jose  |   0.13 |
| 3006 | 1098.16 | 1990-10-03 | 2008 | Cisneros | San Jose |    300 | 1007 | Rifkin  | Barcelona |   0.15 |
| 3009 | 1713.23 | 1990-10-04 | 2002 | Giovanni | Rome     |    200 | 1003 | Axelrod | New York  |   0.10 |
| 3007 |   75.75 | 1990-10-04 | 2004 | Grass    | Berlin   |    300 | 1002 | Serres  | San Jose  |   0.13 |
| 3008 | 4723.00 | 1990-10-04 | 2006 | Clemens  | London   |    100 | 1001 | Peel    | London    |   0.12 |
| 3010 |  309.95 | 1990-10-04 | 2004 | Grass    | Berlin   |    300 | 1002 | Serres  | San Jose  |   0.13 |
| 3011 | 9891.88 | 1990-10-04 | 2006 | Clemens  | London   |    100 | 1001 | Peel    | London    |   0.12 |
+------+---------+------------+------+----------+----------+--------+------+---------+-----------+--------+
10 rows in set (0.37 sec)




1. Write a query that lists each order number followed by the name of the customer who made the order.

D3_56588>SELECT ONUM, CNAME FROM v_cos;
+------+----------+
| ONUM | CNAME    |
+------+----------+
| 3001 | Cisneros |
| 3003 | Hoffman  |
| 3002 | Pereira  |
| 3005 | Liu      |
| 3006 | Cisneros |
| 3009 | Giovanni |
| 3007 | Grass    |
| 3008 | Clemens  |
| 3010 | Grass    |
| 3011 | Clemens  |
+------+----------+
10 rows in set (0.00 sec)













2. Write a query that gives the names of both the salesperson and the customer for each order along with the order number.

D3_56588>SELECT ONUM, SNAME, CNAME FROM v_cos;
+------+---------+----------+
| ONUM | SNAME   | CNAME    |
+------+---------+----------+
| 3001 | Rifkin  | Cisneros |
| 3003 | Peel    | Hoffman  |
| 3002 | Motika  | Pereira  |
| 3005 | Serres  | Liu      |
| 3006 | Rifkin  | Cisneros |
| 3009 | Axelrod | Giovanni |
| 3007 | Serres  | Grass    |
| 3008 | Peel    | Clemens  |
| 3010 | Serres  | Grass    |
| 3011 | Peel    | Clemens  |
+------+---------+----------+
10 rows in set (0.00 sec)













3. Write a query that produces all customers serviced by salespeople with a commission above 12%. Output the customer’s name, the salesperson’s name, and the salesperson’s rate of commission.

D3_56588>SELECT CNAME, SNAME, S_COMM FROM v_cos WHERE S_COMM > 0.12;
+----------+--------+--------+
| CNAME    | SNAME  | S_COMM |
+----------+--------+--------+
| Cisneros | Rifkin |   0.15 |
| Liu      | Serres |   0.13 |
| Cisneros | Rifkin |   0.15 |
| Grass    | Serres |   0.13 |
| Grass    | Serres |   0.13 |
+----------+--------+--------+
5 rows in set (0.00 sec)













4. Write a query that calculates the amount of the salesperson’s commission on each order by a customer with a rating above 100.

D3_56588>SELECT ONUM, SNAME, RATING, AMOUNT*S_COMM AS COMM FROM v_cos WHERE RATING > 100;
+------+---------+--------+----------+
| ONUM | SNAME   | RATING | COMM     |
+------+---------+--------+----------+
| 3001 | Rifkin  |    300 |   2.8035 |
| 3005 | Serres  |    200 | 670.8585 |
| 3006 | Rifkin  |    300 | 164.7240 |
| 3009 | Axelrod |    200 | 171.3230 |
| 3007 | Serres  |    300 |   9.8475 |
| 3010 | Serres  |    300 |  40.2935 |
+------+---------+--------+----------+
6 rows in set (0.10 sec)













5. Write a query that produces all pairs of salespeople who are living in the same city. Exclude combinations of salespeople with themselves as well as duplicate rows with the order reversed.

D3_56588>SELECT a.SNAME, b.SNAME, a.S_CITY FROM v_cos a INNER JOIN v_cos b ON a.S_CITY = b.S_CITY GROUP BY a.SNUM HAVING a.SNAME < b.SNAME;
+--------+-------+--------+
| SNAME  | SNAME | S_CITY |
+--------+-------+--------+
| Motika | Peel  | London |
+--------+-------+--------+
1 row in set (0.00 sec)












