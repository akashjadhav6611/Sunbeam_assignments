QUESTION 1

root>CREATE DATABASE classwork;
ERROR 1007 (HY000): Can't create database 'classwork'; database exists
root>SHOW DATABASES;
+--------------------+
| Database           |
+--------------------+
| classwork          |
| information_schema |
| mysql              |
| performance_schema |
| spj                |
| sys                |
+--------------------+
6 rows in set (0.10 sec)

d2_56660>SELECT USER(),DATABASE();
+--------------------+------------+
| USER()             | DATABASE() |
+--------------------+------------+
| d2_56660@localhost | NULL       |
+--------------------+------------+
1 row in set (0.00 sec)

d2_56660>USE classwork;
Database changed
d2_56660>SOURCE D:\sujit\cdac\Sunbeam_notes\dbt\db\classwork-db.sql
Query OK, 0 rows affected, 1 warning (0.15 sec)

Query OK, 0 rows affected, 1 warning (0.04 sec)

Query OK, 0 rows affected, 1 warning (0.03 sec)

Query OK, 0 rows affected, 1 warning (0.01 sec)

Query OK, 0 rows affected, 1 warning (0.01 sec)

Query OK, 0 rows affected, 1 warning (0.01 sec)

Query OK, 0 rows affected, 2 warnings (0.88 sec)

Query OK, 1 row affected (0.17 sec)

Query OK, 1 row affected (0.13 sec)

Query OK, 1 row affected (0.07 sec)

Query OK, 1 row affected (0.08 sec)

Query OK, 1 row affected (0.11 sec)

Query OK, 1 row affected (0.08 sec)

Query OK, 1 row affected (0.08 sec)

Query OK, 1 row affected (0.02 sec)

Query OK, 1 row affected (0.02 sec)

Query OK, 1 row affected (0.02 sec)

Query OK, 1 row affected (0.03 sec)

Query OK, 1 row affected (0.02 sec)

Query OK, 1 row affected (0.02 sec)

Query OK, 0 rows affected, 1 warning (0.42 sec)

Query OK, 1 row affected (0.02 sec)

Query OK, 1 row affected (0.02 sec)

Query OK, 1 row affected (0.11 sec)

Query OK, 1 row affected (0.07 sec)

Query OK, 0 rows affected, 3 warnings (0.24 sec)

Query OK, 1 row affected (0.05 sec)

Query OK, 1 row affected (0.09 sec)

Query OK, 1 row affected (0.03 sec)

Query OK, 1 row affected (0.02 sec)

Query OK, 1 row affected (0.03 sec)

Query OK, 1 row affected (0.02 sec)

Query OK, 1 row affected (0.02 sec)

Query OK, 1 row affected (0.03 sec)

Query OK, 1 row affected (0.03 sec)

Query OK, 1 row affected (0.07 sec)

Query OK, 1 row affected (0.09 sec)

Query OK, 1 row affected (0.04 sec)

Query OK, 1 row affected (0.03 sec)

Query OK, 1 row affected (0.02 sec)

Query OK, 0 rows affected (0.19 sec)

Query OK, 0 rows affected (0.28 sec)

Query OK, 1 row affected (0.05 sec)

Query OK, 1 row affected (0.02 sec)

Query OK, 1 row affected (0.04 sec)

Query OK, 1 row affected (0.02 sec)

Query OK, 1 row affected (0.02 sec)

Query OK, 0 rows affected (0.42 sec)

Query OK, 1 row affected (0.03 sec)

******QUESTION 2*******


root>CREATE DATABASE hr;
Query OK, 1 row affected (0.10 sec)

root>GRANT ALL PRIVILEGES ON hr.*TO d2_56660;
Query OK, 0 rows affected (0.11 sec)

root>FLUSH PRIVILEGES;
Query OK, 0 rows affected (0.12 sec)

root>EXIT
Bye

d2_56660>USE hr;
Database changed
d2_56660>SELECT USER(),DATABASE();
+--------------------+------------+
| USER()             | DATABASE() |
+--------------------+------------+
| d2_56660@localhost | hr         |
+--------------------+------------+
1 row in set (0.00 sec)

