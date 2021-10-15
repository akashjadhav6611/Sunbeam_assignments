DROP PROCEDURE IF EXISTS armstr;

DELIMITER $$

CREATE PROCEDURE armstr(num INT)
BEGIN
    DECLARE y INT DEFAULT num;
    DECLARE i INT;
    DECLARE arm INT DEFAULT 0;
    DECLARE res CHAR(30);

    WHILE y!=0 DO
        SET i=FLOOR(y%10);
        SET y=FLOOR(y/10);
        SET arm=arm + i*i*i;
    END WHILE;

    IF arm = num THEN
        SET res = 'Armstrong Number';
    ELSE
        SET res = 'Not an Armstrong Number';
    END IF; 

    SELECT num AS NUMBER, res AS Status;

END;
$$

DELIMITER ;