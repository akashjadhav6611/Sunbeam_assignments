package com.utils;

import java.util.Date;
import static com.app.details.Customer.sdf;
import com.app.details.Customer;
import com.app.details.Plan;
import com.exception.CustomerHandlingException;
import java.text.ParseException;

public class ValidationRules 
{
	private static Date date;				//date given 
	private static final int MIN,MAX;		//password upper and lower bound
	private static StringBuilder sb;
	
	static
	{
		MIN = 4;
		MAX = 10;
		sb = new StringBuilder("");
		for(Plan p : Plan.values())
			sb.append(p+", ");				//appends all enum values
		
		try 
		{
			date = sdf.parse("01-01-1995");
		} 
		catch (ParseException e) 
		{
		}
	}
	
	public static String verifyEmail(String temp, Customer[] customer) throws CustomerHandlingException	
	{
		Customer e = new Customer(temp);				//temporary instance to compare email with database
		
		for(Customer c : customer)
		{
			if(c != null)
			{
				if(c.equals(e))																		//checks email equality
					throw new CustomerHandlingException("Customer already exists !!!");
				if(!(temp.contains("@")))															//checks if email contains @
					throw new CustomerHandlingException("Email id must contain '@' !!!");
				if(!(temp.endsWith(".com")))														//checks if email ends with .com			
					throw new CustomerHandlingException("Email id must be from domain '.com' !!!");
			}
		}
		return temp;
	}
	
	public static Date verifyDate(String temp) throws ParseException, CustomerHandlingException
	{
		Date d = sdf.parse(temp);
		
		if(d.after(date))																//checks if date is before given date
			throw new CustomerHandlingException("Date of birth not acceptable !!!");
		
		return d;
	}
	
	public static Plan verifyPlan(String temp) throws CustomerHandlingException
	{
		
		try 
		{
			return Plan.valueOf(temp.toUpperCase());									//return respective enum value
		} 
		catch (IllegalArgumentException e) 
		{
			System.out.println(e);
			System.out.println("Valid plans are : ");	
			throw new CustomerHandlingException(sb.toString());							//sends appended Enum values
		}
	}
	
	public static String verifyPassword(String temp) throws CustomerHandlingException
	{
		if(temp.length() < MIN || temp.length() > MAX)									//checks if password is greater than equal to 4 and less than equal to 10
			throw new CustomerHandlingException("Password should be atleast 4 characters and maximum 10 characters !!!");
		
		return temp;
	}
	
	public static double verifyRegistrationAmount(double temp) throws CustomerHandlingException
	{
		if(temp % 500 != 0)																//checks divisibility of amount by 500
			throw new CustomerHandlingException("Registration amount should be multiples of 500");
		return temp;
	}
	
	public static Customer findByEmail(String temp, Customer[] customer) throws CustomerHandlingException
	{
		Customer c = new Customer(temp);
		
		for(Customer e : customer)
			if(e != null)
				if(e.equals(c))																
					return e;															//sends if match found

		throw new CustomerHandlingException("Customer not found !!!");
	}

}
