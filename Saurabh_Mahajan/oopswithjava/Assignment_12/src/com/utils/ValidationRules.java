package com.utils;

import java.util.ArrayList;
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
	
	//Name, Email, Password, RegistrationAmount, DOB, Plan
	public static Customer verifyAllInputs(String name, String email, ArrayList<Customer> customer, 
			String password, double registrationAmount, String d, String plan) 
			throws CustomerHandlingException, ParseException
	{
		verifyEmail(email, customer);
		String verifiedPassword = verifyPassword(password);
		double verifiedRegistrationAmount = verifyRegistrationAmount(registrationAmount);
		Date verifiedDate = verifyDate(d);
		Plan verifiedPlan = verifyPlan(plan);
		
		return new Customer(name, email, verifiedPassword, verifiedRegistrationAmount, verifiedDate, verifiedPlan);
	}
	
	public static void verifyEmail(String temp, ArrayList<Customer> customer) throws CustomerHandlingException	
	{
		Customer e = new Customer(temp);				//temporary instance to compare email with database
		
		if(customer.contains(e))																		//checks email equality
			throw new CustomerHandlingException("Customer already exists !!!");
		if(!(temp.contains("@")))																		//checks if email contains @
			throw new CustomerHandlingException("Email id must contain '@' !!!");
		if(!(temp.endsWith(".com")))																	//checks if email ends with .com			
			throw new CustomerHandlingException("Email id must be from domain '.com' !!!");
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
	public static void displayArrayList(ArrayList<Customer> customer)
	{
		for(Customer c : customer)
			System.out.println(c);
	}
	
	public static Customer findByEmail(String temp, ArrayList<Customer> customer) throws CustomerHandlingException
	{
		Customer c = new Customer(temp);
		int index = customer.indexOf(c);
		
		if(index == -1)
			throw new CustomerHandlingException("Customer not found !!!");
		
		return customer.get(index);															//sends if match found
		
	}
	
	public static Customer customerLogin(String email, String password, ArrayList<Customer> customer) throws CustomerHandlingException
	{
		Customer c = findByEmail(email, customer);
		
		if(!(c.checkPassword(password)))
			throw new CustomerHandlingException("Password Incorrect !!!");
		
		return c;
	}

}
