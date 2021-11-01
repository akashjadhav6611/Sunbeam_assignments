package com.exceptions;

@SuppressWarnings("serial")
public class CustomerHandlingException extends Exception {
	public CustomerHandlingException(String errorMessage) {
		super(errorMessage);
	}
}
