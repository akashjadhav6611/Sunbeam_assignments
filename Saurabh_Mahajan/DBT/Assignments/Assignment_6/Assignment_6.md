Note: To solve below queries use “sales” database *Use appropriate joins to solve following queries.


1. Write a query that lists each order number followed by the name of the customer who made the order.

D3_56588>SELECT o.onum,c.cname FROM orders o INNER JOIN customers c ON o.cnum = c.cnum;
+------+----------+
| onum | cname    |
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

D3_56588>SELECT o.onum,s.sname,c.cname FROM orders o INNER JOIN salespeople s ON s.snum=o.snum INNER JOIN customers c ON o.cnum=c.cnum;
+------+---------+----------+
| onum | sname   | cname    |
+------+---------+----------+
| 3003 | Peel    | Hoffman  |
| 3009 | Axelrod | Giovanni |
| 3005 | Serres  | Liu      |
| 3010 | Serres  | Grass    |
| 3007 | Serres  | Grass    |
| 3011 | Peel    | Clemens  |
| 3008 | Peel    | Clemens  |
| 3006 | Rifkin  | Cisneros |
| 3001 | Rifkin  | Cisneros |
| 3002 | Motika  | Pereira  |
+------+---------+----------+
10 rows in set (0.00 sec)












3. Write a query that produces all customers serviced by salespeople with a commission above 12%. Output the customer’s name, the salesperson’s name, and the salesperson’s rate of commission.

D3_56588>SELECT c.cname,s.sname,s.comm FROM customers c INNER JOIN salespeople s ON c.snum=s.snum WHERE s.comm > 0.12;
+----------+--------+------+
| cname    | sname  | comm |
+----------+--------+------+
| Liu      | Serres | 0.13 |
| Grass    | Serres | 0.13 |
| Cisneros | Rifkin | 0.15 |
+----------+--------+------+
3 rows in set (0.00 sec)










4. Write a query that calculates the amount of the salesperson’s commission on each order by a customer with a rating above 100.

D3_56588>SELECT o.onum,c.cname,s.snum,o.amt,o.amt*s.comm AS commission FROM orders o INNER JOIN customers c ON o.cnum = c.cnum INNER JOIN salespeople s ON o.snum = s.snum WHERE c.rating > 100;
+------+----------+------+---------+------------+
| onum | cname    | snum | amt     | commission |
+------+----------+------+---------+------------+
| 3010 | Grass    | 1002 |  309.95 |    40.2935 |
| 3007 | Grass    | 1002 |   75.75 |     9.8475 |
| 3005 | Liu      | 1002 | 5160.45 |   670.8585 |
| 3006 | Cisneros | 1007 | 1098.16 |   164.7240 |
| 3001 | Cisneros | 1007 |   18.69 |     2.8035 |
| 3009 | Giovanni | 1003 | 1713.23 |   171.3230 |
+------+----------+------+---------+------------+
6 rows in set (0.00 sec)











5. Write a query that produces all pairs of salespeople who are living in the same city. Exclude combinations of salespeople with themselves as well as duplicate rows with the order reversed.

D3_56588>SELECT s.sname,sa.sname,s.city FROM salespeople s INNER JOIN salespeople sa WHERE s.city=sa.city AND s.sname < sa.sname;
+--------+-------+--------+
| sname  | sname | city   |
+--------+-------+--------+
| Motika | Peel  | London |
+--------+-------+--------+
1 row in set (0.00 sec)














Note: To solve below queries use “hr” database *Use appropriate joins to solve following queries.
6. Display department name and manager first name.

D3_56588>SELECT d.DEPARTMENT_NAME, e.FIRST_NAME FROM departments d LEFT JOIN employees e ON d.MANAGER_ID = e.EMPLOYEE_ID;
+----------------------+------------+
| DEPARTMENT_NAME      | FIRST_NAME |
+----------------------+------------+
| Administration       | Jennifer   |
| Marketing            | Michael    |
| Purchasing           | Den        |
| Human Resources      | Susan      |
| Shipping             | Adam       |
| IT                   | Alexander  |
| Public Relations     | Hermann    |
| Sales                | John       |
| Executive            | Steven     |
| Finance              | Nancy      |
| Accounting           | Shelley    |
| Treasury             | NULL       |
| Corporate Tax        | NULL       |
| Control And Credit   | NULL       |
| Shareholder Services | NULL       |
| Benefits             | NULL       |
| Manufacturing        | NULL       |
| Construction         | NULL       |
| Contracting          | NULL       |
| Operations           | NULL       |
| IT Support           | NULL       |
| NOC                  | NULL       |
| IT Helpdesk          | NULL       |
| Government Sales     | NULL       |
| Retail Sales         | NULL       |
| Recruiting           | NULL       |
| Payroll              | NULL       |
+----------------------+------------+
27 rows in set (0.00 sec)










