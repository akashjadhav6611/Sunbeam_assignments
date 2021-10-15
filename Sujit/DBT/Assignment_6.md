1. Write a query that lists each order number followed by the name of the 
customer who made the order.

d2_56660>SELECT o.onum,c.cname FROM orders o LEFT JOIN customers c ON o.cnum = c.cnum;
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
10 rows in set (0.03 sec)

2. Write a query that gives the names of both the salesperson and the 
customer for each order along with the order number

d2_56660>SELECT s.sname,c.cname ,o.onum FROM customers c INNER JOIN salespeople s ON c.snum=s.snum RIGHT JOIN orders o ON c.cnum=o.cnum;
+---------+----------+------+
| sname   | cname    | onum |
+---------+----------+------+
| Rifkin  | Cisneros | 3001 |
| Peel    | Hoffman  | 3003 |
| Motika  | Pereira  | 3002 |
| Serres  | Liu      | 3005 |
| Rifkin  | Cisneros | 3006 |
| Axelrod | Giovanni | 3009 |
| Serres  | Grass    | 3007 |
| Peel    | Clemens  | 3008 |
| Serres  | Grass    | 3010 |
| Peel    | Clemens  | 3011 |
+---------+----------+------+
10 rows in set (0.00 sec)

3. Write a query that produces all customers serviced by salespeople with a 
commission above 12%. Output the customer’s name, the salesperson’s 
name, and the salesperson’s rate of commission

d2_56660>SELECT s.sname,c.cname ,s.comm FROM customers c INNER JOIN salespeople s ON c.snum=s.snum WHERE s.comm>0.12;
+--------+----------+------+
| sname  | cname    | comm |
+--------+----------+------+
| Serres | Liu      | 0.13 |
| Serres | Grass    | 0.13 |
| Rifkin | Cisneros | 0.15 |
+--------+----------+------+
3 rows in set (0.00 sec)

4. Write a query that calculates the amount of the salesperson’s commission 
on each order by a customer with a rating above 100.

d2_56660>SELECT o.onum,s.sname,c.rating, s.comm*o.amt AS COMMISSION FROM orders o INNER JOIN salespeople s ON s.snum=o.snum INNER JOIN customers c ON o.cnum=c.cnum WHERE rating>100;
+------+---------+--------+------------+
| onum | sname   | rating | COMMISSION |
+------+---------+--------+------------+
| 3010 | Serres  |    300 |    40.2935 |
| 3007 | Serres  |    300 |     9.8475 |
| 3005 | Serres  |    200 |   670.8585 |
| 3006 | Rifkin  |    300 |   164.7240 |
| 3001 | Rifkin  |    300 |     2.8035 |
| 3009 | Axelrod |    200 |   171.3230 |
+------+---------+--------+------------+
6 rows in set (0.03 sec)

5. Write a query that produces all pairs of salespeople who are living in the 
same city. Exclude combinations of salespeople with themselves as well as 
duplicate rows with the order reversed

d2_56660>SELECT s.sname,s1.sname,s.city FROM salespeople s INNER JOIN salespeople s1 ON s.city=s1.city AND s.sname < s1.sname;
+--------+--------+--------+
| sname  | sname  | city   |
+--------+--------+--------+
| Motika | Peel   | London |
| Peel   | Motika | London |
+--------+--------+--------+
2 rows in set (0.00 sec)

6. Display department name and manager first name

d2_56660>SELECT D.DEPARTMENT_NAME,E.FIRST_NAME FROM departments D LEFT JOIN employees E ON D.MANAGER_ID=E.EMPLOYEE_ID;
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

