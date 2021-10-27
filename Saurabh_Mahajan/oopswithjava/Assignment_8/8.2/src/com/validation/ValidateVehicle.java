package com.validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.app.vehicles.Vehicle;
import com.exception.*;

public class ValidateVehicle 
{
	
	
	public static void validateDate(String temp) throws ManufactureDateOutOfRangeException, ParseException
	{
		Date start = (Date)(new SimpleDateFormat("dd-MM-yyyy")).parse("01-04-2021");
		Date end = (Date)(new SimpleDateFormat("dd-MM-yyyy")).parse("31-03-2022");
		Date manu = (Date)(new SimpleDateFormat("dd-MM-yyyy")).parse(temp);
		
		if(manu.before(start))
		{
			throw new ManufactureDateOutOfRangeException("Before financial Year"+start.toString()+" !!!");
		}
		if(manu.after(end))
		{
			throw new ManufactureDateOutOfRangeException("After financial Year"+end.toString()+" !!!");
		}
	}
	
	public static void validateChasisNo(int temp, Vehicle[] v) throws DuplicateChasisNoException
	{
		boolean found = false;
		for(Vehicle vehicle : v) {
			if (vehicle != null) {
				if(temp == vehicle.getChasisNo()) {
					found = true;
				}
			}
		}
		
		if(found == true) {
			throw new DuplicateChasisNoException("Duplicate Chasis No !!!");
		}
		
	}
	
	public static void validateCategory(String temp) throws InvalidCategoryException
	{
		if(!(temp.equalsIgnoreCase("Diesel") || temp.equalsIgnoreCase("EV") || temp.equalsIgnoreCase("Hybrid") || temp.equalsIgnoreCase("CNG") || temp.equalsIgnoreCase("Petrol")))
		{
			throw new InvalidCategoryException("Category Invalid !!!");
		}
	}
	
}
