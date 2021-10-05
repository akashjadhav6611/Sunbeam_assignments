C:\Users\Lenovo>mysql -u D3_56588 -p
Enter password: ********
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 32
Server version: 8.0.26 MySQL Community Server - GPL

Copyright (c) 2000, 2021, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

D3_56588>SELECT USER(), DATABASE();
+--------------------+------------+
| USER()             | DATABASE() |
+--------------------+------------+
| D3_56588@localhost | NULL       |
+--------------------+------------+
1 row in set (0.01 sec)

D3_56588>USE classwork;
Database changed

D3_56588>SELECT USER(), DATABASE();
+--------------------+------------+
| USER()             | DATABASE() |
+--------------------+------------+
| D3_56588@localhost | classwork  |
+--------------------+------------+
1 row in set (0.00 sec)

SOURCE F:/Gitlab/DBT/assignment/Assignment_2/databases/classwork-db.sql






D3_56588>CREATE DATABASE hr;

D3_56588>USE hr;
Database changed

SOURCE F:/Gitlab/DBT/assignment/Assignment_2/databases/hr-db.sql






D3_56588>CREATE DATABASE sales;

D3_56588>USE sales;
Database changed

SOURCE F:/Gitlab/DBT/assignment/Assignment_2/databases/sales-db.sql






D3_56588>CREATE DATABASE northwind;

D3_56588>USE northwind;
Database changed

SOURCE F:/Gitlab/DBT/assignment/Assignment_2/databases/northwind-db.sql







D3_56588>USE classwork;
Database changed

D3_56588>SHOW TABLES;
+---------------------+
| Tables_in_classwork |
+---------------------+
| bonus               |
| books               |
| dept                |
| dummy               |
| emp                 |
| salgrade            |
| stud                |
+---------------------+
7 rows in set (0.00 sec)

D3_56588>SELECT * FROM bonus;
Empty set (0.25 sec)

D3_56588>SELECT * FROM books;
+------+---------------------------------+-------------------+-------------------+---------+
| id   | name                            | author            | subject           | price   |
+------+---------------------------------+-------------------+-------------------+---------+
| 1001 | Exploring C                     | Yashwant Kanetkar | C Programming     | 123.456 |
| 1002 | Pointers in C                   | Yashwant Kanetkar | C Programming     | 371.019 |
| 1003 | ANSI C Programming              | E Balaguruswami   | C Programming     | 334.215 |
| 1004 | ANSI C Programming              | Dennis Ritchie    | C Programming     | 140.121 |
| 2001 | C++ Complete Reference          | Herbert Schildt   | C++ Programming   | 417.764 |
| 2002 | C++ Primer                      | Stanley Lippman   | C++ Programming   | 620.665 |
| 2003 | C++ Programming Language        | Bjarne Stroustrup | C++ Programming   | 987.213 |
| 3001 | Java Complete Reference         | Herbert Schildt   | Java Programming  | 525.121 |
| 3002 | Core Java Volume I              | Cay Horstmann     | Java Programming  | 575.651 |
| 3003 | Java Programming Language       | James Gosling     | Java Programming  | 458.238 |
| 4001 | Operating System Concepts       | Peter Galvin      | Operating Systems | 567.391 |
| 4002 | Design of UNIX Operating System | Mauris J Bach     | Operating Systems | 421.938 |
| 4003 | UNIX Internals                  | Uresh Vahalia     | Operating Systems | 352.822 |
+------+---------------------------------+-------------------+-------------------+---------+
13 rows in set (0.12 sec)

D3_56588>SELECT * FROM dept;
+--------+------------+----------+
| deptno | dname      | loc      |
+--------+------------+----------+
|     10 | ACCOUNTING | NEW YORK |
|     20 | RESEARCH   | DALLAS   |
|     30 | SALES      | CHICAGO  |
|     40 | OPERATIONS | BOSTON   |
+--------+------------+----------+
4 rows in set (0.11 sec)

D3_56588>SELECT * FROM dummy;
+-------+
| dummy |
+-------+
|     0 |
+-------+
1 row in set (0.10 sec)

