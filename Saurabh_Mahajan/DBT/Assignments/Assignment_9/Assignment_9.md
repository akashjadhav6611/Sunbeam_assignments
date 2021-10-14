Note: To solve below queries use “sales” database


Create appropriate indexes to solve following problems.


1. Create an index that will enable a user to pull orders for ‘1990-10-03’ out of the Orders table quickly.

```SQL
D3_56588>EXPLAIN FORMAT=JSON
SELECT * FROM orders WHERE odate = '1990-10-03';
--"query_cost": "1.25"

D3_56588>CREATE INDEX date ON orders(odate);
Query OK, 0 rows affected (1.86 sec)

D3_56588>EXPLAIN FORMAT=JSON
SELECT * FROM orders WHERE odate = '1990-10-03';
--"query_cost": "1.00"


```














2. If the Orders table has already been created, how can you force the onum field to be unique (assume all current values are unique)?

```SQL

D3_56588>EXPLAIN FORMAT=JSON
SELECT * FROM orders WHERE onum = 3002;
--"query_cost": "1.25"

D3_56588>CREATE UNIQUE INDEX order_num ON orders(onum);
Query OK, 0 rows affected (0.96 sec)
Records: 0  Duplicates: 0  Warnings: 0

D3_56588>EXPLAIN FORMAT=JSON
SELECT * FROM orders WHERE onum = 3002;
--"query_cost": "1.00"

```














3. Create an index that would permit salesperson to retrieve his orders.

```SQL

D3_56588>EXPLAIN FORMAT=JSON
SELECT * FROM orders WHERE snum = 1001;
--"query_cost": "1.25"

D3_56588>CREATE INDEX salesperson_number ON orders(snum);
Query OK, 0 rows affected (0.57 sec)
Records: 0  Duplicates: 0  Warnings: 0

D3_56588>EXPLAIN FORMAT=JSON
SELECT * FROM orders WHERE snum = 1001;
--"query_cost": "0.80"

```














4. Create an index to speed up searching order on a given date by given customer.

```SQL
D3_56588>EXPLAIN FORMAT=JSON
SELECT * FROM orders WHERE cnum = 2006 AND odate = '1990-10-04';
-- "query_cost": "1.00"

D3_56588>CREATE INDEX date_cus ON orders(odate, cnum);
Query OK, 0 rows affected (1.17 sec)
Records: 0  Duplicates: 0  Warnings: 0

D3_56588>EXPLAIN FORMAT=JSON
SELECT * FROM orders WHERE cnum = 2006 AND odate = '1990-10-04';
--"query_cost": "0.70"


```












Note: use “sales” database to solve below queries


Implement following constraints as given in question.


5. Write a SQL statement to add a primary key for the columns SNUM in the SALESPEOPLE table.

```SQL

D3_56588>EXPLAIN FORMAT=JSON
SELECT * FROM salespeople WHERE snum = 1007;
--"query_cost": "0.75"

D3_56588>ALTER TABLE salespeople ADD PRIMARY KEY(snum);
Query OK, 0 rows affected (3.33 sec)
Records: 0  Duplicates: 0  Warnings: 0

D3_56588>EXPLAIN FORMAT=JSON
SELECT * FROM salespeople WHERE snum = 1007;
--"query_cost": "1.00"


D3_56588>DESCRIBE salespeople;
+-------+--------------+------+-----+---------+-------+
| Field | Type         | Null | Key | Default | Extra |
+-------+--------------+------+-----+---------+-------+
| snum  | int          | NO   | PRI | NULL    |       |
| sname | varchar(10)  | YES  |     | NULL    |       |
| city  | varchar(10)  | YES  |     | NULL    |       |
| comm  | decimal(3,2) | YES  |     | NULL    |       |
+-------+--------------+------+-----+---------+-------+
4 rows in set (0.00 sec)

```









6. Write a SQL statement to add a primary key for the columns CNUM in the CUSTOMERS table.

```SQL

D3_56588>EXPLAIN FORMAT=JSON
SELECT * FROM customers WHERE cnum = 2006;
--"query_cost": "0.95"

D3_56588>ALTER TABLE customers ADD PRIMARY KEY(cnum);
Query OK, 0 rows affected (3.24 sec)
Records: 0  Duplicates: 0  Warnings: 0

D3_56588>EXPLAIN FORMAT=JSON
SELECT * FROM customers WHERE cnum = 2006;
--"query_cost": "1.00"

D3_56588>DESCRIBE customers;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| cnum   | int         | NO   | PRI | NULL    |       |
| cname  | varchar(10) | YES  |     | NULL    |       |
| city   | varchar(10) | YES  |     | NULL    |       |
| rating | int         | YES  |     | NULL    |       |
| snum   | int         | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
5 rows in set (1.55 sec)

```









7. Create DEPT table with deptno as Primary Key.

```SQL

D3_56588>CREATE TABLE DEPT(
    -> deptno INT PRIMARY KEY,
    -> deptname CHAR(20) UNIQUE NOT NULL,
    -> deptid CHAR(5) UNIQUE NOT NULL);
Query OK, 0 rows affected (1.33 sec)

D3_56588>INSERT INTO DEPT VALUES (10 ,'Marketing', 'MKT');
Query OK, 1 row affected (0.14 sec)

D3_56588>INSERT INTO DEPT VALUES (20 ,'Purchasing', 'PSG');
Query OK, 1 row affected (0.20 sec)

D3_56588>INSERT INTO DEPT VALUES (30 ,'Sales', 'SAL');
Query OK, 1 row affected (0.26 sec)

D3_56588>INSERT INTO DEPT VALUES (40 ,'Executive', 'EXT');
Query OK, 1 row affected (0.11 sec)

D3_56588>INSERT INTO DEPT VALUES (50 ,'Accounting', 'ACC');
Query OK, 1 row affected (0.05 sec)

D3_56588>SELECT * FROM DEPT;
+--------+------------+--------+
| deptno | deptname   | deptid |
+--------+------------+--------+
|     10 | Marketing  | MKT    |
|     20 | Purchasing | PSG    |
|     30 | Sales      | SAL    |
|     40 | Executive  | EXT    |
|     50 | Accounting | ACC    |
+--------+------------+--------+
5 rows in set (0.00 sec)

D3_56588>DESCRIBE DEPT;
+----------+----------+------+-----+---------+-------+
| Field    | Type     | Null | Key | Default | Extra |
+----------+----------+------+-----+---------+-------+
| deptno   | int      | NO   | PRI | NULL    |       |
| deptname | char(20) | NO   | UNI | NULL    |       |
| deptid   | char(5)  | NO   | UNI | NULL    |       |
+----------+----------+------+-----+---------+-------+
3 rows in set (0.05 sec)

```