7. Display department name, manager name, and city.

D3_56588>SELECT d.DEPARTMENT_NAME,e.FIRST_NAME,l.CITY FROM departments d LEFT JOIN employees e ON d.MANAGER_ID = e.EMPLOYEE_ID LEFT JOIN locations l ON d.LOCATION_ID = l.LOCATION_ID;
+----------------------+------------+---------------------+
| DEPARTMENT_NAME      | FIRST_NAME | CITY                |
+----------------------+------------+---------------------+
| Administration       | Jennifer   | Seattle             |
| Marketing            | Michael    | Toronto             |
| Purchasing           | Den        | Seattle             |
| Human Resources      | Susan      | London              |
| Shipping             | Adam       | South San Francisco |
| IT                   | Alexander  | Southlake           |
| Public Relations     | Hermann    | Munich              |
| Sales                | John       | OX9 9ZB             |
| Executive            | Steven     | Seattle             |
| Finance              | Nancy      | Seattle             |
| Accounting           | Shelley    | Seattle             |
| Treasury             | NULL       | Seattle             |
| Corporate Tax        | NULL       | Seattle             |
| Control And Credit   | NULL       | Seattle             |
| Shareholder Services | NULL       | Seattle             |
| Benefits             | NULL       | Seattle             |
| Manufacturing        | NULL       | Seattle             |
| Construction         | NULL       | Seattle             |
| Contracting          | NULL       | Seattle             |
| Operations           | NULL       | Seattle             |
| IT Support           | NULL       | Seattle             |
| NOC                  | NULL       | Seattle             |
| IT Helpdesk          | NULL       | Seattle             |
| Government Sales     | NULL       | Seattle             |
| Retail Sales         | NULL       | Seattle             |
| Recruiting           | NULL       | Seattle             |
| Payroll              | NULL       | Seattle             |
+----------------------+------------+---------------------+
27 rows in set (0.00 sec)









8. Display country name, city, and department name.

D3_56588>SELECT c.COUNTRY_NAME, l.CITY,d.DEPARTMENT_NAME FROM countries c RIGHT JOIN locations l ON c.COUNTRY_ID = l.COUNTRY_ID LEFT JOIN departments d ON l.LOCATION_ID = d.LOCATION_ID;
+--------------------------+---------------------+----------------------+
| COUNTRY_NAME             | CITY                | DEPARTMENT_NAME      |
+--------------------------+---------------------+----------------------+
| Italy                    | Roma                | NULL                 |
| Italy                    | Venice              | NULL                 |
| Japan                    | Tokyo               | NULL                 |
| Japan                    | Hiroshima           | NULL                 |
| United States of America | Southlake           | IT                   |
| United States of America | South San Francisco | Shipping             |
| United States of America | South Brunswick     | NULL                 |
| United States of America | Seattle             | Administration       |
| United States of America | Seattle             | Purchasing           |
| United States of America | Seattle             | Executive            |
| United States of America | Seattle             | Finance              |
| United States of America | Seattle             | Accounting           |
| United States of America | Seattle             | Treasury             |
| United States of America | Seattle             | Corporate Tax        |
| United States of America | Seattle             | Control And Credit   |
| United States of America | Seattle             | Shareholder Services |
| United States of America | Seattle             | Benefits             |
| United States of America | Seattle             | Manufacturing        |
| United States of America | Seattle             | Construction         |
| United States of America | Seattle             | Contracting          |
| United States of America | Seattle             | Operations           |
| United States of America | Seattle             | IT Support           |
| United States of America | Seattle             | NOC                  |
| United States of America | Seattle             | IT Helpdesk          |
| United States of America | Seattle             | Government Sales     |
| United States of America | Seattle             | Retail Sales         |
| United States of America | Seattle             | Recruiting           |
| United States of America | Seattle             | Payroll              |
| Canada                   | Toronto             | Marketing            |
| Canada                   | Whitehorse          | NULL                 |
| China                    | Beijing             | NULL                 |
| India                    | Bombay              | NULL                 |
| Australia                | Sydney              | NULL                 |
| Singapore                | Singapore           | NULL                 |
| United Kingdom           | London              | Human Resources      |
| NULL                     | OX9 9ZB             | Sales                |
| United Kingdom           | Stretford           | NULL                 |
| Germany                  | Munich              | Public Relations     |
| Brazil                   | Sao Paulo           | NULL                 |
| Switzerland              | Geneva              | NULL                 |
| Switzerland              | Bern                | NULL                 |
| Netherlands              | Utrecht             | NULL                 |
| NULL                     | Mexico City         | NULL                 |
+--------------------------+---------------------+----------------------+
43 rows in set (0.00 sec)