D3_56588>SELECT * FROM emp;
+-------+--------+-----------+------+------------+---------+---------+--------+
| empno | ename  | job       | mgr  | hire       | sal     | comm    | deptno |
+-------+--------+-----------+------+------------+---------+---------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800.00 |    NULL |     20 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975.00 |    NULL |     20 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850.00 |    NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450.00 |    NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 |    NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 |    NULL |     10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1100.00 |    NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950.00 |    NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 |    NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 |    NULL |     10 |
+-------+--------+-----------+------+------------+---------+---------+--------+
14 rows in set (0.12 sec)

D3_56588>SELECT * FROM salgrade;
+-------+-------+-------+
| grade | losal | hisal |
+-------+-------+-------+
|     1 |   700 |  1200 |
|     2 |  1201 |  1400 |
|     3 |  1401 |  2000 |
|     4 |  2001 |  3000 |
|     5 |  3001 |  9999 |
+-------+-------+-------+
5 rows in set (0.10 sec)

D3_56588>SELECT * FROM stud;
+------+-----------+-------+
| id   | name      | marks |
+------+-----------+-------+
|    1 | SAURABH   |    83 |
|    2 | KAUSTUBH  |  97.8 |
|    3 | KOMAL     |  87.2 |
|    4 | KAMLAKAR  | 89.23 |
|    5 | KHEMCHAND |  92.8 |
|    6 | JOHN      | 88.88 |
|    7 | MARK      |  NULL |
+------+-----------+-------+
7 rows in set (0.11 sec)








D3_56588>USE sales;
Database changed
D3_56588>SELECT USER(), DATABASE();
+--------------------+------------+
| USER()             | DATABASE() |
+--------------------+------------+
| D3_56588@localhost | sales      |
+--------------------+------------+
1 row in set (0.00 sec)

D3_56588>SHOW TABLES;
+-----------------+
| Tables_in_sales |
+-----------------+
| customers       |
| orders          |
| salespeople     |
+-----------------+
3 rows in set (0.00 sec)

D3_56588>SELECT * FROM customers;
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
7 rows in set (0.11 sec)

D3_56588>SELECT * FROM orders;
+------+---------+------------+------+------+
| onum | amt     | odate      | cnum | snum |
+------+---------+------------+------+------+
| 3001 |   18.69 | 1990-10-03 | 2008 | 1007 |
| 3003 |  767.19 | 1990-10-03 | 2001 | 1001 |
| 3002 | 1900.10 | 1990-10-03 | 2007 | 1004 |
| 3005 | 5160.45 | 1990-10-03 | 2003 | 1002 |
| 3006 | 1098.16 | 1990-10-03 | 2008 | 1007 |
| 3009 | 1713.23 | 1990-10-04 | 2002 | 1003 |
| 3007 |   75.75 | 1990-10-04 | 2004 | 1002 |
| 3008 | 4723.00 | 1990-10-04 | 2006 | 1001 |
| 3010 |  309.95 | 1990-10-04 | 2004 | 1002 |
| 3011 | 9891.88 | 1990-10-04 | 2006 | 1001 |
+------+---------+------------+------+------+
10 rows in set (0.07 sec)

D3_56588>SELECT * FROM salespeople;
+------+---------+-----------+------+
| snum | sname   | city      | comm |
+------+---------+-----------+------+
| 1001 | Peel    | London    | 0.12 |
| 1002 | Serres  | San Jose  | 0.13 |
| 1004 | Motika  | London    | 0.11 |
| 1007 | Rifkin  | Barcelona | 0.15 |
| 1003 | Axelrod | New York  | 0.10 |
+------+---------+-----------+------+
5 rows in set (0.30 sec)







a. How many orders data is present in the database?
-> 10

b. How many customers are present in the database?
-> 7

c. How many salespeople are present in the database?
-> 5

d. On which date order with highest amount is placed?
->  (onum | amt     | odate      | cnum | snum)
    (3011 | 9891.88 | 1990-10-04 | 2006 | 1001)

e. For which order salesman got maximum commission? Hint: you need to refer data of two tables.
-> 3001

f. Which salesman are handling more than two customers? Hint: you need to refer data of two tables.
->  1001 | Peel, 1002 | Serres

g. Which city have single customer?
-> Berlin

h. Which city have multiple salespeople?
-> Rome and San Jose.

i. What is name of customer and salesman of the maximum amount order?
-> Salesman - Peel, Customer - Clemens







