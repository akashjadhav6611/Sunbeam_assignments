Note: To solve below queries use “spj” database
*Use appropriate joins to solve following queries.





1. Display the Supplier name and the Quantity sold.

D3_56588>select s.Sname,SUM(sp.QTY) from s LEFT JOIN sp ON s.`S#` = sp.`S#` GROUP BY s.`S#`;
+-------+-------------+
| Sname | SUM(sp.QTY) |
+-------+-------------+
| Smith |         900 |
| Jones |        3200 |
| Blake |         700 |
| Clark |         600 |
| Adams |        3100 |
+-------+-------------+
5 rows in set (0.00 sec)







2. Display the Part name and Quantity sold.

D3_56588>select p.Pname,SUM(sp.QTY) from p LEFT JOIN sp ON p.`P#` = sp.`P#` GROUP BY p.`P#`;
+-------+-------------+
| Pname | SUM(sp.QTY) |
+-------+-------------+
| Nut   |        1000 |
| Bolt  |         300 |
| Screw |        3500 |
| Screw |        1300 |
| Cam   |        1100 |
| Cog   |        1300 |
+-------+-------------+
6 rows in set (0.03 sec)








3. Display the Project name and Quantity sold.

D3_56588>select j.Jname,SUM(sp.QTY) from j LEFT JOIN sp ON j.`J#` = sp.`J#` GROUP BY j.`J#`;
+----------+-------------+
| Jname    | SUM(sp.QTY) |
+----------+-------------+
| Sorter   |         800 |
| Punch    |        1200 |
| Reader   |         500 |
| Console  |        3300 |
| Collator |        1100 |
| Terminal |         400 |
| Tape     |        1200 |
+----------+-------------+
7 rows in set (0.13 sec)








4. Display the Supplier name, Part name, Project name and Quantity sold.

D3_56588>SELECT s.sname, p.pname, j.jname, sp.qty FROM sp INNER JOIN s ON sp.`s#` = s.`s#` INNER JOIN p ON sp.`p#` = p.`p#` INNER JOIN j ON sp.`j#` = j.`j#`;
+-------+-------+----------+------+
| sname | pname | jname    | qty  |
+-------+-------+----------+------+
| Jones | Screw | Sorter   |  400 |
| Blake | Screw | Sorter   |  200 |
| Smith | Nut   | Sorter   |  200 |
| Adams | Cog   | Punch    |  200 |
| Jones | Cam   | Punch    |  100 |
| Blake | Screw | Punch    |  500 |
| Jones | Screw | Punch    |  200 |
| Adams | Bolt  | Punch    |  200 |
| Clark | Cog   | Reader   |  300 |
| Jones | Screw | Reader   |  200 |
| Adams | Cog   | Console  |  500 |
| Adams | Cam   | Console  |  400 |
| Adams | Screw | Console  |  800 |
| Jones | Screw | Console  |  500 |
| Adams | Screw | Console  |  200 |
| Adams | Bolt  | Console  |  100 |
| Smith | Nut   | Console  |  700 |
| Adams | Nut   | Console  |  100 |
| Adams | Cam   | Collator |  500 |
| Jones | Screw | Collator |  600 |
| Jones | Screw | Terminal |  400 |
| Clark | Cog   | Tape     |  300 |
| Adams | Cam   | Tape     |  100 |
| Jones | Screw | Tape     |  800 |
+-------+-------+----------+------+
24 rows in set (0.01 sec)






5. Display the Supplier name, Supplying Parts to a Project in the same City.

D3_56588>select S.Sname,J.Jname from S INNER JOIN J ON S.City = J.City;
+-------+----------+
| Sname | Jname    |
+-------+----------+
| Blake | Sorter   |
| Jones | Sorter   |
| Adams | Reader   |
| Adams | Console  |
| Clark | Collator |
| Smith | Collator |
| Clark | Tape     |
| Smith | Tape     |
+-------+----------+
8 rows in set (0.00 sec)








6. Display the Part name that is ‘Red’ is color, and the Quantity sold.

D3_56588>SELECT p.Pname, SUM(sp.QTY) FROM p INNER JOIN sp ON p.`P#` = sp.`P#` WHERE p.Color = 'Red' GROUP BY p.`P#`;
+-------+-------------+
| Pname | SUM(sp.QTY) |
+-------+-------------+
| Nut   |        1000 |
| Screw |        1300 |
| Cog   |        1300 |
+-------+-------------+
3 rows in set (0.00 sec)









7. Display all the Quantity sold by Suppliers with the Status = 20.

