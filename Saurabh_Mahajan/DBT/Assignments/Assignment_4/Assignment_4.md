Note: To solve below queries use “sales” database Use appropriate SQL functions to solve following queries. 

1. Write a query that counts all orders for October 3. 

D3_56588>USE sales;
Database changed

D3_56588>SELECT COUNT(onum) FROM orders WHERE odate = '1990-10-03';
+-------------+
| COUNT(onum) |
+-------------+
|           5 |
+-------------+
1 row in set (0.00 sec)










2. Write a query that counts the number of different non-NULL city values in the Customers table. 

D3_56588>SELECT COUNT(DISTINCT city) FROM customers WHERE city IS NOT NULL;
+----------------------+
| COUNT(DISTINCT city) |
+----------------------+
|                    4 |
+----------------------+
1 row in set (0.01 sec)










3. Find average commission of salespeople in London. 

D3_56588>SELECT AVG(comm) FROM salespeople;
+-----------+
| AVG(comm) |
+-----------+
|  0.122000 |
+-----------+
1 row in set (0.00 sec)










4. Extract cnum, cname and city from customer table if and only if one or more of the customers in the table are located in San Jose. 

D3_56588>SELECT cnum, cname, city FROM customers WHERE city='San Jose';
+------+----------+----------+
| cnum | cname    | city     |
+------+----------+----------+
| 2003 | Liu      | San Jose |
| 2008 | Cisneros | San Jose |
+------+----------+----------+
2 rows in set (0.00 sec)











Note: To solve below queries use “spj” database Use appropriate SQL functions to solve following queries. 

5. Display all the Suppliers, belonging to cities starting with the letter ‘L’.

D3_56588>SELECT Sname FROM S WHERE City LIKE 'L%';
+-------+
| Sname |
+-------+
| Smith |
| Clark |
+-------+
2 rows in set (0.03 sec)











6. Display all the Projects, with the third letter in JNAME as ‘n’.

D3_56588>SELECT Jname FROM J WHERE Jname LIKE '__n%';
+---------+
| Jname   |
+---------+
| Punch   |
| Console |
+---------+
2 rows in set (0.00 sec)











7. Display all the Supplier names with the initial letter capital.

D3_56588>SELECT CONCAT(UPPER(SUBSTR(Sname,1,1)), SUBSTR(Sname,2)) AS Sname FROM S;
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










8. Display all the Supplier names in upper case. 

D3_56588>SELECT UPPER(Sname) AS Sname FROM S;
+-------+
| Sname |
+-------+
| SMITH |
| JONES |
| BLAKE |
| CLARK |
| ADAMS |
+-------+
5 rows in set (0.00 sec)










9. Display all the Supplier names in lower case. 

D3_56588>SELECT LOWER(Sname) AS Sname FROM S;
+-------+
| Sname |
+-------+
| smith |
| jones |
| blake |
| clark |
| adams |
+-------+
5 rows in set (0.00 sec)










10. Display the Supplier names and the lengths of the names. 

D3_56588>SELECT Sname,LENGTH(Sname) FROM S;
+-------+---------------+
| Sname | LENGTH(Sname) |
+-------+---------------+
| Smith |             5 |
| Jones |             5 |
| Blake |             5 |
| Clark |             5 |
| Adams |             5 |
+-------+---------------+
5 rows in set (0.10 sec)










11. Display the current day (e.g. Thursday). 

D3_56588>SELECT DAYNAME(NOW());
+----------------+
| DAYNAME(NOW()) |
+----------------+
| Thursday       |
+----------------+
1 row in set (0.10 sec)










12. Display the minimum Status in the Supplier table. 

D3_56588>SELECT MIN(Status) FROM S;
+-------------+
| MIN(Status) |
+-------------+
|          10 |
+-------------+
1 row in set (0.00 sec)











13. Display the maximum Weight in the Parts table. 

D3_56588>SELECT MAX(Weight) FROM P;
+-------------+
| MAX(Weight) |
+-------------+
|          19 |
+-------------+
1 row in set (0.03 sec)











14. Display the average Weight of the Parts. 

D3_56588>SELECT AVG(Weight) FROM P;
+-------------+
| AVG(Weight) |
+-------------+
|     15.1667 |
+-------------+
1 row in set (0.00 sec)










15. Display the total Quantity sold for part ‘P1’. 

D3_56588>SELECT SUM(QTY) FROM sp WHERE `P#` = 'P1';
+----------+
| SUM(QTY) |
+----------+
|     1000 |
+----------+
1 row in set (0.02 sec)











16. Display all the Supplier names (with ‘la’ replaced by ‘ro’). 

D3_56588>SELECT REPLACE(Sname, 'la', 'ro') FROM S;
+----------------------------+
| REPLACE(Sname, 'la', 'ro') |
+----------------------------+
| Smith                      |
| Jones                      |
| Broke                      |
| Crork                      |
| Adams                      |
+----------------------------+
5 rows in set (0.00 sec)