D3_56588>SELECT onum, amt, odate FROM orders;
+------+---------+------------+
| onum | amt     | odate      |
+------+---------+------------+
| 3001 |   18.69 | 1990-10-03 |
| 3003 |  767.19 | 1990-10-03 |
| 3002 | 1900.10 | 1990-10-03 |
| 3005 | 5160.45 | 1990-10-03 |
| 3006 | 1098.16 | 1990-10-03 |
| 3009 | 1713.23 | 1990-10-04 |
| 3007 |   75.75 | 1990-10-04 |
| 3008 | 4723.00 | 1990-10-04 |
| 3010 |  309.95 | 1990-10-04 |
| 3011 | 9891.88 | 1990-10-04 |
+------+---------+------------+
10 rows in set (0.00 sec)







D3_56588>SELECT * FROM salespeople;
+------+---------+-----------+------+
| snum | sname   | city      | comm |
+------+---------+-----------+------+
| 1001 | Peel    | London    | 0.12 |
| 1002 | Serres  | San Jose  | 0.13 |
| 1004 | Motika  | London    | 0.11 |
| 1007 | Rifkin  | Barcelona | 0.15 |
| 1003 | Axelrod | New York  | 0.10 |
+------+---------+-----------+------+
5 rows in set (0.00 sec)

D3_56588>SELECT city, sname, snum, comm FROM salespeople;
+-----------+---------+------+------+
| city      | sname   | snum | comm |
+-----------+---------+------+------+
| London    | Peel    | 1001 | 0.12 |
| San Jose  | Serres  | 1002 | 0.13 |
| London    | Motika  | 1004 | 0.11 |
| Barcelona | Rifkin  | 1007 | 0.15 |
| New York  | Axelrod | 1003 | 0.10 |
+-----------+---------+------+------+
5 rows in set (0.00 sec)









D3_56588>SELECT * FROM customers;
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

D3_56588>SELECT * FROM customers WHERE snum=1001;
+------+---------+--------+--------+------+
| cnum | cname   | city   | rating | snum |
+------+---------+--------+--------+------+
| 2001 | Hoffman | London |    100 | 1001 |
| 2006 | Clemens | London |    100 | 1001 |
+------+---------+--------+--------+------+
2 rows in set (0.10 sec)








D3_56588>SELECT * FROM customers;
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

D3_56588>SELECT city, cname, rating FROM customers WHERE city='San Jose';
+----------+----------+--------+
| city     | cname    | rating |
+----------+----------+--------+
| San Jose | Liu      |    200 |
| San Jose | Cisneros |    300 |
+----------+----------+--------+
2 rows in set (0.00 sec)









D3_56588>SELECT * FROM orders;
+------+---------+------------+------+------+
| onum | amt     | odate      | cnum | snum |
+------+---------+------------+------+------+
| 3001 |   18.69 | 1990-10-03 | 2008 | 1007 |
| 3003 |  767.19 | 1990-10-03 | 2001 | 1001 |
| 3002 | 1900.10 | 1990-10-03 | 2007 | 1004 |
| 3005 | 5160.45 | 1990-10-03 | 2003 | 1002 |
| 3006 | 1098.16 | 1990-10-03 | 2008 | 1007 |
| 3009 | 1713.23 | 1990-10-04 | 2002 | 1003 |
| 3007 |   75.75 | 1990-10-04 | 2004 | 1002 |
| 3008 | 4723.00 | 1990-10-04 | 2006 | 1001 |
| 3010 |  309.95 | 1990-10-04 | 2004 | 1002 |
| 3011 | 9891.88 | 1990-10-04 | 2006 | 1001 |
+------+---------+------------+------+------+
10 rows in set (0.00 sec)

D3_56588>SELECT DISTINCT snum FROM orders;
+------+
| snum |
+------+
| 1007 |
| 1001 |
| 1004 |
| 1002 |
| 1003 |
+------+
5 rows in set (0.02 sec)









D3_56588>SELECT * FROM orders;
+------+---------+------------+------+------+
| onum | amt     | odate      | cnum | snum |
+------+---------+------------+------+------+
| 3001 |   18.69 | 1990-10-03 | 2008 | 1007 |
| 3003 |  767.19 | 1990-10-03 | 2001 | 1001 |
| 3002 | 1900.10 | 1990-10-03 | 2007 | 1004 |
| 3005 | 5160.45 | 1990-10-03 | 2003 | 1002 |
| 3006 | 1098.16 | 1990-10-03 | 2008 | 1007 |
| 3009 | 1713.23 | 1990-10-04 | 2002 | 1003 |
| 3007 |   75.75 | 1990-10-04 | 2004 | 1002 |
| 3008 | 4723.00 | 1990-10-04 | 2006 | 1001 |
| 3010 |  309.95 | 1990-10-04 | 2004 | 1002 |
| 3011 | 9891.88 | 1990-10-04 | 2006 | 1001 |
+------+---------+------------+------+------+
10 rows in set (0.00 sec)