d2_56660>SELECT D.DEPARTMENT_NAME,E.FIRST_NAME,L.CITY FROM departments D LEFT JOIN employees E ON D.MANAGER_ID=E.EMPLOYEE_ID LEFT JOIN locations L ON D.LOCATION_ID=L.LOCATION_ID;
+----------------------+--------------+---------------------+
| DEPARTMENT_NAME      | MANAGER_NAME | CITY                |
+----------------------+--------------+---------------------+
| Administration       | 0            | Seattle             |
| Marketing            | 0            | Toronto             |
| Purchasing           | 0            | Seattle             |
| Human Resources      | 0            | London              |
| Shipping             | 0            | South San Francisco |
| IT                   | 0            | Southlake           |
| Public Relations     | 0            | Munich              |
| Sales                | 0            | OX9 9ZB             |
| Executive            | 0            | Seattle             |
| Finance              | 0            | Seattle             |
| Accounting           | 0            | Seattle             |
| Treasury             | NULL         | Seattle             |
| Corporate Tax        | NULL         | Seattle             |
| Control And Credit   | NULL         | Seattle             |
| Shareholder Services | NULL         | Seattle             |
| Benefits             | NULL         | Seattle             |
| Manufacturing        | NULL         | Seattle             |
| Construction         | NULL         | Seattle             |
| Contracting          | NULL         | Seattle             |
| Operations           | NULL         | Seattle             |
| IT Support           | NULL         | Seattle             |
| NOC                  | NULL         | Seattle             |
| IT Helpdesk          | NULL         | Seattle             |
| Government Sales     | NULL         | Seattle             |
| Retail Sales         | NULL         | Seattle             |
| Recruiting           | NULL         | Seattle             |
| Payroll              | NULL         | Seattle             |
+----------------------+--------------+---------------------+
27 rows in set, 22 warnings (0.00 sec)

8. Display country name, city, and department name.


d2_56660>SELECT C.COUNTRY_NAME,L.CITY,D.DEPARTMENT_NAME FROM countries C RIGHT JOIN locations L ON C.COUNTRY_ID=L.COUNTRY_ID
    -> INNER JOIN departments D ON L.LOCATION_ID=D.LOCATION_ID;
+--------------------------+---------------------+----------------------+
| COUNTRY_NAME             | CITY                | DEPARTMENT_NAME      |
+--------------------------+---------------------+----------------------+
| United States of America | Seattle             | Administration       |
| Canada                   | Toronto             | Marketing            |
| United States of America | Seattle             | Purchasing           |
| United Kingdom           | London              | Human Resources      |
| United States of America | South San Francisco | Shipping             |
| United States of America | Southlake           | IT                   |
| Germany                  | Munich              | Public Relations     |
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
+--------------------------+---------------------+----------------------+
26 rows in set (0.04 sec)

9. Display job title, department name, employee last name, starting date for 
all jobs from 1993 to 1998.

d2_56660>SELECT j.JOB_TITLE, e.LAST_NAME, d.DEPARTMENT_NAME, h.START_DATE FROM jobs j LEFT JOIN employees e ON j.JOB_ID = e.JOB_ID INNER JOIN departments d ON e.DEPARTMENT_ID = d.DEPARTMENT_ID INNER JOIN job_history h ON h.JOB_ID = j.JOB_ID WHERE YEAR(h.START_DATE) >= '1993' AND YEAR(h.START_DATE) <= 1998 ;
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
57 rows in set (0.04 sec)

10. Display job title and average salary of employees

d2_56660>SELECT J.JOB_TITLE,AVG(E.SALARY) FROM jobs J INNER JOIN employees E ON J.JOB_ID=E.JOB_ID GROUP BY E.JOB_ID;
+---------------------------------+---------------+
| JOB_TITLE                       | AVG(E.SALARY) |
+---------------------------------+---------------+
| President                       |  24000.000000 |
| Administration Vice President   |  17000.000000 |
| Programmer                      |   5760.000000 |
| Finance Manager                 |  12000.000000 |
| Accountant                      |   7920.000000 |
| Purchasing Manager              |  11000.000000 |
| Purchasing Clerk                |   2780.000000 |
| Stock Manager                   |   7280.000000 |
| Stock Clerk                     |   2785.000000 |
| Sales Manager                   |  12200.000000 |
| Sales Representative            |   8350.000000 |
| Shipping Clerk                  |   3215.000000 |
| Administration Assistant        |   4400.000000 |
| Marketing Manager               |  13000.000000 |
| Marketing Representative        |   6000.000000 |
| Human Resources Representative  |   6500.000000 |
| Public Relations Representative |  10000.000000 |
| Accounting Manager              |  12000.000000 |
| Public Accountant               |   8300.000000 |
+---------------------------------+---------------+
19 rows in set (0.00 sec)

11. Display job title, employee name, and the difference between maximum 
salary for the job and salary of the employee.

