package com.exceptions;

@SuppressWarnings("serial")
public class InvalidChasisException extends Exception {
	public InvalidChasisException(String errorMessage) {
		super(errorMessage);
	}
}
