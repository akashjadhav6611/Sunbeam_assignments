1. Write a query that counts all orders for October 3

d2_56660>SELECT COUNT(odate) FROM orders WHERE odate ='1990-10-03'
    -> ;
+--------------+
| COUNT(odate) |
+--------------+
|            5 |
+--------------+
1 row in set (0.17 sec)

2. Write a query that counts the number of different non-NULL city values in the Customers
table

d2_56660>SELECT COUNT(DISTINCT city) FROM customers;
+----------------------+
| COUNT(DISTINCT city) |
+----------------------+
|                    4 |
+----------------------+
1 row in set (0.03 sec)


3. Find average commission of salespeople in London

d2_56660>SELECT AVG(comm) FROM salespeople WHERE city='London';
+-----------+
| AVG(comm) |
+-----------+
|  0.115000 |
+-----------+
1 row in set (0.00 sec)


4. Extract cnum, cname and city from customer table if and only if one or more of the 
customers in the table are located in San Jose.
d2_56660>SELECT cnum, cname, city FROM customers WHERE (SELECT COUNT(CITY) FROM customers WHERE city='San Jose') >= 1;
+------+----------+----------+
| cnum | cname    | city     |
+------+----------+----------+
| 2001 | Hoffman  | London   |
| 2002 | Giovanni | Rome     |
| 2003 | Liu      | San Jose |
| 2004 | Grass    | Berlin   |
| 2006 | Clemens  | London   |
| 2008 | Cisneros | San Jose |
| 2007 | Pereira  | Rome     |
+------+----------+----------+
7 rows in set (0.04 sec)



5. Display all the Suppliers, belonging to cities starting with the letter ‘L’.

d2_56660>SELECT Sname FROM s WHERE City LIKE 'L%';
+-------+
| Sname |
+-------+
| Smith |
| Clark |
+-------+
2 rows in set (0.05 sec)

6. Display all the Projects, with the third letter in JNAME as ‘n

d2_56660>SELECT Jname FROM j WHERE Jname LIKE'__n%';
+---------+
| Jname   |
+---------+
| Punch   |
| Console |
+---------+
2 rows in set (0.00 sec)

7. Display all the Supplier names with the initial letter capital

d2_56660>SELECT CONCAT(UPPER(SUBSTR(Sname,1,1)),SUBSTR(Sname,2)) AS Sname FROM s;
+-------+
| Sname |
+-------+
| Smith |
| Jones |
| Blake |
| Clark |
| Adams |
+-------+
5 rows in set (0.00 sec)

8. Display all the Supplier names in upper case

d2_56660>SELECT UPPER(Sname) FROM s;
+--------------+
| UPPER(Sname) |
+--------------+
| SMITH        |
| JONES        |
| BLAKE        |
| CLARK        |
| ADAMS        |
+--------------+
5 rows in set (0.00 sec)

9. Display all the Supplier names in lower case

d2_56660>SELECT LOWER(Sname) FROM s;
+--------------+
| LOWER(Sname) |
+--------------+
| smith        |
| jones        |
| blake        |
| clark        |
| adams        |
+--------------+
5 rows in set (0.00 sec)

10. Display the Supplier names and the lengths of the names.

d2_56660>SELECT Sname,LENGTH(Sname) FROM s;
+-------+---------------+
| Sname | LENGTH(Sname) |
+-------+---------------+
| Smith |             5 |
| Jones |             5 |
| Blake |             5 |
| Clark |             5 |
| Adams |             5 |
+-------+---------------+
5 rows in set (0.05 sec)

11. Display the current day (e.g. Thursday).

d2_56660>SELECT DAYNAME(NOW());
+----------------+
| DAYNAME(NOW()) |
+----------------+
| Thursday       |
+----------------+
1 row in set (0.04 sec)

12. Display the minimum Status in the Supplier table

