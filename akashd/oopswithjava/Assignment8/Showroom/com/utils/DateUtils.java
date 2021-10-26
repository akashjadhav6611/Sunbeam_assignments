package com.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.exceptions.DateOutOfCurrentYearException;


public class DateUtils {
	
	public static String validateDate (String mfgDateString) throws ParseException, DateOutOfCurrentYearException {
		Date startDate = null;
		Date endDate = null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		startDate = sdf.parse("01-04-2021");
		endDate = sdf.parse("31-03-2022");
		
		Date mfgDate = sdf.parse(mfgDateString);
		if(mfgDate.after(endDate) || mfgDate.before(startDate)) {
			throw new DateOutOfCurrentYearException("Date " + mfgDateString + " should be in current year.");
		}
		return mfgDateString;
	}
}