d2_56660>SOURCE D:\sujit\cdac\Sunbeam_notes\dbt\db\hr-db.sql
Query OK, 0 rows affected (0.07 sec)

Query OK, 0 rows affected (0.03 sec)

Query OK, 0 rows affected (0.02 sec)

Query OK, 0 rows affected (0.00 sec)

Query OK, 0 rows affected (0.00 sec)

Query OK, 0 rows affected, 1 warning (0.02 sec)

Query OK, 0 rows affected (0.80 sec)

Query OK, 25 rows affected (0.08 sec)
Records: 25  Duplicates: 0  Warnings: 0

Query OK, 0 rows affected (0.13 sec)

Query OK, 27 rows affected (0.04 sec)
Records: 27  Duplicates: 0  Warnings: 0

Query OK, 0 rows affected (0.09 sec)

Query OK, 107 rows affected (0.13 sec)
Records: 107  Duplicates: 0  Warnings: 0

Query OK, 0 rows affected (0.09 sec)

Query OK, 11 rows affected (0.05 sec)
Records: 11  Duplicates: 0  Warnings: 0

Query OK, 0 rows affected (0.07 sec)

Query OK, 19 rows affected (0.02 sec)
Records: 19  Duplicates: 0  Warnings: 0

Query OK, 0 rows affected (0.07 sec)

Query OK, 23 rows affected (0.02 sec)
Records: 23  Duplicates: 0  Warnings: 0

Query OK, 0 rows affected (0.06 sec)

Query OK, 4 rows affected (0.02 sec)
Records: 4  Duplicates: 0  Warnings: 0

Query OK, 0 rows affected (0.00 sec)

Query OK, 0 rows affected (0.00 sec)

Query OK, 0 rows affected (0.00 sec)

d2_56660>SHOW TABLE;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '' at line 1
d2_56660>SHOW TABLES;
+--------------+
| Tables_in_hr |
+--------------+
| countries    |
| departments  |
| employees    |
| job_history  |
| jobs         |
| locations    |
| regions      |
+--------------+
7 rows in set (0.04 sec)


*****QUESTION 3******

root>CREATE DATABASE sales;
Query OK, 1 row affected (0.05 sec)

root>GRANT ALL PRIVILEGES ON sales.*TO d2_56660;
Query OK, 0 rows affected (0.12 sec)


d2_56660>USE sales;
Database changed
d2_56660>SOURCE D:\sujit\cdac\Sunbeam_notes\dbt\db\sales-db.sql
Query OK, 0 rows affected, 1 warning (0.54 sec)

Query OK, 0 rows affected, 3 warnings (0.19 sec)

Query OK, 0 rows affected, 3 warnings (0.17 sec)

Query OK, 1 row affected (0.09 sec)

Query OK, 1 row affected (0.10 sec)

Query OK, 1 row affected (0.08 sec)

Query OK, 1 row affected (0.08 sec)

Query OK, 1 row affected (0.10 sec)

Query OK, 1 row affected (0.11 sec)

Query OK, 1 row affected (0.08 sec)

Query OK, 1 row affected (0.08 sec)

Query OK, 1 row affected (0.14 sec)

Query OK, 1 row affected (0.10 sec)

Query OK, 1 row affected (0.04 sec)

Query OK, 1 row affected (0.05 sec)

Query OK, 1 row affected (0.03 sec)

Query OK, 1 row affected (0.04 sec)

Query OK, 1 row affected (0.05 sec)

Query OK, 1 row affected (0.02 sec)

Query OK, 1 row affected (0.02 sec)

Query OK, 1 row affected (0.02 sec)

Query OK, 1 row affected (0.06 sec)

Query OK, 1 row affected (0.02 sec)

Query OK, 1 row affected (0.07 sec)

Query OK, 1 row affected (0.02 sec)



****QUESTION 4*******


root>CREATE DATABASE northwind;
Query OK, 1 row affected (0.08 sec)