d2_56660>SELECT J.JOB_TITLE,CONCAT(E.FIRST_NAME,E.LAST_NAME),(J.MAX_SALARY-J.MIN_SALARY) AS DIFFERENCE FROM employees E INNER JOIN jobs J ON J.JOB_ID=E.JOB_ID;
+---------------------------------+----------------------------------+------------+
| JOB_TITLE                       | CONCAT(E.FIRST_NAME,E.LAST_NAME) | DIFFERENCE |
+---------------------------------+----------------------------------+------------+
| President                       | StevenKing                       |      20000 |
| Administration Vice President   | NeenaKochhar                     |      15000 |
| Administration Vice President   | LexDe Haan                       |      15000 |
| Administration Assistant        | JenniferWhalen                   |       3000 |
| Finance Manager                 | NancyGreenberg                   |       7800 |
| Accountant                      | DanielFaviet                     |       4800 |
| Accountant                      | JohnChen                         |       4800 |
| Accountant                      | IsmaelSciarra                    |       4800 |
| Accountant                      | Jose ManuelUrman                 |       4800 |
| Accountant                      | LuisPopp                         |       4800 |
| Accounting Manager              | ShelleyHiggins                   |       7800 |
| Public Accountant               | WilliamGietz                     |       4800 |
| Sales Manager                   | JohnRussell                      |      10000 |
| Sales Manager                   | KarenPartners                    |      10000 |
| Sales Manager                   | AlbertoErrazuriz                 |      10000 |
| Sales Manager                   | GeraldCambrault                  |      10000 |
| Sales Manager                   | EleniZlotkey                     |      10000 |
| Sales Representative            | PeterTucker                      |       6000 |
| Sales Representative            | DavidBernstein                   |       6000 |
| Sales Representative            | PeterHall                        |       6000 |
| Sales Representative            | ChristopherOlsen                 |       6000 |
| Sales Representative            | NanetteCambrault                 |       6000 |
| Sales Representative            | OliverTuvault                    |       6000 |
| Sales Representative            | JanetteKing                      |       6000 |
| Sales Representative            | PatrickSully                     |       6000 |
| Sales Representative            | AllanMcEwen                      |       6000 |
| Sales Representative            | LindseySmith                     |       6000 |
| Sales Representative            | LouiseDoran                      |       6000 |
| Sales Representative            | SarathSewall                     |       6000 |
| Sales Representative            | ClaraVishney                     |       6000 |
| Sales Representative            | DanielleGreene                   |       6000 |
| Sales Representative            | MatteaMarvins                    |       6000 |
| Sales Representative            | DavidLee                         |       6000 |
| Sales Representative            | SundarAnde                       |       6000 |
| Sales Representative            | AmitBanda                        |       6000 |
| Sales Representative            | LisaOzer                         |       6000 |
| Sales Representative            | HarrisonBloom                    |       6000 |
| Sales Representative            | TaylerFox                        |       6000 |
| Sales Representative            | WilliamSmith                     |       6000 |
| Sales Representative            | ElizabethBates                   |       6000 |
| Sales Representative            | SunditaKumar                     |       6000 |
| Sales Representative            | EllenAbel                        |       6000 |
| Sales Representative            | AlyssaHutton                     |       6000 |
| Sales Representative            | JonathonTaylor                   |       6000 |
| Sales Representative            | JackLivingston                   |       6000 |
| Sales Representative            | KimberelyGrant                   |       6000 |
| Sales Representative            | CharlesJohnson                   |       6000 |
| Purchasing Manager              | DenRaphaely                      |       7000 |
| Purchasing Clerk                | AlexanderKhoo                    |       3000 |
| Purchasing Clerk                | ShelliBaida                      |       3000 |
| Purchasing Clerk                | SigalTobias                      |       3000 |
| Purchasing Clerk                | GuyHimuro                        |       3000 |
| Purchasing Clerk                | KarenColmenares                  |       3000 |
| Stock Manager                   | MatthewWeiss                     |       3000 |
| Stock Manager                   | AdamFripp                        |       3000 |
| Stock Manager                   | PayamKaufling                    |       3000 |
| Stock Manager                   | ShantaVollman                    |       3000 |
| Stock Manager                   | KevinMourgos                     |       3000 |
| Stock Clerk                     | JuliaNayer                       |       3000 |
| Stock Clerk                     | IreneMikkilineni                 |       3000 |
| Stock Clerk                     | JamesLandry                      |       3000 |
| Stock Clerk                     | StevenMarkle                     |       3000 |
| Stock Clerk                     | LauraBissot                      |       3000 |
| Stock Clerk                     | MozheAtkinson                    |       3000 |
| Stock Clerk                     | JamesMarlow                      |       3000 |
| Stock Clerk                     | TJOlson                          |       3000 |
| Stock Clerk                     | JasonMallin                      |       3000 |
| Stock Clerk                     | MichaelRogers                    |       3000 |
| Stock Clerk                     | KiGee                            |       3000 |
| Stock Clerk                     | HazelPhiltanker                  |       3000 |
| Stock Clerk                     | RenskeLadwig                     |       3000 |
| Stock Clerk                     | StephenStiles                    |       3000 |
| Stock Clerk                     | JohnSeo                          |       3000 |
| Stock Clerk                     | JoshuaPatel                      |       3000 |
| Stock Clerk                     | TrennaRajs                       |       3000 |
| Stock Clerk                     | CurtisDavies                     |       3000 |
| Stock Clerk                     | RandallMatos                     |       3000 |
| Stock Clerk                     | PeterVargas                      |       3000 |
| Shipping Clerk                  | WinstonTaylor                    |       3000 |
| Shipping Clerk                  | JeanFleaur                       |       3000 |
| Shipping Clerk                  | MarthaSullivan                   |       3000 |
| Shipping Clerk                  | GirardGeoni                      |       3000 |
| Shipping Clerk                  | NanditaSarchand                  |       3000 |
| Shipping Clerk                  | AlexisBull                       |       3000 |
| Shipping Clerk                  | JuliaDellinger                   |       3000 |
| Shipping Clerk                  | AnthonyCabrio                    |       3000 |
| Shipping Clerk                  | KellyChung                       |       3000 |
| Shipping Clerk                  | JenniferDilly                    |       3000 |
| Shipping Clerk                  | TimothyGates                     |       3000 |
| Shipping Clerk                  | RandallPerkins                   |       3000 |
| Shipping Clerk                  | SarahBell                        |       3000 |
| Shipping Clerk                  | BritneyEverett                   |       3000 |
| Shipping Clerk                  | SamuelMcCain                     |       3000 |
| Shipping Clerk                  | VanceJones                       |       3000 |
| Shipping Clerk                  | AlanaWalsh                       |       3000 |
| Shipping Clerk                  | KevinFeeney                      |       3000 |
| Shipping Clerk                  | DonaldOConnell                   |       3000 |
| Shipping Clerk                  | DouglasGrant                     |       3000 |
| Programmer                      | AlexanderHunold                  |       6000 |
| Programmer                      | BruceErnst                       |       6000 |
| Programmer                      | DavidAustin                      |       6000 |
| Programmer                      | ValliPataballa                   |       6000 |
| Programmer                      | DianaLorentz                     |       6000 |
| Marketing Manager               | MichaelHartstein                 |       6000 |
| Marketing Representative        | PatFay                           |       5000 |
| Human Resources Representative  | SusanMavris                      |       5000 |
| Public Relations Representative | HermannBaer                      |       6000 |
+---------------------------------+----------------------------------+------------+
107 rows in set (0.00 sec)

