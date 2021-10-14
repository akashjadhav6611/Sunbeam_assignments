DROP PROCEDURE IF EXISTS i_conv;

DELIMITER $$

CREATE PROCEDURE i_conv(I INT)
BEGIN
	DECLARE yard INT;
    DECLARE foot INT;
    DECLARE inch INT;
    DECLARE temp INT;

	SET yard = FLOOR(I / 36);
    SET temp = FLOOR(I % 36);
    SET foot = FLOOR(temp / 12);
    SET inch = FLOOR(temp % 12);
	SELECT I AS INCHES_GIVEN, yard AS YARD, foot AS FOOT, inch AS INCH;
END;
$$

DELIMITER ;