D3_56588>SELECT S.Sname,SUM(sp.QTY) FROM S LEFT JOIN sp ON sp.`S#` = s.`S#` WHERE Status = 20 GROUP BY s.`S#`;
+-------+-------------+
| Sname | SUM(sp.QTY) |
+-------+-------------+
| Smith |         900 |
| Clark |         600 |
+-------+-------------+
2 rows in set (0.00 sec)










8. Display all the Parts and Quantity with a Weight > 14.

D3_56588>SELECT p.Pname,SUM(sp.QTY) FROM p LEFT JOIN sp ON sp.`P#` = p.`P#` WHERE Weight > 14 GROUP BY p.`P#`;
+-------+-------------+
| Pname | SUM(sp.QTY) |
+-------+-------------+
| Bolt  |         300 |
| Screw |        3500 |
| Cog   |        1300 |
+-------+-------------+
3 rows in set (0.00 sec)









9. Display all the Project names and City, which has bought more than 500 Parts.

D3_56588>SELECT j.Jname,j.City,SUM(sp.QTY) FROM j LEFT JOIN sp ON sp.`J#` = j.`J#` GROUP BY j.`J#` HAVING SUM(sp.QTY) > 500;
+----------+--------+-------------+
| Jname    | City   | SUM(sp.QTY) |
+----------+--------+-------------+
| Sorter   | Paris  |         800 |
| Punch    | Rome   |        1200 |
| Console  | Athens |        3300 |
| Collator | London |        1100 |
| Tape     | London |        1200 |
+----------+--------+-------------+
5 rows in set (0.00 sec)










10. Display all the Part names and Quantity sold that have a Weight less than 15.

D3_56588>SELECT p.Pname,SUM(sp.QTY) FROM p LEFT JOIN sp ON sp.`P#` = p.`P#` WHERE Weight < 15 GROUP BY p.`P#`;
+-------+-------------+
| Pname | SUM(sp.QTY) |
+-------+-------------+
| Nut   |        1000 |
| Screw |        1300 |
| Cam   |        1100 |
+-------+-------------+
3 rows in set (0.00 sec)










11. Display all the Suppliers with the same Status as the supplier, ‘CLARK’.

D3_56588>SELECT Sname FROM s WHERE Status = (SELECT Status FROM s WHERE Sname = 'CLARK');
+-------+
| Sname |
+-------+
| Smith |
| Clark |
+-------+
2 rows in set (0.00 sec)











12. Display all the Employees in the same department as the employee ‘MILLER’.

(UNAVAILABLE)









13. Display all the Parts which have more Weight than all the Red parts.

D3_56588>SELECT Pname FROM p WHERE Weight > (SELECT MAX(Weight) FROM p WHERE Color = 'Red');
Empty set (0.09 sec)










14. Display all the Projects going on in the same city as the project ‘TAPE’.

D3_56588>SELECT Jname FROM j WHERE City = (SELECT City FROM j WHERE Jname = 'TAPE');
+----------+
| Jname    |
+----------+
| Collator |
| Tape     |
+----------+
2 rows in set (0.00 sec)








15. Display all the Parts with Weight less than all the Green parts.

D3_56588>SELECT Pname FROM p WHERE Weight < (SELECT MAX(Weight) FROM p WHERE Color = 'Green');
+-------+
| Pname |
+-------+
| Nut   |
| Screw |
| Cam   |
+-------+
3 rows in set (0.00 sec)










16. Display the name of the Supplier who has sold the maximum Quantity (in one sale).

D3_56588>SELECT sp.`S#`,s.Sname,MAX(QTY) FROM sp LEFT JOIN s ON sp.`S#` = s.`S#` GROUP BY sp.`S#` ORDER BY MAX(QTY) DESC LIMIT 1;
+------+-------+----------+
| S#   | Sname | MAX(QTY) |
+------+-------+----------+
| S5   | Adams |      800 |
+------+-------+----------+
1 row in set (0.00 sec)










17. Display the name of the Employee with the minimum Salary.

(UNAVAILABLE)








18. Display the name of the Supplier who has sold the maximum overall Quantity (sum of Sales).

D3_56588>SELECT sp.`S#`,s.Sname,SUM(QTY) FROM sp LEFT JOIN s ON sp.`S#` = s.`S#` GROUP BY sp.`S#` ORDER BY SUM(QTY) DESC LIMIT 1;
+------+-------+----------+
| S#   | Sname | SUM(QTY) |
+------+-------+----------+
| S2   | Jones |     3200 |
+------+-------+----------+
1 row in set (0.00 sec)









