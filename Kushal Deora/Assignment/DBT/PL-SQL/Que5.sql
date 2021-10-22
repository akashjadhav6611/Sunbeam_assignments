DROP PROCEDURE IF EXISTS emde;

DELIMITER $$

CREATE PROCEDURE emde(id_d INT)
BEGIN
 DECLARE mgid INT;
SELECT mgr INTO mgid FROM employee WHERE deptno=id_d ORDER BY sal LIMIT 1;

UPDATE employee SET mgr=mgid WHERE deptno=id_d AND job='MANAGER';
SELECT * FROM Employee;
END;
$$

DELIMITER ;