D3_56588>SELECT * FROM orders WHERE amt>1000;
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
6 rows in set (0.12 sec)








D3_56588>SELECT * FROM salespeople;
+------+---------+-----------+------+
| snum | sname   | city      | comm |
+------+---------+-----------+------+
| 1001 | Peel    | London    | 0.12 |
| 1002 | Serres  | San Jose  | 0.13 |
| 1004 | Motika  | London    | 0.11 |
| 1007 | Rifkin  | Barcelona | 0.15 |
| 1003 | Axelrod | New York  | 0.10 |
+------+---------+-----------+------+
5 rows in set (0.00 sec)

D3_56588>SELECT * FROM salespeople WHERE city='London' AND comm>0.10;
+------+--------+--------+------+
| snum | sname  | city   | comm |
+------+--------+--------+------+
| 1001 | Peel   | London | 0.12 |
| 1004 | Motika | London | 0.11 |
+------+--------+--------+------+
2 rows in set (0.00 sec)









D3_56588>SELECT * FROM customers;
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

D3_56588>SELECT * FROM customers WHERE NOT rating<=100 OR city = 'Rome';
+------+----------+----------+--------+------+
| cnum | cname    | city     | rating | snum |
+------+----------+----------+--------+------+
| 2002 | Giovanni | Rome     |    200 | 1003 |
| 2003 | Liu      | San Jose |    200 | 1002 |
| 2004 | Grass    | Berlin   |    300 | 1002 |
| 2008 | Cisneros | San Jose |    300 | 1007 |
| 2007 | Pereira  | Rome     |    100 | 1004 |
+------+----------+----------+--------+------+
5 rows in set (0.00 sec)









D3_56588>SELECT * FROM orders;
+------+---------+------------+------+------+
| onum | amt     | odate      | cnum | snum |
+------+---------+------------+------+------+
| 3001 |   18.69 | 1990-10-03 | 2008 | 1007 |
| 3003 |  767.19 | 1990-10-03 | 2001 | 1001 |
| 3002 | 1900.10 | 1990-10-03 | 2007 | 1004 |
| 3005 | 5160.45 | 1990-10-03 | 2003 | 1002 |
| 3006 | 1098.16 | 1990-10-03 | 2008 | 1007 |
| 3009 | 1713.23 | 1990-10-04 | 2002 | 1003 |
| 3007 |   75.75 | 1990-10-04 | 2004 | 1002 |
| 3008 | 4723.00 | 1990-10-04 | 2006 | 1001 |
| 3010 |  309.95 | 1990-10-04 | 2004 | 1002 |
| 3011 | 9891.88 | 1990-10-04 | 2006 | 1001 |
+------+---------+------------+------+------+
10 rows in set (0.00 sec)

D3_56588>SELECT * FROM orders WHERE amt != 0 OR amt != 'NULL';
+------+---------+------------+------+------+
| onum | amt     | odate      | cnum | snum |
+------+---------+------------+------+------+
| 3001 |   18.69 | 1990-10-03 | 2008 | 1007 |
| 3003 |  767.19 | 1990-10-03 | 2001 | 1001 |
| 3002 | 1900.10 | 1990-10-03 | 2007 | 1004 |
| 3005 | 5160.45 | 1990-10-03 | 2003 | 1002 |
| 3006 | 1098.16 | 1990-10-03 | 2008 | 1007 |
| 3009 | 1713.23 | 1990-10-04 | 2002 | 1003 |
| 3007 |   75.75 | 1990-10-04 | 2004 | 1002 |
| 3008 | 4723.00 | 1990-10-04 | 2006 | 1001 |
| 3010 |  309.95 | 1990-10-04 | 2004 | 1002 |
| 3011 | 9891.88 | 1990-10-04 | 2006 | 1001 |
+------+---------+------------+------+------+
10 rows in set, 1 warning (0.02 sec)