12. Display last name, job title of employees who have commission percentage 
and belongs to department 30.

d2_56660>SELECT E.LAST_NAME,J.JOB_TITLE FROM employees E INNER JOIN jobs J ON E.JOB_ID=J.JOB_ID WHERE COMMISSION_PCT>0 AND E.DEPARTMENT_ID=30;
Empty set (0.05 sec)

13. Display details of jobs that were done by any employee who is currently 
drawing more than 15000 of salary.

d2_56660>SELECT J.JOB_ID,J.JOB_TITLE,J.MIN_SALARY,J.MAX_SALARY FROM jobs J INNER JOIN employees E ON J.JOB_ID=E.JOB_ID WHERE E.SALARY>15000 GROUP BY J.JOB_ID;
+---------+-------------------------------+------------+------------+
| JOB_ID  | JOB_TITLE                     | MIN_SALARY | MAX_SALARY |
+---------+-------------------------------+------------+------------+
| AD_PRES | President                     |      20000 |      40000 |
| AD_VP   | Administration Vice President |      15000 |      30000 |
+---------+-------------------------------+------------+------------+
2 rows in set (0.00 sec)

14. Display department name, manager name, and salary of the manager for 
all managers whose experience is more than 5 years.

d2_56660>SELECT D.DEPARTMENT_NAME,CONCAT(E.FIRST_NAME,E.LAST_NAME) AS MANAGER_NAME,E.SALARY FROM
    -> employees E RIGHT JOIN departments D ON D.MANAGER_ID=E.MANAGER_ID INNER JOIN job_history H
    -> ON H.EMPLOYEE_ID=E.EMPLOYEE_ID WHERE YEAR(H.END_DATE)-YEAR(H.START_DATE)>5
    -> ;
