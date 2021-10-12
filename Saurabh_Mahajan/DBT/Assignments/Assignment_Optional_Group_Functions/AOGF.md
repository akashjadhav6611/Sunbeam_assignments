Note : To solve below queries use “hr” database




1. Display first name and last name after converting the first letter of each name to upper case and the rest to lower case.

D3_56588>SELECT CONCAT(UPPER(SUBSTR(FIRST_NAME,1,1)), SUBSTR(FIRST_NAME,2)) AS FIRST_NAME, CONCAT(UPPER(SUBSTR(LAST_NAME,1,1)), SUBSTR(LAST_NAME,2)) AS LAST_NAME FROM employees;
+-------------+-------------+
| FIRST_NAME  | LAST_NAME   |
+-------------+-------------+
| Ellen       | Abel        |
| Sundar      | Ande        |
| Mozhe       | Atkinson    |
| David       | Austin      |
| Hermann     | Baer        |
| Shelli      | Baida       |
| Amit        | Banda       |
| Elizabeth   | Bates       |
| Sarah       | Bell        |
| David       | Bernstein   |
| Laura       | Bissot      |
| Harrison    | Bloom       |
| Alexis      | Bull        |
| Anthony     | Cabrio      |
| Gerald      | Cambrault   |
| Nanette     | Cambrault   |
| John        | Chen        |
| Kelly       | Chung       |
| Karen       | Colmenares  |
| Curtis      | Davies      |
| Lex         | De Haan     |
| Julia       | Dellinger   |
| Jennifer    | Dilly       |
| Louise      | Doran       |
| Bruce       | Ernst       |
| Alberto     | Errazuriz   |
| Britney     | Everett     |
| Daniel      | Faviet      |
| Pat         | Fay         |
| Kevin       | Feeney      |
| Jean        | Fleaur      |
| Tayler      | Fox         |
| Adam        | Fripp       |
| Timothy     | Gates       |
| Ki          | Gee         |
| Girard      | Geoni       |
| William     | Gietz       |
| Douglas     | Grant       |
| Kimberely   | Grant       |
| Nancy       | Greenberg   |
| Danielle    | Greene      |
| Peter       | Hall        |
| Michael     | Hartstein   |
| Shelley     | Higgins     |
| Guy         | Himuro      |
| Alexander   | Hunold      |
| Alyssa      | Hutton      |
| Charles     | Johnson     |
| Vance       | Jones       |
| Payam       | Kaufling    |
| Alexander   | Khoo        |
| Janette     | King        |
| Steven      | King        |
| Neena       | Kochhar     |
| Sundita     | Kumar       |
| Renske      | Ladwig      |
| James       | Landry      |
| David       | Lee         |
| Jack        | Livingston  |
| Diana       | Lorentz     |
| Jason       | Mallin      |
| Steven      | Markle      |
| James       | Marlow      |
| Mattea      | Marvins     |
| Randall     | Matos       |
| Susan       | Mavris      |
| Samuel      | McCain      |
| Allan       | McEwen      |
| Irene       | Mikkilineni |
| Kevin       | Mourgos     |
| Julia       | Nayer       |
| Donald      | OConnell    |
| Christopher | Olsen       |
| TJ          | Olson       |
| Lisa        | Ozer        |
| Karen       | Partners    |
| Valli       | Pataballa   |
| Joshua      | Patel       |
| Randall     | Perkins     |
| Hazel       | Philtanker  |
| Luis        | Popp        |
| Trenna      | Rajs        |
| Den         | Raphaely    |
| Michael     | Rogers      |
| John        | Russell     |
| Nandita     | Sarchand    |
| Ismael      | Sciarra     |
| John        | Seo         |
| Sarath      | Sewall      |
| Lindsey     | Smith       |
| William     | Smith       |
| Stephen     | Stiles      |
| Martha      | Sullivan    |
| Patrick     | Sully       |
| Jonathon    | Taylor      |
| Winston     | Taylor      |
| Sigal       | Tobias      |
| Peter       | Tucker      |
| Oliver      | Tuvault     |
| Jose Manuel | Urman       |
| Peter       | Vargas      |
| Clara       | Vishney     |
| Shanta      | Vollman     |
| Alana       | Walsh       |
| Matthew     | Weiss       |
| Jennifer    | Whalen      |
| Eleni       | Zlotkey     |
+-------------+-------------+
107 rows in set (0.00 sec)












2. Display the first word in job title.

D3_56588>SELECT SUBSTR(JOB_TITLE,1,1) FROM jobs;
+-----------------------+
| SUBSTR(JOB_TITLE,1,1) |
+-----------------------+
| P                     |
| A                     |
| A                     |
| F                     |
| A                     |
| A                     |
| P                     |
| S                     |
| S                     |
| P                     |
| P                     |
| S                     |
| S                     |
| S                     |
| P                     |
| M                     |
| M                     |
| H                     |
| P                     |
+-----------------------+
19 rows in set (0.00 sec)












3. Display the length of first name for employees where last name contain character ‘b’ after 3rd position.

D3_56588>SELECT LENGTH(FIRST_NAME) FROM employees WHERE FIRST_NAME LIKE '___%b';
Empty set (0.10 sec)











