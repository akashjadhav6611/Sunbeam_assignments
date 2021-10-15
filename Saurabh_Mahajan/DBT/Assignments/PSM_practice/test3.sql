DROP PROCEDURE IF EXISTS findprime;

DELIMITER $$

CREATE PROCEDURE findprime(low INT, high INT)
BEGIN

    DECLARE i INT DEFAULT low;
    DECLARE j INT;
    DECLARE temp INT;

    WHILE i<high DO

        SET j = 2;
        SET temp = 0;

        WHILE j<i DO
            IF i%j = 0 THEN
                SET temp=1;
            END IF;
            SET j = j+1;
        END WHILE;
        
        IF temp = 0 THEN
            INSERT INTO test VALUES(j);
        END IF;

        SET i = i + 1;

    END WHILE;
    

END;
$$

DELIMITER ;