Empty set (0.00 sec)

15. Display employee name if the employee joined before his manager

d2_56660>SELECT CONCAT(E1.FIRST_NAME,E1.LAST_NAME) AS NAME FROM employees E1 INNER JOIN employees E2 ON E1.EMPLOYEE_ID=E2.MANAGER_ID
    -> INNER JOIN employees E3 ON E1.HIRE_DATE=E3.HIRE_DATE WHERE DAY(E3.HIRE_DATE)-DAY(E1.HIRE_DATE)>0 OR MONTH(E3.HIRE_DATE)-MONTH(E1.HIRE_DATE)>0;
Empty set (0.01 sec)


16. Display employee name, job title for the jobs employee did in the past 
where the job was done less than six months.

d2_56660>SELECT CONCAT(E.FIRST_NAME,E.LAST_NAME) AS NAME,J.JOB_TITLE FROM employees E INNER JOIN jobs J ON E.JOB_ID=J.JOB_ID INNER JOIN job_history H ON J.JOB_ID=H.JOB_ID WHERE (DATEDIFF(H.END_DATE,H.START_DATE)/30)<6;
Empty set (0.05 sec)

17. Display employee name and country in which he is working.


d2_56660>SELECT CONCAT(E.FIRST_NAME,E.LAST_NAME) AS NAME,C.COUNTRY_NAME FROM employees E LEFT JOIN
    -> departments D ON D.DEPARTMENT_ID=E.DEPARTMENT_ID LEFT JOIN locations L ON D.LOCATION_ID=
    -> L.LOCATION_ID LEFT JOIN countries C ON L.COUNTRY_ID=C.COUNTRY_ID;
