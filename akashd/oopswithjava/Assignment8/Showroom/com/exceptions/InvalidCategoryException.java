package com.exceptions;

@SuppressWarnings("serial")
public class InvalidCategoryException extends Exception {
	public InvalidCategoryException(String errorMessage) {
		super(errorMessage);
	}
}