D3_56588>USE spj;
Database changed
D3_56588>SELECT * FROM S;
+------+-------+--------+--------+
| S#   | Sname | Status | City   |
+------+-------+--------+--------+
| S1   | Smith |     20 | London |
| S2   | Jones |     10 | Paris  |
| S3   | Blake |     30 | Paris  |
| S4   | Clark |     20 | London |
| S5   | Adams |     30 | Athens |
+------+-------+--------+--------+
5 rows in set (0.12 sec)










D3_56588>SELECT * FROM S;
+------+-------+--------+--------+
| S#   | Sname | Status | City   |
+------+-------+--------+--------+
| S1   | Smith |     20 | London |
| S2   | Jones |     10 | Paris  |
| S3   | Blake |     30 | Paris  |
| S4   | Clark |     20 | London |
| S5   | Adams |     30 | Athens |
+------+-------+--------+--------+
5 rows in set (0.12 sec)

D3_56588>SELECT `S#`,Sname FROM S;
+------+-------+
| S#   | Sname |
+------+-------+
| S1   | Smith |
| S2   | Jones |
| S3   | Blake |
| S4   | Clark |
| S5   | Adams |
+------+-------+
5 rows in set (0.00 sec)










D3_56588>SELECT * FROM P;
+------+-------+-------+--------+--------+
| P#   | Pname | Color | Weight | CITY   |
+------+-------+-------+--------+--------+
| P1   | Nut   | Red   |     12 | London |
| P2   | Bolt  | Green |     17 | Paris  |
| P3   | Screw | Blue  |     17 | Rome   |
| P4   | Screw | Red   |     14 | London |
| P5   | Cam   | Blue  |     12 | Paris  |
| P6   | Cog   | Red   |     19 | London |
+------+-------+-------+--------+--------+
6 rows in set (0.11 sec)

D3_56588>SELECT `P#`, Pname, Color, Weight, Weight*1000 Milligrams, Weight/1000 Kilograms, CITY FROM P;
+------+-------+-------+--------+------------+-----------+--------+
| P#   | Pname | Color | Weight | Milligrams | Kilograms | CITY   |
+------+-------+-------+--------+------------+-----------+--------+
| P1   | Nut   | Red   |     12 |      12000 |    0.0120 | London |
| P2   | Bolt  | Green |     17 |      17000 |    0.0170 | Paris  |
| P3   | Screw | Blue  |     17 |      17000 |    0.0170 | Rome   |
| P4   | Screw | Red   |     14 |      14000 |    0.0140 | London |
| P5   | Cam   | Blue  |     12 |      12000 |    0.0120 | Paris  |
| P6   | Cog   | Red   |     19 |      19000 |    0.0190 | London |
+------+-------+-------+--------+------------+-----------+--------+
6 rows in set (0.10 sec)









D3_56588>SELECT * FROM P;
+------+-------+-------+--------+--------+
| P#   | Pname | Color | Weight | CITY   |
+------+-------+-------+--------+--------+
| P1   | Nut   | Red   |     12 | London |
| P2   | Bolt  | Green |     17 | Paris  |
| P3   | Screw | Blue  |     17 | Rome   |
| P4   | Screw | Red   |     14 | London |
| P5   | Cam   | Blue  |     12 | Paris  |
| P6   | Cog   | Red   |     19 | London |
+------+-------+-------+--------+--------+
6 rows in set (0.11 sec)

D3_56588>SELECT Pname,Color FROM P WHERE CITY = 'London';
+-------+-------+
| Pname | Color |
+-------+-------+
| Nut   | Red   |
| Screw | Red   |
| Cog   | Red   |
+-------+-------+
3 rows in set (0.00 sec)








D3_56588>SELECT * FROM S;
+------+-------+--------+--------+
| S#   | Sname | Status | City   |
+------+-------+--------+--------+
| S1   | Smith |     20 | London |
| S2   | Jones |     10 | Paris  |
| S3   | Blake |     30 | Paris  |
| S4   | Clark |     20 | London |
| S5   | Adams |     30 | Athens |
+------+-------+--------+--------+
5 rows in set (0.00 sec)

D3_56588>SELECT * FROM S WHERE City = 'London';
+------+-------+--------+--------+
| S#   | Sname | Status | City   |
+------+-------+--------+--------+
| S1   | Smith |     20 | London |
| S4   | Clark |     20 | London |
+------+-------+--------+--------+
2 rows in set (0.00 sec)