+------------------+--------------------------+
| NAME             | COUNTRY_NAME             |
+------------------+--------------------------+
| StevenKing       | United States of America |
| NeenaKochhar     | United States of America |
| LexDe Haan       | United States of America |
| AlexanderHunold  | United States of America |
| BruceErnst       | United States of America |
| DavidAustin      | United States of America |
| ValliPataballa   | United States of America |
| DianaLorentz     | United States of America |
| NancyGreenberg   | United States of America |
| DanielFaviet     | United States of America |
| JohnChen         | United States of America |
| IsmaelSciarra    | United States of America |
| Jose ManuelUrman | United States of America |
| LuisPopp         | United States of America |
| DenRaphaely      | United States of America |
| AlexanderKhoo    | United States of America |
| ShelliBaida      | United States of America |
| SigalTobias      | United States of America |
| GuyHimuro        | United States of America |
| KarenColmenares  | United States of America |
| MatthewWeiss     | United States of America |
| AdamFripp        | United States of America |
| PayamKaufling    | United States of America |
| ShantaVollman    | United States of America |
| KevinMourgos     | United States of America |
| JuliaNayer       | United States of America |
| IreneMikkilineni | United States of America |
| JamesLandry      | United States of America |
| StevenMarkle     | United States of America |
| LauraBissot      | United States of America |
| MozheAtkinson    | United States of America |
| JamesMarlow      | United States of America |
| TJOlson          | United States of America |
| JasonMallin      | United States of America |
| MichaelRogers    | United States of America |
| KiGee            | United States of America |
| HazelPhiltanker  | United States of America |
| RenskeLadwig     | United States of America |
| StephenStiles    | United States of America |
| JohnSeo          | United States of America |
| JoshuaPatel      | United States of America |
| TrennaRajs       | United States of America |
| CurtisDavies     | United States of America |
| RandallMatos     | United States of America |
| PeterVargas      | United States of America |
| JohnRussell      | NULL                     |
| KarenPartners    | NULL                     |
| AlbertoErrazuriz | NULL                     |
| GeraldCambrault  | NULL                     |
| EleniZlotkey     | NULL                     |
| PeterTucker      | NULL                     |
| DavidBernstein   | NULL                     |
| PeterHall        | NULL                     |
| ChristopherOlsen | NULL                     |
| NanetteCambrault | NULL                     |
| OliverTuvault    | NULL                     |
| JanetteKing      | NULL                     |
| PatrickSully     | NULL                     |
| AllanMcEwen      | NULL                     |
| LindseySmith     | NULL                     |
| LouiseDoran      | NULL                     |
| SarathSewall     | NULL                     |
| ClaraVishney     | NULL                     |
| DanielleGreene   | NULL                     |
| MatteaMarvins    | NULL                     |
| DavidLee         | NULL                     |
| SundarAnde       | NULL                     |
| AmitBanda        | NULL                     |
| LisaOzer         | NULL                     |
| HarrisonBloom    | NULL                     |
| TaylerFox        | NULL                     |
| WilliamSmith     | NULL                     |
| ElizabethBates   | NULL                     |
| SunditaKumar     | NULL                     |
| EllenAbel        | NULL                     |
| AlyssaHutton     | NULL                     |
| JonathonTaylor   | NULL                     |
| JackLivingston   | NULL                     |
| KimberelyGrant   | NULL                     |
| CharlesJohnson   | NULL                     |
| WinstonTaylor    | United States of America |
| JeanFleaur       | United States of America |
| MarthaSullivan   | United States of America |
| GirardGeoni      | United States of America |
| NanditaSarchand  | United States of America |
| AlexisBull       | United States of America |
| JuliaDellinger   | United States of America |
| AnthonyCabrio    | United States of America |
| KellyChung       | United States of America |
| JenniferDilly    | United States of America |
| TimothyGates     | United States of America |
| RandallPerkins   | United States of America |
| SarahBell        | United States of America |
| BritneyEverett   | United States of America |
| SamuelMcCain     | United States of America |
| VanceJones       | United States of America |
| AlanaWalsh       | United States of America |
| KevinFeeney      | United States of America |
| DonaldOConnell   | United States of America |
| DouglasGrant     | United States of America |
| JenniferWhalen   | United States of America |
| MichaelHartstein | Canada                   |
| PatFay           | Canada                   |
| SusanMavris      | United Kingdom           |
| HermannBaer      | Germany                  |
| ShelleyHiggins   | United States of America |
| WilliamGietz     | United States of America |
+------------------+--------------------------+
107 rows in set (0.00 sec)

18. Display department name, average salary and number of employees with 
commission within the department.

d2_56660>SELECT D.DEPARTMENT_NAME,AVG(E.SALARY),COUNT(E.EMPLOYEE_ID) FROM employees E LEFT JOIN departments D ON D.DEPARTMENT_ID=E.DEPARTMENT_ID WHERE E.COMMISSION_PCT!=-0 GROUP BY E.DEPARTMENT_ID;
+-----------------+---------------+----------------------+
| DEPARTMENT_NAME | AVG(E.SALARY) | COUNT(E.EMPLOYEE_ID) |
+-----------------+---------------+----------------------+
| Sales           |   8955.882353 |                   34 |
| NULL            |   7000.000000 |                    1 |
+-----------------+---------------+----------------------+
2 rows in set (0.00 sec)

19. Display the month in which more than 5 employees joined in any 
department located in Sydney.

d2_56660>SELECT MONTHNAME(E.HIRE_DATE) FROM employees E
    -> INNER JOIN departments D ON D.DEPARTMENT_ID=E.DEPARTMENT_ID
    -> INNER JOIN locations L ON D.LOCATION_ID=L.LOCATION_ID
    -> WHERE L.CITY='Sydney' GROUP BY MONTHNAME(E.HIRE_DATE) HAVING COUNT(E.EMPLOYEE_ID)>5;
Empty set (0.00 sec)

20. Display employee name, job title, start date, and end date of past jobs of 
all employees with commission percentage null

d2_56660>SELECT CONCAT(E.FIRST_NAME,' ',LAST_NAME) AS EMPLOYEE_NAME,J.JOB_TITLE,H.START_DATE,H.END_DATE
    -> FROM employees E LEFT JOIN jobs J ON J.JOB_ID=E.JOB_ID LEFT JOIN job_history H
    -> ON H.EMPLOYEE_ID=E.EMPLOYEE_ID WHERE E.COMMISSION_PCT IS NULL;
Empty set (0.00 sec)