17. Implement the above command such that ‘l’ is replaced with ‘r’ and ‘a’ is replaced with ‘o’.

D3_56588>SELECT REPLACE(REPLACE(Sname,'l','r'), 'a', 'o') FROM S;
+-------------------------------------------+
| REPLACE(REPLACE(Sname,'l','r'), 'a', 'o') |
+-------------------------------------------+
| Smith                                     |
| Jones                                     |
| Broke                                     |
| Crork                                     |
| Adoms                                     |
+-------------------------------------------+
5 rows in set (0.00 sec)











Note: To solve below queries use “sales” database *Use Group by clause with appropriate sql functions to solve following queries. 

1. Write a query on the Customers table that will find the highest rating in each city. Put the output in this form: For the city (city), the highest rating is: (rating). 

D3_56588>SELECT CONCAT('For the city', '(', city, '), the highest rating is : (', max(rating), ')') AS 'City Rating' FROM customers GROUP BY city;
+-------------------------------------------------------+
| City Rating                                           |
+-------------------------------------------------------+
| For the city(London), the highest rating is : (100)   |
| For the city(Rome), the highest rating is : (200)     |
| For the city(San Jose), the highest rating is : (300) |
| For the city(Berlin), the highest rating is : (300)   |
+-------------------------------------------------------+
4 rows in set (0.00 sec)










2. Write a query that totals the orders for each day and places the results in descending order. 

D3_56588>SELECT SUM(amt) FROM orders GROUP BY odate ORDER BY SUM(amt) DESC;
+----------+
| SUM(amt) |
+----------+
| 16713.81 |
|  8944.59 |
+----------+
2 rows in set (0.00 sec)











3. Write a query that selects the total amount in orders for each salesperson for whom this total is greater than the amount of the largest order in the table. 

D3_56588>SELECT SUM(amt) FROM orders GROUP BY snum HAVING SUM(amt) > (SELECT MAX(amt) FROM orders);
+----------+
| SUM(amt) |
+----------+
| 15382.07 |
+----------+
1 row in set (0.02 sec)












4. Write a query that selects the highest rating in each city. 

D3_56588>SELECT city, MAX(rating) AS Highest_Rating FROM customers GROUP BY city;
+----------+----------------+
| city     | Highest_Rating |
+----------+----------------+
| London   |            100 |
| Rome     |            200 |
| San Jose |            300 |
| Berlin   |            300 |
+----------+----------------+
4 rows in set (0.00 sec)











5. Largest order taken by each salesperson with order value more than Rs.3000.

D3_56588>SELECT snum, MAX(amt) FROM orders GROUP BY snum HAVING MAX(amt) > 3000;
+------+----------+
| snum | MAX(amt) |
+------+----------+
| 1001 |  9891.88 |
| 1002 |  5160.45 |
+------+----------+
2 rows in set (0.00 sec)











Note: To solve below queries use “hr” database * Use Group by clause with appropriate sql functions to solve following queries. 


6. Display manager ID and number of employees managed by the manager. 

D3_56588>SELECT MANAGER_ID,COUNT(EMPLOYEE_ID) FROM employees GROUP BY MANAGER_ID;
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
19 rows in set (0.03 sec)











7. Display the country ID and number of cities we have in the country. 

D3_56588>SELECT COUNTRY_ID, COUNT(CITY) AS 'City Count' FROM locations GROUP BY COUNTRY_ID;
+------------+------------+
| COUNTRY_ID | City Count |
+------------+------------+
| "          |          1 |
| AU         |          1 |
| BR         |          1 |
| CA         |          2 |
| CH         |          2 |
| CN         |          1 |
| DE         |          1 |
| IN         |          1 |
| IT         |          2 |
| JP         |          2 |
| NL         |          1 |
| Ox         |          1 |
| SG         |          1 |
| UK         |          2 |
| US         |          4 |
+------------+------------+
15 rows in set (0.00 sec)










8. Display average salary of employees in each department who have commission percentage. 

D3_56588>SELECT AVG(SALARY) AS 'Average Salary', DEPARTMENT_ID FROM employees WHERE COMMISSION_PCT != 0 GROUP BY DEPARTMENT_ID;
+----------------+---------------+
| Average Salary | DEPARTMENT_ID |
+----------------+---------------+
|    7000.000000 |             0 |
|    8955.882353 |            80 |
+----------------+---------------+
2 rows in set (0.00 sec)











9. Display job ID, number of employees, sum of salary, and difference between highest salary and lowest salary of the employees of the job. 