9. Display job title, department name, employee last name, starting date for all jobs from 1993 to 1998.

D3_56588>SELECT j.JOB_TITLE, e.LAST_NAME, d.DEPARTMENT_NAME, h.START_DATE FROM jobs j LEFT JOIN employees e ON j.JOB_ID = e.JOB_ID INNER JOIN departments d ON e.DEPARTMENT_ID = d.DEPARTMENT_ID INNER JOIN job_history h ON h.JOB_ID = j.JOB_ID WHERE YEAR(h.START_DATE) >= '1993' AND YEAR(h.START_DATE) <= 1998 ;
+--------------------------+-------------+-----------------+------------+
| JOB_TITLE                | LAST_NAME   | DEPARTMENT_NAME | START_DATE |
+--------------------------+-------------+-----------------+------------+
| Programmer               | Hunold      | IT              | 1993-01-13 |
| Programmer               | Ernst       | IT              | 1993-01-13 |
| Programmer               | Austin      | IT              | 1993-01-13 |
| Programmer               | Pataballa   | IT              | 1993-01-13 |
| Programmer               | Lorentz     | IT              | 1993-01-13 |
| Accounting Manager       | Higgins     | Accounting      | 1993-10-28 |
| Marketing Representative | Fay         | Marketing       | 1996-02-17 |
| Stock Clerk              | Nayer       | Shipping        | 1998-03-24 |
| Stock Clerk              | Mikkilineni | Shipping        | 1998-03-24 |
| Stock Clerk              | Landry      | Shipping        | 1998-03-24 |
| Stock Clerk              | Markle      | Shipping        | 1998-03-24 |
| Stock Clerk              | Bissot      | Shipping        | 1998-03-24 |
| Stock Clerk              | Atkinson    | Shipping        | 1998-03-24 |
| Stock Clerk              | Marlow      | Shipping        | 1998-03-24 |
| Stock Clerk              | Olson       | Shipping        | 1998-03-24 |
| Stock Clerk              | Mallin      | Shipping        | 1998-03-24 |
| Stock Clerk              | Rogers      | Shipping        | 1998-03-24 |
| Stock Clerk              | Gee         | Shipping        | 1998-03-24 |
| Stock Clerk              | Philtanker  | Shipping        | 1998-03-24 |
| Stock Clerk              | Ladwig      | Shipping        | 1998-03-24 |
| Stock Clerk              | Stiles      | Shipping        | 1998-03-24 |
| Stock Clerk              | Seo         | Shipping        | 1998-03-24 |
| Stock Clerk              | Patel       | Shipping        | 1998-03-24 |
| Stock Clerk              | Rajs        | Shipping        | 1998-03-24 |
| Stock Clerk              | Davies      | Shipping        | 1998-03-24 |
| Stock Clerk              | Matos       | Shipping        | 1998-03-24 |
| Stock Clerk              | Vargas      | Shipping        | 1998-03-24 |
| Sales Representative     | Tucker      | Sales           | 1998-03-24 |
| Sales Representative     | Bernstein   | Sales           | 1998-03-24 |
| Sales Representative     | Hall        | Sales           | 1998-03-24 |
| Sales Representative     | Olsen       | Sales           | 1998-03-24 |
| Sales Representative     | Cambrault   | Sales           | 1998-03-24 |
| Sales Representative     | Tuvault     | Sales           | 1998-03-24 |
| Sales Representative     | King        | Sales           | 1998-03-24 |
| Sales Representative     | Sully       | Sales           | 1998-03-24 |
| Sales Representative     | McEwen      | Sales           | 1998-03-24 |
| Sales Representative     | Smith       | Sales           | 1998-03-24 |
| Sales Representative     | Doran       | Sales           | 1998-03-24 |
| Sales Representative     | Sewall      | Sales           | 1998-03-24 |
| Sales Representative     | Vishney     | Sales           | 1998-03-24 |
| Sales Representative     | Greene      | Sales           | 1998-03-24 |
| Sales Representative     | Marvins     | Sales           | 1998-03-24 |
| Sales Representative     | Lee         | Sales           | 1998-03-24 |
| Sales Representative     | Ande        | Sales           | 1998-03-24 |
| Sales Representative     | Banda       | Sales           | 1998-03-24 |
| Sales Representative     | Ozer        | Sales           | 1998-03-24 |
| Sales Representative     | Bloom       | Sales           | 1998-03-24 |
| Sales Representative     | Fox         | Sales           | 1998-03-24 |
| Sales Representative     | Smith       | Sales           | 1998-03-24 |
| Sales Representative     | Bates       | Sales           | 1998-03-24 |
| Sales Representative     | Kumar       | Sales           | 1998-03-24 |
| Sales Representative     | Abel        | Sales           | 1998-03-24 |
| Sales Representative     | Hutton      | Sales           | 1998-03-24 |
| Sales Representative     | Taylor      | Sales           | 1998-03-24 |
| Sales Representative     | Livingston  | Sales           | 1998-03-24 |
| Sales Representative     | Johnson     | Sales           | 1998-03-24 |
| Public Accountant        | Gietz       | Accounting      | 1994-07-01 |
+--------------------------+-------------+-----------------+------------+
57 rows in set (0.00 sec)












