package com.exceptions;

@SuppressWarnings("serial")
public class DateOutOfCurrentYearException extends Exception{
	public DateOutOfCurrentYearException(String errorMessage) {
		super(errorMessage);
	}
}