root>GRANT ALL PRIVILEGES ON northwind.*TO d2_56660;
Query OK, 0 rows affected (0.12 sec)

root>FLUSH PRIVILEGES;
Query OK, 0 rows affected (0.11 sec)

root>EXIT
Bye

d2_56660>USE northwind;
Database changed
d2_56660>SOURCE D:\sujit\cdac\Sunbeam_notes\dbt\db\northwind-db.sql
Query OK, 0 rows affected (0.00 sec)

Query OK, 0 rows affected (0.00 sec)

Query OK, 0 rows affected (0.00 sec)

Query OK, 0 rows affected (0.00 sec)

Query OK, 0 rows affected (0.00 sec)

Query OK, 0 rows affected, 1 warning (0.00 sec)

Query OK, 0 rows affected, 1 warning (1.46 sec)

Query OK, 1 row affected (0.17 sec)

Query OK, 1 row affected (0.10 sec)

Query OK, 1 row affected (0.11 sec)

Query OK, 1 row affected (0.07 sec)

Query OK, 1 row affected (0.10 sec)

Query OK, 1 row affected (0.09 sec)

Query OK, 1 row affected (0.06 sec)

Query OK, 1 row affected (0.20 sec)

Query OK, 0 rows affected (0.35 sec)

Query OK, 0 rows affected (0.40 sec)

Query OK, 0 rows affected (0.45 sec)

Query OK, 93 rows affected (0.03 sec)
Records: 93  Duplicates: 0  Warnings: 0

Query OK, 0 rows affected, 2 warnings (0.64 sec)

Query OK, 9 rows affected (0.06 sec)
Records: 9  Duplicates: 0  Warnings: 0

Query OK, 0 rows affected, 1 warning (0.28 sec)

Query OK, 49 rows affected (0.02 sec)
Records: 49  Duplicates: 0  Warnings: 0

Query OK, 0 rows affected, 4 warnings (0.21 sec)

Query OK, 1745 rows affected (0.58 sec)
Records: 1745  Duplicates: 0  Warnings: 0

Query OK, 410 rows affected (0.09 sec)
Records: 410  Duplicates: 0  Warnings: 0

Query OK, 0 rows affected, 3 warnings (0.42 sec)

Query OK, 270 rows affected (0.20 sec)
Records: 270  Duplicates: 0  Warnings: 0

Query OK, 273 rows affected (0.29 sec)
Records: 273  Duplicates: 0  Warnings: 0

Query OK, 272 rows affected (0.09 sec)
Records: 272  Duplicates: 0  Warnings: 0

Query OK, 15 rows affected (0.04 sec)
Records: 15  Duplicates: 0  Warnings: 0

Query OK, 0 rows affected, 6 warnings (1.03 sec)

Query OK, 77 rows affected (0.02 sec)
Records: 77  Duplicates: 0  Warnings: 0

Query OK, 0 rows affected, 1 warning (0.26 sec)

Query OK, 4 rows affected (0.03 sec)
Records: 4  Duplicates: 0  Warnings: 0

Query OK, 0 rows affected, 1 warning (0.54 sec)

Query OK, 3 rows affected (0.02 sec)
Records: 3  Duplicates: 0  Warnings: 0

Query OK, 0 rows affected, 1 warning (0.74 sec)

Query OK, 29 rows affected (0.15 sec)
Records: 29  Duplicates: 0  Warnings: 0

Query OK, 0 rows affected, 1 warning (0.54 sec)

Query OK, 53 rows affected (0.08 sec)
Records: 53  Duplicates: 0  Warnings: 0

Query OK, 0 rows affected (4.50 sec)
Records: 0  Duplicates: 0  Warnings: 0

Query OK, 9 rows affected (2.45 sec)
Records: 9  Duplicates: 0  Warnings: 0

Query OK, 49 rows affected (2.43 sec)
Records: 49  Duplicates: 0  Warnings: 0

Query OK, 2155 rows affected (2.13 sec)
Records: 2155  Duplicates: 0  Warnings: 0

