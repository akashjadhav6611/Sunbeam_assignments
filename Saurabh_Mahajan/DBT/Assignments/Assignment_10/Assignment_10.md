Note: use “classwork” database to solve below queries


Use ALTER statement to solve following problems.


1. Write a SQL statement to rename the table EMP to EMPLOYEE.
```SQL
D3_56588>ALTER TABLE emp RENAME TO employee;
Query OK, 0 rows affected (1.88 sec)

```













2. Write a SQL statement to add a column region to the table DEPT.

```SQL
D3_56588>ALTER TABLE dept ADD COLUMN region CHAR(20);
Query OK, 0 rows affected (1.74 sec)
Records: 0  Duplicates: 0  Warnings: 0

D3_56588>DESCRIBE dept;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| deptno | int         | YES  |     | NULL    |       |
| dname  | varchar(40) | YES  |     | NULL    |       |
| loc    | varchar(40) | YES  |     | NULL    |       |
| region | char(20)    | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
4 rows in set (0.12 sec)

```













3. Write a SQL statement to add a dummy_ID as the first column of the table DUMMY.


```SQL
D3_56588>ALTER TABLE dummy ADD COLUMN dummy_ID INT FIRST;
Query OK, 0 rows affected (4.19 sec)
Records: 0  Duplicates: 0  Warnings: 0

D3_56588>DESCRIBE dummy;
+----------+------+------+-----+---------+-------+
| Field    | Type | Null | Key | Default | Extra |
+----------+------+------+-----+---------+-------+
| dummy_ID | int  | YES  |     | NULL    |       |
| dummy    | int  | YES  |     | NULL    |       |
+----------+------+------+-----+---------+-------+
2 rows in set (0.04 sec)


```











4. Write a SQL statement to change the data type of the column sal to float in the table EMP.

```SQL
D3_56588>ALTER TABLE employee MODIFY sal FLOAT;
Query OK, 14 rows affected (1.88 sec)
Records: 14  Duplicates: 0  Warnings: 0

D3_56588>DESCRIBE employee;
+--------+--------------+------+-----+---------+-------+
| Field  | Type         | Null | Key | Default | Extra |
+--------+--------------+------+-----+---------+-------+
| empno  | int          | YES  |     | NULL    |       |
| ename  | varchar(40)  | YES  |     | NULL    |       |
| job    | varchar(40)  | YES  |     | NULL    |       |
| mgr    | int          | YES  |     | NULL    |       |
| hire   | date         | YES  |     | NULL    |       |
| sal    | float        | YES  |     | NULL    |       |
| comm   | decimal(8,2) | YES  |     | NULL    |       |
| deptno | int          | YES  |     | NULL    |       |
+--------+--------------+------+-----+---------+-------+
8 rows in set (0.11 sec)


```












5. Write a SQL statement to drop the column region from the table DEPT.

```SQL
D3_56588>ALTER TABLE dept DROP COLUMN region;
Query OK, 0 rows affected (4.15 sec)
Records: 0  Duplicates: 0  Warnings: 0

D3_56588>DESCRIBE dept;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| deptno | int         | YES  |     | NULL    |       |
| dname  | varchar(40) | YES  |     | NULL    |       |
| loc    | varchar(40) | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
3 rows in set (0.03 sec)


```











PL-SQL


1. Write a procedure that computes the perimeter and the area of a rectangle. Define your own values for the length and width. (Assuming that L and W are the length and width of the rectangle, Perimeter = 2*(L+W) and Area = L*W.

```SQL
D3_56588>SOURCE F:/Gitlab/DBT/assignment/Assignment_10/PL_SQL_1.sql
Query OK, 0 rows affected, 1 warning (0.16 sec)

D3_56588>CALL rect(5,2);
+------+-----------+
| AREA | PERIMETER |
+------+-----------+
|   10 |        14 |
+------+-----------+
1 row in set (0.02 sec)


```








2. Write a procedure that declares an integer variable called num, assigns a value to it, and computes and inserts into the temp table the value of the variable itself, its square, and its cube.

```SQL
D3_56588>SOURCE F:\Gitlab\DBT\assignment\Assignment_10\PL_SQL_2.sql
Query OK, 0 rows affected, 1 warning (0.13 sec)

Query OK, 0 rows affected (0.11 sec)

D3_56588>SELECT * FROM temp;
+------+------+------+
| num  | sq   | cu   |
+------+------+------+
|    5 |   25 |  125 |
|    6 |   36 |  216 |
|    4 |   16 |   64 |
+------+------+------+
3 rows in set (0.00 sec)


```










3. Create a procedure to Convert a temperature in Fahrenheit (F) to its equivalent in Celsius (C) and vice versa. The required formulae are:- C= (F-32)*5/9 F= 9/5*C + 32

```SQL
D3_56588>SOURCE F:\Gitlab\DBT\assignment\Assignment_10\PL_SQL_3_1.sql
Query OK, 0 rows affected, 1 warning (0.01 sec)

Query OK, 0 rows affected (0.10 sec)

D3_56588>CALL c_to_f(100);
+---------+-----------+
| CELSIUS | FARENHEIT |
+---------+-----------+
|     100 |       212 |
+---------+-----------+
1 row in set (0.16 sec)

Query OK, 0 rows affected (0.16 sec)



D3_56588>SOURCE F:\Gitlab\DBT\assignment\Assignment_10\PL_SQL_3_2.sql
Query OK, 0 rows affected (0.33 sec)

Query OK, 0 rows affected (0.10 sec)

D3_56588>CALL f_to_c(212);
+-----------+---------+
| FARENHEIT | CELSIUS |
+-----------+---------+
|       212 |     100 |
+-----------+---------+
1 row in set (0.09 sec)

Query OK, 0 rows affected (0.09 sec)



```









4. Create a procedure to Convert a number of inches into yards, feet, and inches. For example, 124 inches equals 3 yards, 1 foot, and 4 inches.

```SQL
D3_56588>SOURCE F:\Gitlab\DBT\assignment\Assignment_10\PL_SQL_4.sql
Query OK, 0 rows affected, 1 warning (0.16 sec)

Query OK, 0 rows affected (0.18 sec)

D3_56588>CALL i_conv(124);
+--------------+------+------+------+
| INCHES_GIVEN | YARD | FOOT | INCH |
+--------------+------+------+------+
|          124 |    3 |    1 |    4 |
+--------------+------+------+------+
1 row in set (0.00 sec)

Query OK, 0 rows affected (0.03 sec)

```











5. Create a procedure that takes department ID and changes the manager ID for the department to the employee in the department with lowest salary.

```SQL
D3_56588>USE hr;
Database changed

D3_56588>SOURCE F:\Gitlab\DBT\assignment\Assignment_10\PL_SQL_5.sql
Query OK, 0 rows affected, 1 warning (0.05 sec)

Query OK, 0 rows affected (0.14 sec)


D3_56588>CALL changemid(80);
Query OK, 1 row affected (0.13 sec)




```