10. Display job title and average salary of employees. 

D3_56588>SELECT j.JOB_ID,AVG(e.SALARY) FROM jobs j INNER JOIN employees e ON j.JOB_ID = e.JOB_ID GROUP BY j.JOB_ID;
+------------+---------------+
| JOB_ID     | AVG(e.SALARY) |
+------------+---------------+
| AD_PRES    |  24000.000000 |
| AD_VP      |  17000.000000 |
| IT_PROG    |   5760.000000 |
| FI_MGR     |  12000.000000 |
| FI_ACCOUNT |   7920.000000 |
| PU_MAN     |  11000.000000 |
| PU_CLERK   |   2780.000000 |
| ST_MAN     |   7280.000000 |
| ST_CLERK   |   2785.000000 |
| SA_MAN     |  12200.000000 |
| SA_REP     |   8350.000000 |
| SH_CLERK   |   3215.000000 |
| AD_ASST    |   4400.000000 |
| MK_MAN     |  13000.000000 |
| MK_REP     |   6000.000000 |
| HR_REP     |   6500.000000 |
| PR_REP     |  10000.000000 |
| AC_MGR     |  12000.000000 |
| AC_ACCOUNT |   8300.000000 |
+------------+---------------+
19 rows in set (0.00 sec)













11. Display job title, employee name, and the difference between maximum salary for the job and salary of the employee. 