D3_56588>SELECT * FROM S;
+------+-------+--------+--------+
| S#   | Sname | Status | City   |
+------+-------+--------+--------+
| S1   | Smith |     20 | London |
| S2   | Jones |     10 | Paris  |
| S3   | Blake |     30 | Paris  |
| S4   | Clark |     20 | London |
| S5   | Adams |     30 | Athens |
+------+-------+--------+--------+
5 rows in set (0.00 sec)

D3_56588>SELECT * FROM S WHERE City = 'Paris' OR City = 'Athens';
+------+-------+--------+--------+
| S#   | Sname | Status | City   |
+------+-------+--------+--------+
| S2   | Jones |     10 | Paris  |
| S3   | Blake |     30 | Paris  |
| S5   | Adams |     30 | Athens |
+------+-------+--------+--------+
3 rows in set (0.00 sec)









D3_56588>SELECT * FROM J;
+------+----------+--------+
| J#   | Jname    | City   |
+------+----------+--------+
| J1   | Sorter   | Paris  |
| J2   | Punch    | Rome   |
| J3   | Reader   | Athens |
| J4   | Console  | Athens |
| J5   | Collator | London |
| J6   | Terminal | Oslo   |
| J7   | Tape     | London |
+------+----------+--------+
7 rows in set (0.11 sec)

D3_56588>SELECT * FROM J WHERE City = 'Athens';
+------+---------+--------+
| J#   | Jname   | City   |
+------+---------+--------+
| J3   | Reader  | Athens |
| J4   | Console | Athens |
+------+---------+--------+
2 rows in set (0.00 sec)









D3_56588>SELECT * FROM P;
+------+-------+-------+--------+--------+
| P#   | Pname | Color | Weight | CITY   |
+------+-------+-------+--------+--------+
| P1   | Nut   | Red   |     12 | London |
| P2   | Bolt  | Green |     17 | Paris  |
| P3   | Screw | Blue  |     17 | Rome   |
| P4   | Screw | Red   |     14 | London |
| P5   | Cam   | Blue  |     12 | Paris  |
| P6   | Cog   | Red   |     19 | London |
+------+-------+-------+--------+--------+
6 rows in set (0.00 sec)

D3_56588>SELECT * FROM P WHERE Weight>=12 AND Weight<=14;
+------+-------+-------+--------+--------+
| P#   | Pname | Color | Weight | CITY   |
+------+-------+-------+--------+--------+
| P1   | Nut   | Red   |     12 | London |
| P4   | Screw | Red   |     14 | London |
| P5   | Cam   | Blue  |     12 | Paris  |
+------+-------+-------+--------+--------+
3 rows in set (0.00 sec)








D3_56588>SELECT * FROM S;
+------+-------+--------+--------+
| S#   | Sname | Status | City   |
+------+-------+--------+--------+
| S1   | Smith |     20 | London |
| S2   | Jones |     10 | Paris  |
| S3   | Blake |     30 | Paris  |
| S4   | Clark |     20 | London |
| S5   | Adams |     30 | Athens |
+------+-------+--------+--------+
5 rows in set (0.00 sec)

D3_56588>SELECT * FROM S WHERE Status>=20;
+------+-------+--------+--------+
| S#   | Sname | Status | City   |
+------+-------+--------+--------+
| S1   | Smith |     20 | London |
| S3   | Blake |     30 | Paris  |
| S4   | Clark |     20 | London |
| S5   | Adams |     30 | Athens |
+------+-------+--------+--------+
4 rows in set (0.00 sec)









D3_56588>SELECT * FROM S;
+------+-------+--------+--------+
| S#   | Sname | Status | City   |
+------+-------+--------+--------+
| S1   | Smith |     20 | London |
| S2   | Jones |     10 | Paris  |
| S3   | Blake |     30 | Paris  |
| S4   | Clark |     20 | London |
| S5   | Adams |     30 | Athens |
+------+-------+--------+--------+
5 rows in set (0.00 sec)

D3_56588>SELECT * FROM S WHERE City != 'London';
+------+-------+--------+--------+
| S#   | Sname | Status | City   |
+------+-------+--------+--------+
| S2   | Jones |     10 | Paris  |
| S3   | Blake |     30 | Paris  |
| S5   | Adams |     30 | Athens |
+------+-------+--------+--------+
3 rows in set (0.00 sec)









