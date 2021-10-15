DROP PROCEDURE IF EXISTS primenum;


DELIMITER $$

CREATE PROCEDURE primenum(num INT)
BEGIN

    DECLARE i INT DEFAULT 2;
    DECLARE temp CHAR(40);

    prime: LOOP
        IF i=num THEN
            LEAVE prime;
        END IF;
        
        IF num%i = 0 THEN
            SET temp = 'Not Prime';
            LEAVE prime;
        END IF;

        SET i = i +1;
    END LOOP;

    IF i=num THEN
            SET temp = 'Prime';
    END IF;

    SELECT num AS Number, temp AS Status;

END;
$$

DELIMITER ;