Query OK, 830 rows affected (2.33 sec)
Records: 830  Duplicates: 0  Warnings: 0

Query OK, 77 rows affected (1.88 sec)
Records: 77  Duplicates: 0  Warnings: 0

Query OK, 53 rows affected (1.97 sec)
Records: 53  Duplicates: 0  Warnings: 0

Query OK, 0 rows affected (0.00 sec)

Query OK, 0 rows affected (0.00 sec)

Query OK, 0 rows affected (0.00 sec)

d2_56660>SHOW TABLES;
+----------------------+
| Tables_in_northwind  |
+----------------------+
| categories           |
| customercustomerdemo |
| customerdemographics |
| customers            |
| employees            |
| employeeterritories  |
| orderdetails         |
| orders               |
| products             |
| region               |
| shippers             |
| suppliers            |
| territories          |
+----------------------+
13 rows in set (0.09 sec)

d2_56660>


****question 5*****

d2_56660>SHOW TABLES;
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
7 rows in set (0.06 sec)

d2_56660>SELECT * FROM bonus;
Empty set (0.06 sec)

d2_56660>SELECT * FROM books;
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
13 rows in set (0.01 sec)

d2_56660>SELECT * FROM dept;
+--------+------------+----------+
| deptno | dname      | loc      |
+--------+------------+----------+
|     10 | ACCOUNTING | NEW YORK |
|     20 | RESEARCH   | DALLAS   |
|     30 | SALES      | CHICAGO  |
|     40 | OPERATIONS | BOSTON   |
+--------+------------+----------+
4 rows in set (0.05 sec)

d2_56660>SELECT * FROM dummy;
+-------+
| dummy |
+-------+
|     0 |
+-------+
1 row in set (0.02 sec)

d2_56660>SELECT * FROM emp;
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
14 rows in set (0.06 sec)

d2_56660>SELECT * FROM salgrade;
+-------+-------+-------+
| grade | losal | hisal |
+-------+-------+-------+
|     1 |   700 |  1200 |
|     2 |  1201 |  1400 |
|     3 |  1401 |  2000 |
|     4 |  2001 |  3000 |
|     5 |  3001 |  9999 |
+-------+-------+-------+
5 rows in set (0.04 sec)

d2_56660>SELECT * FROM stud;
+------+---------+-------+
| id   | name    | marks |
+------+---------+-------+
|    1 | Soham   |  98.2 |
|    2 | Sakshi  |  97.4 |
|    3 | Prisha  |  99.3 |
|    4 | Madhura | 96.29 |
|    5 | Om      | 97.45 |
+------+---------+-------+
5 rows in set (0.04 sec)

*****question 6****

d2_56660>SHOW TABLES;
+-----------------+
| Tables_in_sales |
+-----------------+
| customers       |
| orders          |
| salespeople     |
+-----------------+
3 rows in set (0.00 sec)

d2_56660>SELECT * FROM customers;
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
7 rows in set (0.04 sec)

d2_56660>SELECT * FROM orders;
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
10 rows in set (0.04 sec)

d2_56660>SELECT * FROM salespeople;
+------+---------+-----------+------+
| snum | sname   | city      | comm |
+------+---------+-----------+------+
| 1001 | Peel    | London    | 0.12 |
| 1002 | Serres  | San Jose  | 0.13 |
| 1004 | Motika  | London    | 0.11 |
| 1007 | Rifkin  | Barcelona | 0.15 |
| 1003 | Axelrod | New York  | 0.10 |
+------+---------+-----------+------+
5 rows in set (0.05 sec)



7. Login with your user name (d1_12345). List all tables in sales database. Display 
contents of all tables (one by one). Answer the following questions (by observations 
only – not queries).
a. How many orders data is present in the database?
ans-- 10

b. How many customers are present in the database?
ans--7

c. How many salespeople are present in the database?
ans-- 5

d. On which date order with highest amount is placed?
ans-- 1990-10-04

e. For which order salesman got maximum commission? Hint: you need to refer data 
of two tables.
ans-- 3011