D3_56588>SELECT JOB_ID, COUNT(EMPLOYEE_ID) AS Employees, SUM(SALARY) AS 'Sum of Salaries', (MAX(SALARY) - MIN(SALARY)) AS Difference FROM employees GROUP BY JOB_ID;
+------------+-----------+-----------------+------------+
| JOB_ID     | Employees | Sum of Salaries | Difference |
+------------+-----------+-----------------+------------+
| AC_ACCOUNT |         1 |         8300.00 |       0.00 |
| AC_MGR     |         1 |        12000.00 |       0.00 |
| AD_ASST    |         1 |         4400.00 |       0.00 |
| AD_PRES    |         1 |        24000.00 |       0.00 |
| AD_VP      |         2 |        34000.00 |       0.00 |
| FI_ACCOUNT |         5 |        39600.00 |    2100.00 |
| FI_MGR     |         1 |        12000.00 |       0.00 |
| HR_REP     |         1 |         6500.00 |       0.00 |
| IT_PROG    |         5 |        28800.00 |    4800.00 |
| MK_MAN     |         1 |        13000.00 |       0.00 |
| MK_REP     |         1 |         6000.00 |       0.00 |
| PR_REP     |         1 |        10000.00 |       0.00 |
| PU_CLERK   |         5 |        13900.00 |     600.00 |
| PU_MAN     |         1 |        11000.00 |       0.00 |
| SA_MAN     |         5 |        61000.00 |    3500.00 |
| SA_REP     |        30 |       250500.00 |    5400.00 |
| SH_CLERK   |        20 |        64300.00 |    1700.00 |
| ST_CLERK   |        20 |        55700.00 |    1500.00 |
| ST_MAN     |         5 |        36400.00 |    2400.00 |
+------------+-----------+-----------------+------------+
19 rows in set (0.00 sec)










10. Display job ID for jobs with average salary more than 10000. 

D3_56588>SELECT JOB_ID FROM employees GROUP BY JOB_ID HAVING AVG(SALARY) > 10000;
+---------+
| JOB_ID  |
+---------+
| AC_MGR  |
| AD_PRES |
| AD_VP   |
| FI_MGR  |
| MK_MAN  |
| PU_MAN  |
| SA_MAN  |
+---------+
7 rows in set (0.00 sec)











11. Display years in which more than 10 employees joined. 

D3_56588>SELECT YEAR(HIRE_DATE), COUNT(EMPLOYEE_ID) FROM employees GROUP BY YEAR(HIRE_DATE);
+-----------------+--------------------+
| YEAR(HIRE_DATE) | COUNT(EMPLOYEE_ID) |
+-----------------+--------------------+
|            1987 |                107 |
+-----------------+--------------------+
1 row in set (0.00 sec)










12. Display departments in which more than five employees have commission percentage. 

D3_56588>SELECT department_id FROM employees WHERE commission_pct != NULL GROUP BY department_id HAVING COUNT(COMMISSION_PCT)>5;
+---------------+
| department_id |
+---------------+
|            80 |
+---------------+
1 rows in set (0.00 sec)











13. Display employee ID for employees who did more than one job in the past. 

D3_56588>SELECT EMPLOYEE_ID FROM job_history GROUP BY EMPLOYEE_ID HAVING COUNT(EMPLOYEE_ID) > 1;
+-------------+
| EMPLOYEE_ID |
+-------------+
|         101 |
|         176 |
|         200 |
+-------------+
3 rows in set (0.00 sec)









14. Display job ID of jobs that were done by more than 3 employees for more than 100 days. 

D3_56588>SELECT JOB_ID FROM job_history WHERE END_DATE - START_DATE > 100 GROUP BY JOB_ID HAVING COUNT(EMPLOYEE_ID) > 3;
Empty set (0.00 sec)












15. Display department ID, year, and Number of employees joined. 

D3_56588>SELECT DEPARTMENT_ID,YEAR(START_DATE) AS YEAR,COUNT(EMPLOYEE_ID) AS EMPLOYEES_JOINED FROM job_history GROUP BY YEAR(START_DATE);
+---------------+------+------------------+
| DEPARTMENT_ID | YEAR | EMPLOYEES_JOINED |
+---------------+------+------------------+
|            60 | 1993 |                2 |
|           110 | 1989 |                1 |
|            20 | 1996 |                1 |
|            50 | 1998 |                2 |
|            50 | 1999 |                2 |
|            90 | 1987 |                1 |
|            90 | 1994 |                1 |
|             0 |    0 |                1 |
+---------------+------+------------------+
8 rows in set (0.00 sec)










16. Display how many employees joined in each month of the current year. 

D3_56588>SELECT COUNT(EMPLOYEE_ID) AS NO_OF_EMPLOYEES, MONTH(HIRE_DATE) AS MONTH FROM employees GROUP BY MONTH(HIRE_DATE);
+-----------------+-------+
| NO_OF_EMPLOYEES | MONTH |
+-----------------+-------+
|              14 |     6 |
|              31 |     7 |
|              31 |     8 |
|              30 |     9 |
|               1 |    10 |
+-----------------+-------+
5 rows in set (0.00 sec)










17. Display details of departments in which the maximum salary is more than 10000.

D3_56588>SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID IN ( SELECT DEPARTMENT_ID FROM EMPLOYEES GROUP BY DEPARTMENT_ID HAVING MAX(SALARY)>10000);
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
6 rows in set (0.00 sec)