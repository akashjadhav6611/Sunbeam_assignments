package com.utils;

import java.util.ArrayList;

import com.app.core.Account;

public class CollectionUtils 
{
	public static ArrayList<Account> populateSampleData()
	{
		ArrayList<Account> accounts = new ArrayList<>();

		//[accNumber,name,email, phone,balance]
		//adding sample data to arraylist one by one 
		
		accounts.add(new Account("6644225511338877", "john", "john@gmail.com", "7806632445", 5000));
		
		accounts.add(new Account("8456329715326487", "mark", "mark@gmail.com", "8563247954", 8500));
		
		accounts.add(new Account("7216583495134756", "sam", "sam@gmail.com", "7436598124", 12000));
		
		accounts.add(new Account("9431678256437184", "dean", "dean@gmail.com", "6892347512", 2000));
		
		accounts.add(new Account("7468512349856713", "barry", "barry@gmail.com", "7564123894", 18000));
		
		return accounts;
	}

}