D3_56588>SELECT e.FIRST_NAME, j.JOB_ID, (j.MAX_SALARY - e.SALARY) AS Difference FROM employees e INNER JOIN jobs j ON j.JOB_ID = e.JOB_ID;
+-------------+------------+------------+
| FIRST_NAME  | JOB_ID     | Difference |
+-------------+------------+------------+
| Steven      | AD_PRES    |   16000.00 |
| Neena       | AD_VP      |   13000.00 |
| Lex         | AD_VP      |   13000.00 |
| Jennifer    | AD_ASST    |    1600.00 |
| Nancy       | FI_MGR     |    4000.00 |
| Daniel      | FI_ACCOUNT |       0.00 |
| John        | FI_ACCOUNT |     800.00 |
| Ismael      | FI_ACCOUNT |    1300.00 |
| Jose Manuel | FI_ACCOUNT |    1200.00 |
| Luis        | FI_ACCOUNT |    2100.00 |
| Shelley     | AC_MGR     |    4000.00 |
| William     | AC_ACCOUNT |     700.00 |
| John        | SA_MAN     |    6000.00 |
| Karen       | SA_MAN     |    6500.00 |
| Alberto     | SA_MAN     |    8000.00 |
| Gerald      | SA_MAN     |    9000.00 |
| Eleni       | SA_MAN     |    9500.00 |
| Peter       | SA_REP     |    2000.00 |
| David       | SA_REP     |    2500.00 |
| Peter       | SA_REP     |    3000.00 |
| Christopher | SA_REP     |    4000.00 |
| Nanette     | SA_REP     |    4500.00 |
| Oliver      | SA_REP     |    5000.00 |
| Janette     | SA_REP     |    2000.00 |
| Patrick     | SA_REP     |    2500.00 |
| Allan       | SA_REP     |    3000.00 |
| Lindsey     | SA_REP     |    4000.00 |
| Louise      | SA_REP     |    4500.00 |
| Sarath      | SA_REP     |    5000.00 |
| Clara       | SA_REP     |    1500.00 |
| Danielle    | SA_REP     |    2500.00 |
| Mattea      | SA_REP     |    4800.00 |
| David       | SA_REP     |    5200.00 |
| Sundar      | SA_REP     |    5600.00 |
| Amit        | SA_REP     |    5800.00 |
| Lisa        | SA_REP     |     500.00 |
| Harrison    | SA_REP     |    2000.00 |
| Tayler      | SA_REP     |    2400.00 |
| William     | SA_REP     |    4600.00 |
| Elizabeth   | SA_REP     |    4700.00 |
| Sundita     | SA_REP     |    5900.00 |
| Ellen       | SA_REP     |    1000.00 |
| Alyssa      | SA_REP     |    3200.00 |
| Jonathon    | SA_REP     |    3400.00 |
| Jack        | SA_REP     |    3600.00 |
| Kimberely   | SA_REP     |    5000.00 |
| Charles     | SA_REP     |    5800.00 |
| Den         | PU_MAN     |    4000.00 |
| Alexander   | PU_CLERK   |    2400.00 |
| Shelli      | PU_CLERK   |    2600.00 |
| Sigal       | PU_CLERK   |    2700.00 |
| Guy         | PU_CLERK   |    2900.00 |
| Karen       | PU_CLERK   |    3000.00 |
| Matthew     | ST_MAN     |     500.00 |
| Adam        | ST_MAN     |     300.00 |
| Payam       | ST_MAN     |     600.00 |
| Shanta      | ST_MAN     |    2000.00 |
| Kevin       | ST_MAN     |    2700.00 |
| Julia       | ST_CLERK   |    1800.00 |
| Irene       | ST_CLERK   |    2300.00 |
| James       | ST_CLERK   |    2600.00 |
| Steven      | ST_CLERK   |    2800.00 |
| Laura       | ST_CLERK   |    1700.00 |
| Mozhe       | ST_CLERK   |    2200.00 |
| James       | ST_CLERK   |    2500.00 |
| TJ          | ST_CLERK   |    2900.00 |
| Jason       | ST_CLERK   |    1700.00 |
| Michael     | ST_CLERK   |    2100.00 |
| Ki          | ST_CLERK   |    2600.00 |
| Hazel       | ST_CLERK   |    2800.00 |
| Renske      | ST_CLERK   |    1400.00 |
| Stephen     | ST_CLERK   |    1800.00 |
| John        | ST_CLERK   |    2300.00 |
| Joshua      | ST_CLERK   |    2500.00 |
| Trenna      | ST_CLERK   |    1500.00 |
| Curtis      | ST_CLERK   |    1900.00 |
| Randall     | ST_CLERK   |    2400.00 |
| Peter       | ST_CLERK   |    2500.00 |
| Winston     | SH_CLERK   |    2300.00 |
| Jean        | SH_CLERK   |    2400.00 |
| Martha      | SH_CLERK   |    3000.00 |
| Girard      | SH_CLERK   |    2700.00 |
| Nandita     | SH_CLERK   |    1300.00 |
| Alexis      | SH_CLERK   |    1400.00 |
| Julia       | SH_CLERK   |    2100.00 |
| Anthony     | SH_CLERK   |    2500.00 |
| Kelly       | SH_CLERK   |    1700.00 |
| Jennifer    | SH_CLERK   |    1900.00 |
| Timothy     | SH_CLERK   |    2600.00 |
| Randall     | SH_CLERK   |    3000.00 |
| Sarah       | SH_CLERK   |    1500.00 |
| Britney     | SH_CLERK   |    1600.00 |
| Samuel      | SH_CLERK   |    2300.00 |
| Vance       | SH_CLERK   |    2700.00 |
| Alana       | SH_CLERK   |    2400.00 |
| Kevin       | SH_CLERK   |    2500.00 |
| Donald      | SH_CLERK   |    2900.00 |
| Douglas     | SH_CLERK   |    2900.00 |
| Alexander   | IT_PROG    |    1000.00 |
| Bruce       | IT_PROG    |    4000.00 |
| David       | IT_PROG    |    5200.00 |
| Valli       | IT_PROG    |    5200.00 |
| Diana       | IT_PROG    |    5800.00 |
| Michael     | MK_MAN     |    2000.00 |
| Pat         | MK_REP     |    3000.00 |
| Susan       | HR_REP     |    2500.00 |
| Hermann     | PR_REP     |     500.00 |
+-------------+------------+------------+
107 rows in set (0.00 sec)