f. Which salesman are handling more than two customers? Hint: you need to refer 
data of two tables
ans-- peel ,rifkin,serres

g. Which city have single customer?
ans-- Berlin

h. Which city have multiple salespeople?
ans--London

i. What is name of customer and salesman of the maximum amount order?
ans-- peel


9. Write a select command that produces the order number, amount, and date for all 
rows in the Orders table

d2_56660>SELECT onum, amt, odate FROM orders;
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



10.Write a query that displays the Salespeople table with the columns in the following 
order: city, sname, snum, comm

d2_56660>SELECT city, sname, snum, comm FROM salespeople;
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


11.Write a query that produces all rows from the Customers table for which the 
salesperson’s number is 1001.


d2_56660>SELECT * FROM customers WHERE snum = 1001;
+------+---------+--------+--------+------+
| cnum | cname   | city   | rating | snum |
+------+---------+--------+--------+------+
| 2001 | Hoffman | London |    100 | 1001 |
| 2006 | Clemens | London |    100 | 1001 |
+------+---------+--------+--------+------+
2 rows in set (0.03 sec)


12.Write a select command that produces the rating followed by the name of each 
customer in San Jose

d2_56660>SELECT rating , cname FROM customers WHERE city = 'San Jose';
+--------+----------+
| rating | cname    |
+--------+----------+
|    200 | Liu      |
|    300 | Cisneros |
+--------+----------+
2 rows in set (0.00 sec)


13.Write a query that will produce the snum values of all salespeople from the Orders 
table (with the duplicate values suppressed).

d2_56660>SELECT DISTINCT snum FROM orders;
+------+
| snum |
+------+
| 1007 |
| 1001 |
| 1004 |
| 1002 |
| 1003 |
+------+
5 rows in set (0.09 sec)


14.Write a query that will give you all orders for more than Rs. 1,000

d2_56660>SELECT * FROM orders WHERE amt>1000;
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
6 rows in set (0.04 sec)


15.Write a query that will give you the names and cities of all salespeople in London 
with a commission above 0.10.

d2_56660>SELECT sname,city FROM salespeople WHERE city = 'London' AND comm > 0.10;
+--------+--------+
| sname  | city   |
+--------+--------+
| Peel   | London |
| Motika | London |
+--------+--------+
2 rows in set (0.00 sec)


16.Write a query on the Customers table whose output will exclude all customers with 
a rating <= 100, unless they are located in Rome

d2_56660>SELECT * FROM customers WHERE NOT rating <=100 OR city = 'Rome';
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


17.Write a query that selects all orders except those with zeroes or NULLs in the amt 
field.

d2_56660>SELECT * FROM orders WHERE NOT amt = 0 OR amt = 'NULL';
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
10 rows in set, 1 warning (0.05 sec)


18.Display all the data from the S table.

d2_56660>SELECT * FROM s;
+------+-------+--------+--------+
| S#   | Sname | Status | City   |
+------+-------+--------+--------+
| S1   | Smith |     20 | London |
| S2   | Jones |     10 | Paris  |
| S3   | Blake |     30 | Paris  |
| S4   | Clark |     20 | London |
| S5   | Adams |     30 | Athens |
+------+-------+--------+--------+
5 rows in set (0.04 sec)


19.Display only the S# and SNAME fields from the S table

d2_56660>SELECT `S#` ,Sname FROM s;
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


20.Assuming that the Part Weight is in GRAMS, display the same in MILLIGRAMS and 
KILOGRAMS.