4. Display first name in upper case and email address in lower case for employees where the first name and email address are same irrespective of the case.

D3_56588>SELECT UPPER(FIRST_NAME),LOWER(EMAIL) FROM employees WHERE FIRST_NAME = EMAIL;
Empty set (0.00 sec)










5. Display first name, salary, and round the salary to thousands.

D3_56588>SELECT FIRST_NAME, SALARY, ROUND(SALARY,-3) FROM employees;
+-------------+----------+------------------+
| FIRST_NAME  | SALARY   | ROUND(SALARY,-3) |
+-------------+----------+------------------+
| Steven      | 24000.00 |            24000 |
| Neena       | 17000.00 |            17000 |
| Lex         | 17000.00 |            17000 |
| Alexander   |  9000.00 |             9000 |
| Bruce       |  6000.00 |             6000 |
| David       |  4800.00 |             5000 |
| Valli       |  4800.00 |             5000 |
| Diana       |  4200.00 |             4000 |
| Nancy       | 12000.00 |            12000 |
| Daniel      |  9000.00 |             9000 |
| John        |  8200.00 |             8000 |
| Ismael      |  7700.00 |             8000 |
| Jose Manuel |  7800.00 |             8000 |
| Luis        |  6900.00 |             7000 |
| Den         | 11000.00 |            11000 |
| Alexander   |  3100.00 |             3000 |
| Shelli      |  2900.00 |             3000 |
| Sigal       |  2800.00 |             3000 |
| Guy         |  2600.00 |             3000 |
| Karen       |  2500.00 |             3000 |
| Matthew     |  8000.00 |             8000 |
| Adam        |  8200.00 |             8000 |
| Payam       |  7900.00 |             8000 |
| Shanta      |  6500.00 |             7000 |
| Kevin       |  5800.00 |             6000 |
| Julia       |  3200.00 |             3000 |
| Irene       |  2700.00 |             3000 |
| James       |  2400.00 |             2000 |
| Steven      |  2200.00 |             2000 |
| Laura       |  3300.00 |             3000 |
| Mozhe       |  2800.00 |             3000 |
| James       |  2500.00 |             3000 |
| TJ          |  2100.00 |             2000 |
| Jason       |  3300.00 |             3000 |
| Michael     |  2900.00 |             3000 |
| Ki          |  2400.00 |             2000 |
| Hazel       |  2200.00 |             2000 |
| Renske      |  3600.00 |             4000 |
| Stephen     |  3200.00 |             3000 |
| John        |  2700.00 |             3000 |
| Joshua      |  2500.00 |             3000 |
| Trenna      |  3500.00 |             4000 |
| Curtis      |  3100.00 |             3000 |
| Randall     |  2600.00 |             3000 |
| Peter       |  2500.00 |             3000 |
| John        | 14000.00 |            14000 |
| Karen       | 13500.00 |            14000 |
| Alberto     | 12000.00 |            12000 |
| Gerald      | 11000.00 |            11000 |
| Eleni       | 10500.00 |            11000 |
| Peter       | 10000.00 |            10000 |
| David       |  9500.00 |            10000 |
| Peter       |  9000.00 |             9000 |
| Christopher |  8000.00 |             8000 |
| Nanette     |  7500.00 |             8000 |
| Oliver      |  7000.00 |             7000 |
| Janette     | 10000.00 |            10000 |
| Patrick     |  9500.00 |            10000 |
| Allan       |  9000.00 |             9000 |
| Lindsey     |  8000.00 |             8000 |
| Louise      |  7500.00 |             8000 |
| Sarath      |  7000.00 |             7000 |
| Clara       | 10500.00 |            11000 |
| Danielle    |  9500.00 |            10000 |
| Mattea      |  7200.00 |             7000 |
| David       |  6800.00 |             7000 |
| Sundar      |  6400.00 |             6000 |
| Amit        |  6200.00 |             6000 |
| Lisa        | 11500.00 |            12000 |
| Harrison    | 10000.00 |            10000 |
| Tayler      |  9600.00 |            10000 |
| William     |  7400.00 |             7000 |
| Elizabeth   |  7300.00 |             7000 |
| Sundita     |  6100.00 |             6000 |
| Ellen       | 11000.00 |            11000 |
| Alyssa      |  8800.00 |             9000 |
| Jonathon    |  8600.00 |             9000 |
| Jack        |  8400.00 |             8000 |
| Kimberely   |  7000.00 |             7000 |
| Charles     |  6200.00 |             6000 |
| Winston     |  3200.00 |             3000 |
| Jean        |  3100.00 |             3000 |
| Martha      |  2500.00 |             3000 |
| Girard      |  2800.00 |             3000 |
| Nandita     |  4200.00 |             4000 |
| Alexis      |  4100.00 |             4000 |
| Julia       |  3400.00 |             3000 |
| Anthony     |  3000.00 |             3000 |
| Kelly       |  3800.00 |             4000 |
| Jennifer    |  3600.00 |             4000 |
| Timothy     |  2900.00 |             3000 |
| Randall     |  2500.00 |             3000 |
| Sarah       |  4000.00 |             4000 |
| Britney     |  3900.00 |             4000 |
| Samuel      |  3200.00 |             3000 |
| Vance       |  2800.00 |             3000 |
| Alana       |  3100.00 |             3000 |
| Kevin       |  3000.00 |             3000 |
| Donald      |  2600.00 |             3000 |
| Douglas     |  2600.00 |             3000 |
| Jennifer    |  4400.00 |             4000 |
| Michael     | 13000.00 |            13000 |
| Pat         |  6000.00 |             6000 |
| Susan       |  6500.00 |             7000 |
| Hermann     | 10000.00 |            10000 |
| Shelley     | 12000.00 |            12000 |
| William     |  8300.00 |             8000 |
+-------------+----------+------------------+
107 rows in set (0.00 sec)











