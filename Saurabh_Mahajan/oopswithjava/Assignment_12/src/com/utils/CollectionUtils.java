package com.utils;

import java.text.ParseException;
import java.util.ArrayList;

import com.app.details.Customer;
import com.exception.CustomerHandlingException;
import static com.utils.ValidationRules.*;

public class CollectionUtils 
{
	public static ArrayList<Customer> enterSampleData() throws ParseException, CustomerHandlingException
	{
		ArrayList<Customer> list = new ArrayList<>();
		
		////Name, Email, Password, RegistrationAmount, DOB, Plan
		
		list.add(new Customer("saurabh", "skmahajan4998@gmail.com", "saurabh", 25000, verifyDate("4-9-1994"), verifyPlan("gold")));
	
		list.add(new Customer("komal", "komal@gmail.com", "komal", 45000, verifyDate("21-8-1969"), verifyPlan("platinum")));
		
		list.add(new Customer("kamlakar", "kkm@gmail.com", "kamlakar", 55000, verifyDate("2-4-1959"), verifyPlan("diamond")));
		
		list.add(new Customer("kaustubh", "kstbh@gmail.com", "kaustubh", 35000, verifyDate("19-11-1988"), verifyPlan("diamond")));
		
		list.add(new Customer("kisan", "kisan@gmail.com", "kisan", 65000, verifyDate("8-2-1938"), verifyPlan("gold")));
		
		return list;
	}

}