d2_56660>SELECT * FROM s ORDER BY Status ASC LIMIT 1;
+------+-------+--------+-------+
| S#   | Sname | Status | City  |
+------+-------+--------+-------+
| S2   | Jones |     10 | Paris |
+------+-------+--------+-------+
1 row in set (0.04 sec)

13. Display the maximum Weight in the Parts table.

d2_56660>SELECT MAX(Weight) FROM p;
+-------------+
| MAX(Weight) |
+-------------+
|          19 |
+-------------+
1 row in set (0.02 sec)

14. Display the average Weight of the Parts.

d2_56660>SELECT AVG(Weight) FROM p;
+-------------+
| AVG(Weight) |
+-------------+
|     15.1667 |
+-------------+
1 row in set (0.00 sec)

15. Display the total Quantity sold for part ‘P1’.

d2_56660>SELECT SUM(QTY) FROM sp WHERE `P#`='P1';
+----------+
| SUM(QTY) |
+----------+
|     1700 |
+----------+
1 row in set (0.00 sec)

16. Display all the Supplier names (with ‘la’ replaced by ‘ro’)

d2_56660>SELECT REPLACE(Sname,'la','ro') FROM s;
+--------------------------+
| REPLACE(Sname,'la','ro') |
+--------------------------+
| Smith                    |
| Jones                    |
| Broke                    |
| Crork                    |
| Adams                    |
+--------------------------+
5 rows in set (0.00 s

17. Implement the above command such that ‘l’ is replaced with ‘r’ and ‘a’ is replaced with 
‘o’

d2_56660>SELECT REPLACE(REPLACE(Sname,'l','r'),'a','o') FROM s;
+-----------------------------------------+
| REPLACE(REPLACE(Sname,'l','r'),'a','o') |
+-----------------------------------------+
| Smith                                   |
| Jones                                   |
| Broke                                   |
| Crork                                   |
| Adoms                                   |
+-----------------------------------------+
5 rows in set (0.00 sec)


****part 2****

1. Write a query on the Customers table that will find the highest rating in each city. Put the 
output in this form: For the city (city), the highest rating is: (rating)


d2_56660>SELECT CONCAT('For the', city,' the highest rating is :',MAX(rating)) AS Ratings FROM customers GROUP BY city;
+--------------------------------------------+
| Ratings                                    |
+--------------------------------------------+
| For theLondon the highest rating is :100   |
| For theRome the highest rating is :200     |
| For theSan Jose the highest rating is :300 |
| For theBerlin the highest rating is :300   |
+--------------------------------------------+
4 rows in set (0.00 sec)

2. Write a query that totals the orders for each day and places the results in descending 
order
d2_56660>SELECT odate, SUM(amt) FROM orders GROUP BY odate;
+------------+----------+
| odate      | SUM(amt) |
+------------+----------+
| 1990-10-03 |  8944.59 |
| 1990-10-04 | 16713.81 |
+------------+----------+
2 rows in set (0.00 sec)


3. Write a query that selects the total amount in orders for each salesperson for whom this 
total is greater than the amount of the largest order in the table.
d2_56660>SELECT snum,SUM(amt) FROM orders GROUP BY snum HAVING SUM(amt)>9891.88;
+------+----------+
| snum | SUM(amt) |
+------+----------+
| 1001 | 15382.07 |
+------+----------+
1 row in set (0.00 sec)

4. Write a query that selects the highest rating in each city.

d2_56660>SELECT city,MAX(rating) FROM customers GROUP BY city;
+----------+-------------+
| city     | MAX(rating) |
+----------+-------------+
| London   |         100 |
| Rome     |         200 |
| San Jose |         300 |
| Berlin   |         300 |
+----------+-------------+
4 rows in set (0.00 sec)

5. Largest order taken by each salesperson with order value more than Rs.3000.

d2_56660>SELECT snum, MAX(amt) FROM orders GROUP BY snum HAVING MAX(amt)>3000;
+------+----------+
| snum | MAX(amt) |
+------+----------+
| 1001 |  9891.88 |
| 1002 |  5160.45 |
+------+----------+
2 rows in set (0.00 sec)

6. Display manager ID and number of employees managed by the manager.

d2_56660>SELECT MANAGER_ID,COUNT(EMPLOYEE_ID) FROM employees GROUP BY MANAGER_ID;
+------------+--------------------+
| MANAGER_ID | COUNT(EMPLOYEE_ID) |
+------------+--------------------+
|          0 |                  1 |
|        100 |                 14 |
|        101 |                  5 |
|        102 |                  1 |
|        103 |                  4 |
|        108 |                  5 |
|        114 |                  5 |
|        120 |                  8 |
|        121 |                  8 |
|        122 |                  8 |
|        123 |                  8 |
|        124 |                  8 |
|        145 |                  6 |
|        146 |                  6 |
|        147 |                  6 |
|        148 |                  6 |
|        149 |                  6 |
|        201 |                  1 |
|        205 |                  1 |
+------------+--------------------+
19 rows in set (0.10 sec)

7. Display the country ID and number of cities we have in the country

d2_56660>SELECT COUNTRY_ID , COUNT(CITY) FROM locations GROUP BY COUNTRY_ID;
+------------+-------------+
| COUNTRY_ID | COUNT(CITY) |
+------------+-------------+
| "          |           1 |
| AU         |           1 |
| BR         |           1 |
| CA         |           2 |
| CH         |           2 |
| CN         |           1 |
| DE         |           1 |
| IN         |           1 |
| IT         |           2 |
| JP         |           2 |
| NL         |           1 |
| Ox         |           1 |
| SG         |           1 |
| UK         |           2 |
| US         |           4 |
+------------+-------------+
15 rows in set (0.00 sec)

8. Display average salary of employees in each department who have commission 
percentage.

d2_56660>SELECT DEPARTMENT_ID,AVG(SALARY) FROM employees WHERE COMMISSION_PCT !=0 GROUP BY DEPARTMENT_ID;
+---------------+-------------+
| DEPARTMENT_ID | AVG(SALARY) |
+---------------+-------------+
|             0 | 7000.000000 |
|            80 | 8955.882353 |
+---------------+-------------+
2 rows in set (0.00 sec)


9. Display job ID, number of employees, sum of salary, and difference between highest 
salary and lowest salary of the employees of the job.

d2_56660>SELECT JOB_ID,COUNT(EMPLOYEE_ID) ,SUM(SALARY) ,MAX(SALARY)-MIN(SALARY) AS DIFF FROM employees GROUP BY JOB_ID;
+------------+--------------------+-------------+---------+
| JOB_ID     | COUNT(EMPLOYEE_ID) | SUM(SALARY) | DIFF    |
+------------+--------------------+-------------+---------+
| AC_ACCOUNT |                  1 |     8300.00 |    0.00 |
| AC_MGR     |                  1 |    12000.00 |    0.00 |
| AD_ASST    |                  1 |     4400.00 |    0.00 |
| AD_PRES    |                  1 |    24000.00 |    0.00 |
| AD_VP      |                  2 |    34000.00 |    0.00 |
| FI_ACCOUNT |                  5 |    39600.00 | 2100.00 |
| FI_MGR     |                  1 |    12000.00 |    0.00 |
| HR_REP     |                  1 |     6500.00 |    0.00 |
| IT_PROG    |                  5 |    28800.00 | 4800.00 |
| MK_MAN     |                  1 |    13000.00 |    0.00 |
| MK_REP     |                  1 |     6000.00 |    0.00 |
| PR_REP     |                  1 |    10000.00 |    0.00 |
| PU_CLERK   |                  5 |    13900.00 |  600.00 |
| PU_MAN     |                  1 |    11000.00 |    0.00 |
| SA_MAN     |                  5 |    61000.00 | 3500.00 |
| SA_REP     |                 30 |   250500.00 | 5400.00 |
| SH_CLERK   |                 20 |    64300.00 | 1700.00 |
| ST_CLERK   |                 20 |    55700.00 | 1500.00 |
| ST_MAN     |                  5 |    36400.00 | 2400.00 |
+------------+--------------------+-------------+---------+
19 rows in set (0.00 sec)

10. Display job ID for jobs with average salary more than 10000.

d2_56660>SELECT JOB_ID ,AVG(SALARY) FROM employees GROUP BY JOB_ID HAVING AVG(SALARY)>10000;
+---------+--------------+
| JOB_ID  | AVG(SALARY)  |
+---------+--------------+
| AC_MGR  | 12000.000000 |
| AD_PRES | 24000.000000 |
| AD_VP   | 17000.000000 |
| FI_MGR  | 12000.000000 |
| MK_MAN  | 13000.000000 |
| PU_MAN  | 11000.000000 |
| SA_MAN  | 12200.000000 |
+---------+--------------+
7 rows in set (0.00 sec)

11. Display years in which more than 10 employees joined.

d2_56660>SELECT YEAR(HIRE_DATE),COUNT(EMPLOYEE_ID) FROM employees GROUP BY YEAR(HIRE_DATE);
+-----------------+--------------------+
| YEAR(HIRE_DATE) | COUNT(EMPLOYEE_ID) |
+-----------------+--------------------+
|            1987 |                107 |
+-----------------+--------------------+
1 row in set (0.00 sec)

12. Display departments in which more than five employees have commission percentage.

d2_56660>SELECT DEPARTMENT_ID FROM employees WHERE COMMISSION_PCT!=0 GROUP BY DEPARTMENT_ID HAVING COUNT(COMMISSION_PCT)>5;
+---------------+
| DEPARTMENT_ID |
+---------------+
|            80 |
+---------------+
1 row in set (0.01 s

13. Display employee ID for employees who did more than one job in the past

d2_56660>SELECT EMPLOYEE_ID,COUNT(JOB_ID) FROM job_history GROUP BY EMPLOYEE_ID HAVING COUNT(JOB_ID)>1;
+-------------+---------------+
| EMPLOYEE_ID | COUNT(JOB_ID) |
+-------------+---------------+
|         101 |             2 |
|         176 |             2 |
|         200 |             2 |
+-------------+---------------+
3 rows in set (0.00 sec)

14. Display job ID of jobs that were done by more than 3 employees for more than 100 
days.

d2_56660>SELECT JOB_ID,COUNT(EMPLOYEE_ID) FROM job_history WHERE (END_DATE-START_DATE)>100 GROUP BY JOB_ID HAVING COUNT(EMPLOYEE_ID)>3;
Empty set (0.00 sec)

16. Display how many employees joined in each month of the current year.

d2_56660>SELECT COUNT(EMPLOYEE_ID),MONTHNAME(HIRE_DATE) AS MONTH FROM employees GROUP BY MONTHNAME(HIRE_DATE);
+--------------------+-----------+
| COUNT(EMPLOYEE_ID) | MONTH     |
+--------------------+-----------+
|                 14 | June      |
|                 31 | July      |
|                 31 | August    |
|                 30 | September |
|                  1 | October   |
+--------------------+-----------+
5 rows in set (0.00 sec)

17. Display details of departments in which the maximum salary is more than 10000

d2_56660>SELECT * FROM departments WHERE DEPARTMENT_ID IN(SELECT DEPARTMENT_ID FROM employees GROUP BY DEPARTMENT_ID HAVING MAX(SALARY)>10000);
+---------------+-----------------+------------+-------------+
| DEPARTMENT_ID | DEPARTMENT_NAME | MANAGER_ID | LOCATION_ID |
+---------------+-----------------+------------+-------------+
|            20 | Marketing       |        201 |        1800 |
|            30 | Purchasing      |        114 |        1700 |
|            80 | Sales           |        145 |        2500 |
|            90 | Executive       |        100 |        1700 |
|           100 | Finance         |        108 |        1700 |
|           110 | Accounting      |        205 |        1700 |
+---------------+-----------------+------------+-------------+
6 rows in set (0.04 sec)