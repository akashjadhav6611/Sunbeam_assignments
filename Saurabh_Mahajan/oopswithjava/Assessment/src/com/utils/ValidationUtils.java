package com.utils;

import java.util.ArrayList;

import com.app.core.Account;

import custom_exceptions.AccountHandlingException;

public class ValidationUtils 
{
	private static final int MINIMUM_NAME;
	private static final int MINIMUM_BALANCE;
	private static final int PHONE_CONST;
	
	static
	{
		MINIMUM_NAME = 5;
		MINIMUM_BALANCE = 100;
		PHONE_CONST = 10;
	}
	

	//[accNumber,name,email, phone,balance]
	public static Account verifyAllInputs(String accountNumber, String name, String email, String phone, double balance, ArrayList<Account> accounts) 
			throws AccountHandlingException
	{
		verifyAccountNumber(accountNumber, accounts);
		verifyName(name);
		verifyEmail(email, accounts);
		verifyPhone(phone, accounts);
		verifyBalance(balance);
		
		//if no exceptions are found, returns instance to tester
		return new Account(accountNumber, name, email, phone, balance);
	}

	public static void verifyName(String name) 
			throws AccountHandlingException
	{
		//name must be more than 5 characters
		if(name.length() <= MINIMUM_NAME)//if name has 5 or less characters, throws exception
			throw new AccountHandlingException("Name must contain more than 5 characters !!!");
	}
	
	public static void verifyBalance(double balance) 
			throws AccountHandlingException
	{
		//balance should be more than 100
		if(balance <= MINIMUM_BALANCE)//if balance is 100 or less
			throw new AccountHandlingException("Balance must be more than 100 !!!");
	}
	
	public static void verifyEmail(String email, ArrayList<Account> accounts) 
			throws AccountHandlingException
	{
		//email must contain @
		if(!(email.contains("@")))//if does not have @, throws exception
			throw new AccountHandlingException("Email must contain '@' !!!");
		
		for(Account a : accounts)//to check if given email is not linked to any other account
			if(email.equals(a.getEmail()))//if email found, throws exception
				throw new AccountHandlingException("Email already linked to another account !!!");
	}
	
	public static void verifyPhone(String phone, ArrayList<Account> accounts) 
			throws AccountHandlingException
	{
		//phone length must be 10 characters
		if(phone.length() != PHONE_CONST)//if not 10 characters, throws exception
			throw new AccountHandlingException("Phone number length must be 10 !!!");
		
		for(Account a : accounts)//to check if given phone is not linked to any other account
			if(phone.equals(a.getPhone()))//if phone found, throws exception
				throw new AccountHandlingException("Phone number already linked to another account !!!");
	}
	
	//checks if account number is duplicate (primary key)
	public static void verifyAccountNumber(String accNo, ArrayList<Account> accounts) 
			throws AccountHandlingException
	{
		Account a = new Account(accNo);//temporary instance to fulfill primary key functionality
		
		if(accounts.contains(a))//checks if primary key not duplicate
			throw new AccountHandlingException("Account already exists !!!");//throws exception
	}

}
