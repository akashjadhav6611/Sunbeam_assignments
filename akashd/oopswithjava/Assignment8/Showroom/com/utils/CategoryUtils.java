package com.utils;

import com.exceptions.InvalidCategoryException;

public class CategoryUtils {
	public static String validateCategory(String category) throws InvalidCategoryException{
		if (!(category.equals("Petrol")
			|| category.equals("Diesel")
			|| category.equals("EV")
			|| category.equals("Hybrid")
			|| category.equals("CNG"))) {
			throw new InvalidCategoryException("The category " + category + " is invalid");
		}
		return category;
	}
}