6. Display employee ID and the date on which he ended his previous job.

D3_56588>SELECT EMPLOYEE_ID , MAX(END_DATE) FROM job_history WHERE EMPLOYEE_ID IN (SELECT EMPLOYEE_ID FROM job_history GROUP BY EMPLOYEE_ID HAVING COUNT(EMPLOYEE_ID) > 1) GROUP BY EMPLOYEE_ID;
+-------------+---------------+
| EMPLOYEE_ID | MAX(END_DATE) |
+-------------+---------------+
|         101 | 1997-03-15    |
|         176 | 1999-12-31    |
|         200 | 1998-12-31    |
+-------------+---------------+
3 rows in set (0.00 sec)












7. Display first name and date of first salary of the employees.













8. Display first name and experience of the employees.

D3_56588>SELECT h.EMPLOYEE_ID,e.FIRST_NAME,(DATEDIFF(h.END_DATE, h.START_DATE)/365) Experience FROM job_history h LEFT JOIN employees e ON e.EMPLOYEE_ID = h.EMPLOYEE_ID;
+-------------+------------+------------+
| EMPLOYEE_ID | FIRST_NAME | Experience |
+-------------+------------+------------+
|         102 | Lex        |     5.5288 |
|         101 | Neena      |     4.1014 |
|         101 | Neena      |     3.3808 |
|         201 | Michael    |     3.8384 |
|         114 | Den        |     1.7726 |
|         122 | Payam      |     0.9973 |
|         200 | Jennifer   |     5.7534 |
|         176 | Jonathon   |     0.7726 |
|         176 | Jonathon   |     0.9973 |
|         200 | Jennifer   |     4.5041 |
|           0 | NULL       |       NULL |
+-------------+------------+------------+
11 rows in set (0.00 sec)










9. Display first name of employees who joined in 2001.

D3_56588>SELECT h.EMPLOYEE_ID, e.FIRST_NAME FROM job_history h INNER JOIN employees e ON e.EMPLOYEE_ID = h.EMPLOYEE_ID WHERE YEAR(h.START_DATE) = 2001;
Empty set (0.00 sec)












10. Display employees who joined in the current year.

D3_56588>SELECT FIRST_NAME FROM employees WHERE YEAR(HIRE_DATE) = YEAR(NOW());
Empty set (0.00 sec)













11. Display the number of days between system date and 1st January 2011.

D3_56588>SELECT DATEDIFF(SYSDATE(), '20110101');
+---------------------------------+
| DATEDIFF(SYSDATE(), '20110101') |
+---------------------------------+
|                            3933 |
+---------------------------------+
1 row in set (0.00 sec)













12. Display number of employees joined after 15th of the month.

D3_56588>SELECT FIRST_NAME FROM employees WHERE DAYOFMONTH(HIRE_DATE) > 15;
+-------------+
| FIRST_NAME  |
+-------------+
| Steven      |
| Neena       |
| Lex         |
| Alexander   |
| Bruce       |
| David       |
| Valli       |
| Diana       |
| Nancy       |
| Daniel      |
| John        |
| Ismael      |
| Jose Manuel |
| Luis        |
| Laura       |
| Mozhe       |
| James       |
| TJ          |
| Jason       |
| Michael     |
| Ki          |
| Hazel       |
| Renske      |
| Stephen     |
| John        |
| Joshua      |
| Trenna      |
| Curtis      |
| Randall     |
| Peter       |
| Louise      |
| Sarath      |
| Clara       |
| Danielle    |
| Mattea      |
| David       |
| Sundar      |
| Amit        |
| Lisa        |
| Harrison    |
| Tayler      |
| William     |
| Elizabeth   |
| Sundita     |
| Ellen       |
| Alyssa      |
| Randall     |
| Sarah       |
| Britney     |
| Samuel      |
| Vance       |
| Alana       |
| Kevin       |
| Donald      |
| Douglas     |
| Jennifer    |
| Michael     |
| Pat         |
| Susan       |
| Hermann     |
| Shelley     |
+-------------+
61 rows in set (0.09 sec)















13. Display third highest salary of employees.

D3_56588>SELECT SALARY FROM EMPLOYEES LIMIT 2,1;
+----------+
| SALARY   |
+----------+
| 17000.00 |
+----------+
1 row in set (0.00 sec)