12. Display last name, job title of employees who have commission percentage and belongs to department 30. 

D3_56588>SELECT e.LAST_NAME, j.JOB_TITLE FROM employees e INNER JOIN jobs j ON e.JOB_ID = j.JOB_ID WHERE e.COMMISSION_PCT != 0 AND e.DEPARTMENT_ID = 30;
Empty set (0.02 sec)














13. Display details of jobs that were done by any employee who is currently drawing more than 15000 of salary. 

D3_56588>SELECT j.JOB_ID, j.JOB_TITLE, j.MAX_SALARY, j.MIN_SALARY FROM jobs j LEFT JOIN employees e ON j.JOB_ID = e.JOB_ID GROUP BY j.JOB_ID HAVING MAX(e.SALARY) > 15000;
+---------+-------------------------------+------------+------------+
| JOB_ID  | JOB_TITLE                     | MAX_SALARY | MIN_SALARY |
+---------+-------------------------------+------------+------------+
| AD_PRES | President                     |      40000 |      20000 |
| AD_VP   | Administration Vice President |      30000 |      15000 |
+---------+-------------------------------+------------+------------+
2 rows in set (0.00 sec)














14. Display department name, manager name, and salary of the manager for all managers whose experience is more than 5 years. 


D3_56588>SELECT DEPARTMENT_NAME, FIRST_NAME, SALARY FROM departments D JOIN employees E ON (D.MANAGER_ID=E.MANAGER_ID) WHERE  (SYSDATE()-HIRE_DATE) / 365 > 5;
+----------------------+-------------+----------+
| DEPARTMENT_NAME      | FIRST_NAME  | SALARY   |
+----------------------+-------------+----------+
| Marketing            | Pat         |  6000.00 |
| Purchasing           | Alexander   |  3100.00 |
| Purchasing           | Shelli      |  2900.00 |
| Purchasing           | Sigal       |  2800.00 |
| Purchasing           | Guy         |  2600.00 |
| Purchasing           | Karen       |  2500.00 |
| Shipping             | Laura       |  3300.00 |
| Shipping             | Mozhe       |  2800.00 |
| Shipping             | James       |  2500.00 |
| Shipping             | TJ          |  2100.00 |
| Shipping             | Nandita     |  4200.00 |
| Shipping             | Alexis      |  4100.00 |
| Shipping             | Julia       |  3400.00 |
| Shipping             | Anthony     |  3000.00 |
| IT                   | Bruce       |  6000.00 |
| IT                   | David       |  4800.00 |
| IT                   | Valli       |  4800.00 |
| IT                   | Diana       |  4200.00 |
| Sales                | Peter       | 10000.00 |
| Sales                | David       |  9500.00 |
| Sales                | Peter       |  9000.00 |
| Sales                | Christopher |  8000.00 |
| Sales                | Nanette     |  7500.00 |
| Sales                | Oliver      |  7000.00 |
| Executive            | Neena       | 17000.00 |
| Executive            | Lex         | 17000.00 |
| Executive            | Den         | 11000.00 |
| Executive            | Matthew     |  8000.00 |
| Executive            | Adam        |  8200.00 |
| Executive            | Payam       |  7900.00 |
| Executive            | Shanta      |  6500.00 |
| Executive            | Kevin       |  5800.00 |
| Executive            | John        | 14000.00 |
| Executive            | Karen       | 13500.00 |
| Executive            | Alberto     | 12000.00 |
| Executive            | Gerald      | 11000.00 |
| Executive            | Eleni       | 10500.00 |
| Executive            | Michael     | 13000.00 |
| Finance              | Daniel      |  9000.00 |
| Finance              | John        |  8200.00 |
| Finance              | Ismael      |  7700.00 |
| Finance              | Jose Manuel |  7800.00 |
| Finance              | Luis        |  6900.00 |
| Accounting           | William     |  8300.00 |
| Treasury             | Steven      | 24000.00 |
| Corporate Tax        | Steven      | 24000.00 |
| Control And Credit   | Steven      | 24000.00 |
| Shareholder Services | Steven      | 24000.00 |
| Benefits             | Steven      | 24000.00 |
| Manufacturing        | Steven      | 24000.00 |
| Construction         | Steven      | 24000.00 |
| Contracting          | Steven      | 24000.00 |
| Operations           | Steven      | 24000.00 |
| IT Support           | Steven      | 24000.00 |
| NOC                  | Steven      | 24000.00 |
| IT Helpdesk          | Steven      | 24000.00 |
| Government Sales     | Steven      | 24000.00 |
| Retail Sales         | Steven      | 24000.00 |
| Recruiting           | Steven      | 24000.00 |
| Payroll              | Steven      | 24000.00 |
+----------------------+-------------+----------+
60 rows in set (0.00 sec)















