DROP PROCEDURE IF EXISTS yfi;

DELIMITER $$

CREATE PROCEDURE yfi(inch INT)
BEGIN
DECLARE yard INT;
DECLARE feet INT;
DECLARE ich INT;
SET yard= inch/36;
SET feet =(inch%36)/12;

SET ich=((inch%36)%12);
SELECT yard, feet,ich;


END;
$$

DELIMITER ;