d2_56660>SELECT * ,Weight*1000 MILLIGRAMS,Weight/1000 KILOGRAMS FROM p;
+------+-------+-------+--------+--------+------------+-----------+
| P#   | Pname | Color | Weight | CITY   | MILLIGRAMS | KILOGRAMS |
+------+-------+-------+--------+--------+------------+-----------+
| P1   | Nut   | Red   |     12 | London |      12000 |    0.0120 |
| P2   | Bolt  | Green |     17 | Paris  |      17000 |    0.0170 |
| P3   | Screw | Blue  |     17 | Rome   |      17000 |    0.0170 |
| P4   | Screw | Red   |     14 | London |      14000 |    0.0140 |
| P5   | Cam   | Blue  |     12 | Paris  |      12000 |    0.0120 |
| P6   | Cog   | Red   |     19 | London |      19000 |    0.0190 |
+------+-------+-------+--------+--------+------------+-----------+
6 rows in set (0.06 sec)


21.Display the PNAME and COLOR from the P table for the CITY=”London”

d2_56660>SELECT Pname , Color FROM p WHERE CITY = 'London';
+-------+-------+
| Pname | Color |
+-------+-------+
| Nut   | Red   |
| Screw | Red   |
| Cog   | Red   |
+-------+-------+
3 rows in set (0.00 sec)

22.Display all the Suppliers from London

d2_56660>SELECT Sname FROM s WHERE CITY = 'London';
+-------+
| Sname |
+-------+
| Smith |
| Clark |
+-------+
2 rows in set (0.00 sec)


23.Display all the Suppliers from Paris or Athens.

d2_56660>SELECT Sname FROM s WHERE NOT CITY = 'London';
+-------+
| Sname |
+-------+
| Jones |
| Blake |
| Adams |
+-------+
3 rows in set (0.00 sec)


24.Display all the Projects in Athens

d2_56660>SELECT Sname FROM s WHERE CITY = 'Athens';
+-------+
| Sname |
+-------+
| Adams |
+-------+
1 row in set (0.00 sec)


25.Display all the Part names with the weight between 12 and 14 (inclusive of both).

d2_56660>SELECT Pname,Weight FROM p WHERE Weight>=12 AND Weight<=14;
+-------+--------+
| Pname | Weight |
+-------+--------+
| Nut   |     12 |
| Screw |     14 |
| Cam   |     12 |
+-------+--------+
3 rows in set (0.00 sec)


26.Display all the Suppliers with a Status greater than or equal to 20

d2_56660>SELECT Sname FROM s WHERE Status>=20;
+-------+
| Sname |
+-------+
| Smith |
| Blake |
| Clark |
| Adams |
+-------+
4 rows in set (0.00 sec)

27.Display all the Suppliers except the Suppliers from London

d2_56660>SELECT Sname FROM s WHERE NOT CITY = 'London';
+-------+
| Sname |
+-------+
| Jones |
| Blake |
| Adams |
+-------+
3 rows in set (0.00 sec)


28.Display only the Cities from where the Suppliers come from.

d2_56660>SELECT City FROM s;
+--------+
| City   |
+--------+
| London |
| Paris  |
| Paris  |
| London |
| Athens |
+--------+
5 rows in set (0.00 sec)


29.Display the Supplier table in the descending order of CITY.

d2_56660>SELECT *  FROM s ORDER BY City DESC;
+------+-------+--------+--------+
| S#   | Sname | Status | City   |
+------+-------+--------+--------+
| S2   | Jones |     10 | Paris  |
| S3   | Blake |     30 | Paris  |
| S1   | Smith |     20 | London |
| S4   | Clark |     20 | London |
| S5   | Adams |     30 | Athens |
+------+-------+--------+--------+
5 rows in set (0.04 sec)


30.Display the Part Table in the ascending order of CITY and within the city in the 
ascending order of Part names.

d2_56660>SELECT * FROM p ORDER BY city ,Pname;
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


31.Display all the Suppliers with a status between 10 and 20

d2_56660>SELECT Sname FROM s WHERE Status>10 AND Status<20;
Empty set (0.00 sec)

32.Display all the Parts and their Weight, which are not in the range of 10 and 15


d2_56660>SELECT Pname,Weight FROM p WHERE Weight<=10 OR Weight>=15;
+-------+--------+
| Pname | Weight |
+-------+--------+
| Bolt  |     17 |
| Screw |     17 |
| Cog   |     19 |
+-------+--------+
3 rows in set (0.00 sec)