15. Display employee name if the employee joined before his manager. 

D3_56588>SELECT e.EMPLOYEE_ID,e.FIRST_NAME, e.MANAGER_ID,em.EMPLOYEE_ID, em.FIRST_NAME FROM employees e INNER JOIN employees em ON em.EMPLOYEE_ID = e.MANAGER_ID WHERE e.HIRE_DATE < em.HIRE_DATE;
Empty set (0.00 sec)













16. Display employee name, job title for the jobs employee did in the past where the job was done less than six months. 

D3_56588>SELECT e.FIRST_NAME,h.JOB_ID, j.JOB_TITLE FROM job_history h INNER JOIN employees e ON h.EMPLOYEE_ID = e.EMPLOYEE_ID INNER JOIN jobs j ON j.JOB_ID = h.JOB_ID WHERE (DATEDIFF(h.END_DATE, h.START_DATE))/30 < 6;
Empty set (0.00 sec)













17. Display employee name and country in which he is working. 

D3_56588>SELECT e.FIRST_NAME, c.COUNTRY_NAME FROM employees e LEFT JOIN departments d ON d.DEPARTMENT_ID = e.DEPARTMENT_ID LEFT JOIN locations l ON l.LOCATION_ID = d.LOCATION_ID LEFT JOIN countries c ON c.COUNTRY_ID = l.COUNTRY_ID;
+-------------+--------------------------+
| FIRST_NAME  | COUNTRY_NAME             |
+-------------+--------------------------+
| Steven      | United States of America |
| Neena       | United States of America |
| Lex         | United States of America |
| Alexander   | United States of America |
| Bruce       | United States of America |
| David       | United States of America |
| Valli       | United States of America |
| Diana       | United States of America |
| Nancy       | United States of America |
| Daniel      | United States of America |
| John        | United States of America |
| Ismael      | United States of America |
| Jose Manuel | United States of America |
| Luis        | United States of America |
| Den         | United States of America |
| Alexander   | United States of America |
| Shelli      | United States of America |
| Sigal       | United States of America |
| Guy         | United States of America |
| Karen       | United States of America |
| Matthew     | United States of America |
| Adam        | United States of America |
| Payam       | United States of America |
| Shanta      | United States of America |
| Kevin       | United States of America |
| Julia       | United States of America |
| Irene       | United States of America |
| James       | United States of America |
| Steven      | United States of America |
| Laura       | United States of America |
| Mozhe       | United States of America |
| James       | United States of America |
| TJ          | United States of America |
| Jason       | United States of America |
| Michael     | United States of America |
| Ki          | United States of America |
| Hazel       | United States of America |
| Renske      | United States of America |
| Stephen     | United States of America |
| John        | United States of America |
| Joshua      | United States of America |
| Trenna      | United States of America |
| Curtis      | United States of America |
| Randall     | United States of America |
| Peter       | United States of America |
| John        | NULL                     |
| Karen       | NULL                     |
| Alberto     | NULL                     |
| Gerald      | NULL                     |
| Eleni       | NULL                     |
| Peter       | NULL                     |
| David       | NULL                     |
| Peter       | NULL                     |
| Christopher | NULL                     |
| Nanette     | NULL                     |
| Oliver      | NULL                     |
| Janette     | NULL                     |
| Patrick     | NULL                     |
| Allan       | NULL                     |
| Lindsey     | NULL                     |
| Louise      | NULL                     |
| Sarath      | NULL                     |
| Clara       | NULL                     |
| Danielle    | NULL                     |
| Mattea      | NULL                     |
| David       | NULL                     |
| Sundar      | NULL                     |
| Amit        | NULL                     |
| Lisa        | NULL                     |
| Harrison    | NULL                     |
| Tayler      | NULL                     |
| William     | NULL                     |
| Elizabeth   | NULL                     |
| Sundita     | NULL                     |
| Ellen       | NULL                     |
| Alyssa      | NULL                     |
| Jonathon    | NULL                     |
| Jack        | NULL                     |
| Kimberely   | NULL                     |
| Charles     | NULL                     |
| Winston     | United States of America |
| Jean        | United States of America |
| Martha      | United States of America |
| Girard      | United States of America |
| Nandita     | United States of America |
| Alexis      | United States of America |
| Julia       | United States of America |
| Anthony     | United States of America |
| Kelly       | United States of America |
| Jennifer    | United States of America |
| Timothy     | United States of America |
| Randall     | United States of America |
| Sarah       | United States of America |
| Britney     | United States of America |
| Samuel      | United States of America |
| Vance       | United States of America |
| Alana       | United States of America |
| Kevin       | United States of America |
| Donald      | United States of America |
| Douglas     | United States of America |
| Jennifer    | United States of America |
| Michael     | Canada                   |
| Pat         | Canada                   |
| Susan       | United Kingdom           |
| Hermann     | Germany                  |
| Shelley     | United States of America |
| William     | United States of America |
+-------------+--------------------------+
107 rows in set (0.00 sec)













