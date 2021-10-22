DROP PROCEDURE IF EXISTS area_per;

DELIMITER $$
CREATE PROCEDURE area_per(len INT,wid INT)
BEGIN
DECLARE area DOUBLE;
DECLARE per DOUBLE;
SET area=len*wid;
SET per=2*(len+wid);

SELECT area AS Area,per AS Perimeter;



END;
$$
DELIMITER ;