D3_56588>SELECT * FROM S;
+------+-------+--------+--------+
| S#   | Sname | Status | City   |
+------+-------+--------+--------+
| S1   | Smith |     20 | London |
| S2   | Jones |     10 | Paris  |
| S3   | Blake |     30 | Paris  |
| S4   | Clark |     20 | London |
| S5   | Adams |     30 | Athens |
+------+-------+--------+--------+
5 rows in set (0.00 sec)

D3_56588>SELECT DISTINCT City FROM S;
+--------+
| City   |
+--------+
| London |
| Paris  |
| Athens |
+--------+
3 rows in set (0.00 sec)









D3_56588>SELECT * FROM S;
+------+-------+--------+--------+
| S#   | Sname | Status | City   |
+------+-------+--------+--------+
| S1   | Smith |     20 | London |
| S2   | Jones |     10 | Paris  |
| S3   | Blake |     30 | Paris  |
| S4   | Clark |     20 | London |
| S5   | Adams |     30 | Athens |
+------+-------+--------+--------+
5 rows in set (0.00 sec)

D3_56588>SELECT * FROM S ORDER BY City DESC;
+------+-------+--------+--------+
| S#   | Sname | Status | City   |
+------+-------+--------+--------+
| S2   | Jones |     10 | Paris  |
| S3   | Blake |     30 | Paris  |
| S1   | Smith |     20 | London |
| S4   | Clark |     20 | London |
| S5   | Adams |     30 | Athens |
+------+-------+--------+--------+
5 rows in set (0.09 sec)








D3_56588>SELECT * FROM p;
+------+-------+-------+--------+--------+
| P#   | Pname | Color | Weight | CITY   |
+------+-------+-------+--------+--------+
| P1   | Nut   | Red   |     12 | London |
| P2   | Bolt  | Green |     17 | Paris  |
| P3   | Screw | Blue  |     17 | Rome   |
| P4   | Screw | Red   |     14 | London |
| P5   | Cam   | Blue  |     12 | Paris  |
| P6   | Cog   | Red   |     19 | London |
+------+-------+-------+--------+--------+
6 rows in set (0.00 sec)

D3_56588>SELECT * FROM P ORDER BY CITY ASC, Pname ASC;
+------+-------+-------+--------+--------+
| P#   | Pname | Color | Weight | CITY   |
+------+-------+-------+--------+--------+
| P6   | Cog   | Red   |     19 | London |
| P1   | Nut   | Red   |     12 | London |
| P4   | Screw | Red   |     14 | London |
| P2   | Bolt  | Green |     17 | Paris  |
| P5   | Cam   | Blue  |     12 | Paris  |
| P3   | Screw | Blue  |     17 | Rome   |
+------+-------+-------+--------+--------+
6 rows in set (0.00 sec)









D3_56588>SELECT * FROM S;
+------+-------+--------+--------+
| S#   | Sname | Status | City   |
+------+-------+--------+--------+
| S1   | Smith |     20 | London |
| S2   | Jones |     10 | Paris  |
| S3   | Blake |     30 | Paris  |
| S4   | Clark |     20 | London |
| S5   | Adams |     30 | Athens |
+------+-------+--------+--------+
5 rows in set (0.00 sec)

D3_56588>SELECT * FROM S WHERE Status>=10 AND Status<=20;
+------+-------+--------+--------+
| S#   | Sname | Status | City   |
+------+-------+--------+--------+
| S1   | Smith |     20 | London |
| S2   | Jones |     10 | Paris  |
| S4   | Clark |     20 | London |
+------+-------+--------+--------+
3 rows in set (0.00 sec)









D3_56588>SELECT Pname,Weight FROM P;
+-------+--------+
| Pname | Weight |
+-------+--------+
| Nut   |     12 |
| Bolt  |     17 |
| Screw |     17 |
| Screw |     14 |
| Cam   |     12 |
| Cog   |     19 |
+-------+--------+
6 rows in set (0.00 sec)

D3_56588>SELECT Pname,Weight FROM P WHERE Weight<=10 OR Weight>=15;
+-------+--------+
| Pname | Weight |
+-------+--------+
| Bolt  |     17 |
| Screw |     17 |
| Cog   |     19 |
+-------+--------+
3 rows in set (0.00 sec)