18. Display department name, average salary and number of employees with commission within the department. 

D3_56588>SELECT d.DEPARTMENT_NAME, AVG(e.SALARY), COUNT(e.EMPLOYEE_ID) FROM employees e LEFT JOIN departments d ON d.DEPARTMENT_ID = e.DEPARTMENT_ID WHERE e.COMMISSION_PCT != 0 GROUP BY e.DEPARTMENT_ID;
+-----------------+---------------+----------------------+
| DEPARTMENT_NAME | AVG(e.SALARY) | COUNT(e.EMPLOYEE_ID) |
+-----------------+---------------+----------------------+
| Sales           |   8955.882353 |                   34 |
| NULL            |   7000.000000 |                    1 |
+-----------------+---------------+----------------------+
2 rows in set (0.00 sec)












19. Display the month in which more than 5 employees joined in any department located in Sydney. 

D3_56588>SELECT MONTH(e.HIRE_DATE) FROM employees e INNER JOIN departments d ON d.DEPARTMENT_ID = e.DEPARTMENT_ID INNER JOIN locations l ON l.LOCATION_ID = d.DEPARTMENT_ID WHERE CITY = 'Sydney' GROUP BY MONTH(e.HIRE_DATE) HAVING COUNT(e.EMPLOYEE_ID) > 5;
Empty set (0.00 sec)











20. Display employee name, job title, start date, and end date of past jobs of all employees with commission percentage null.

D3_56588>SELECT e.FIRST_NAME, j.JOB_TITLE, h.START_DATE, h.END_DATE FROM job_history h INNER JOIN jobs j ON j.JOB_ID = h.JOB_ID INNER JOIN employees e  ON ( h.EMPLOYEE_ID = e.EMPLOYEE_ID) WHERE COMMISSION_PCT IS NULL;
Empty set (0.00 sec)







