DROP PROCEDURE IF EXISTS i_conv;

DELIMITER $$

CREATE PROCEDURE i_conv(I INT)
BEGIN
	DECLARE yard INT;
    DECLARE foot INT;
    DECLARE inch INT;
    DECLARE temp INT;

	SET yard = I / 36;
    SET temp = I % 36;
    SET foot = temp / 12;
    SET inch = temp % 12;
	SELECT I AS INCHES_GIVEN, yard AS YARD, foot AS FOOT, inch INCH;
END;
$$

DELIMITER ;
