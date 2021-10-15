DROP PROCEDURE IF EXISTS v_revv;

DELIMITER $$

CREATE PROCEDURE v_revv(x INT)
BEGIN

    DECLARE v_y INT DEFAULT x;
    DECLARE v_i INT;
    DECLARE v_rev INT DEFAULT 0;
    DECLARE res CHAR(30);

    WHILE v_y != 0 DO
		SET v_i = FLOOR(v_y%10);
        SET v_y = FLOOR(v_y/10);
        SET v_rev = v_rev*10 + v_i;
	END WHILE;

    IF v_rev = x THEN
        SET res = 'Number is a palindrome';
    ELSE
        SET res = 'Number is not a palindrome';
    END IF;    

    SELECT x, v_rev,res;    

END;
$$


DELIMITER ;

