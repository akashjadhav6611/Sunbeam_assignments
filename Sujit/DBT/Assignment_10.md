1. Write a SQL statement to rename the table EMP to EMPLOYEE.

d2_56660>ALTER TABLE emp RENAME employee;
Query OK, 0 rows affected (1.83 sec)

2. Write a SQL statement to add a column region to the table DEPT.

d2_56660>ALTER TABLE dept ADD COLUMN region char(20);
Query OK, 0 rows affected (2.13 sec)
Records: 0  Duplicates: 0  Warnings: 0

3. Write a SQL statement to add a dummy_ID as the first column of the table DUMMY.

d2_56660>ALTER TABLE dummy ADD COLUMN dummy_id INT FIRST;
Query OK, 0 rows affected (1.11 sec)
Records: 0  Duplicates: 0  Warnings: 0

4. Write a SQL statement to change the data type of the column sal to float in the table 
EMP.
d2_56660>ALTER TABLE employee MODIFY sal FLOAT;
Query OK, 14 rows affected (2.86 sec)
Records: 14  Duplicates: 0  Warnings: 0

5. Write a SQL statement to drop the column region from the table DEPT

d2_56660>ALTER TABLE dept DROP COLUMN region;
Query OK, 0 rows affected (1.07 sec)
Records: 0  Duplicates: 0  Warnings: 0


***part2***
1. Write a procedure that computes the perimeter and the area of a rectangle. Define 
your own values for the length and width. (Assuming that L and W are the length 
and width of the rectangle, Perimeter = 2*(L+W) and Area = L*W.

CREATE TABLE RECT(length FLOAT,Width FLOAT,Perimeter FLOAT,Area FLOAT);
DROP PROCEDURE IF EXISTS peri_area;

DELIMITER $$

CREATE PROCEDURE peri_area(L FLOAT,W FLOAT)
BEGIN
	
    DECLARE Perimeter FLOAT;
    DECLARE Area FLOAT;
	SET  Perimeter = 2*(L+W);
	SET  Area = L*W;
    INSERT INTO RECT VALUES(L,W,Perimeter,Area);
    SELECT L,W,Perimeter,Area;
END;
$$

d2_56660>CALL peri_area(7,9);
Query OK, 0 rows affected (0.08 sec)

DELIMITER ;
2. Write a procedure that declares an integer variable called num, assigns a value to it, 
and computes and inserts into the temp table the value of the variable itself, its 
square, and its cube.

CREATE TABLE temp(num INT,sq INT, cu INT);

DROP PROCEDURE IF EXISTS sq_cube;

DELIMITER $$

CREATE PROCEDURE sq_cube(num INT)
BEGIN
	
 
	DECLARE sq INT;
	DECLARE cu INT;
	SET  sq = num*num;
	SET  cu = sq*num;
    INSERT INTO temp VALUES(num,sq,cu);
    SELECT num,sq,cu;
END;
$$

DELIMITER ;

d2_56660>SOURCE D:/cdac/demo_codes/02.sql
d2_56660>CALL sq_cube(6);
3. Create a procedure to Convert a temperature in Fahrenheit (F) to its equivalent in 
Celsius (C) and vice versa. The required formulae are:- C= (F-32)*5/9 F= 9/5*C + 
32

DROP PROCEDURE IF EXISTS conversion;

DELIMITER $$

CREATE PROCEDURE conversion(F FLOAT,C FLOAT)
BEGIN
	
 	DECLARE CEL FLOAT;
	DECLARE FAR FLOAT;
	SET  CEL =((F-32)*5)/9;
	SET  FAR =((9*C)/5)+32;
   
    SELECT FAR,CEL;
END;
$$

DELIMITER ;
d2_56660>SOURCE D:/cdac/demo_codes/03.sql
d2_56660>CALL conversion(100,37);

4. Create a procedure to Convert a number of inches into yards, feet, and inches. For 
example, 124 inches equals 3 yards, 1 foot, and 4 inches.

DROP PROCEDURE IF EXISTS in_conv;

DELIMITER $$

CREATE PROCEDURE in_conv(inches INT)
BEGIN
	
 	DECLARE yard INT;
	DECLARE feet INT;
	DECLARE  inch INT;
	DECLARE TOTAL_INCHES INT;
	SET TOTAL_INCHES = inches;
	SET yard = inches/36;
	SET feet = (inches%36)/12;
	SET inch = (inches%36)%12;
	
   	SELECT TOTAL_INCHES,yard AS YARDS,feet AS FOOTS,inch AS INCHES; 
    
END;
$$

DELIMITER ;
d2_56660>SOURCE D:/cdac/demo_codes/04.sql
d2_56660>CALL in_conv(124);

5. Create a procedure that takes department ID and changes the manager ID for the 
department to the employee in the department with lowest salary


DROP PROCEDURE IF EXISTS rep;

DELIMITER $$

CREATE PROCEDURE rep(did INT)
BEGIN
	
 	DECLARE empid INT;
	SET empid=(SELECT EMPLOYEE_ID FROM employees WHERE DEPARTMENT_ID=did AND SALARY=
    (SELECT MIN(SALARY) FROM employees WHERE DEPARTMENT_ID=did) LIMIT 1);
	
	UPDATE departments SET MANAGER_ID=empid WHERE DEPARTMENT_ID=did;
   	 SELECT * FROM departments;
    
END;
$$

DELIMITER ;

d2_56660>SOURCE D:\cdac\demo_codes\05.sql
Query OK, 0 rows affected, 1 warning (0.03 sec)
d2_56660>CALL rep(80);