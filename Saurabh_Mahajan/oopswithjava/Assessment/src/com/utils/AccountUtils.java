package com.utils;

import java.util.ArrayList;

import com.app.core.Account;

import custom_exceptions.AccountNotFoundException;
import custom_exceptions.InsufficientBalanceException;
import custom_exceptions.InvalidAccountException;

public class AccountUtils implements Operations
{
	
	
	//adds an element to the arraylist
	public void addAccount(Account a, ArrayList<Account> accounts)
	{
		accounts.add(a);
	}
	
	//returns an account by searching account number or throws exception
	public Account getAnAccount(String accNo, ArrayList<Account> accounts)
			throws InvalidAccountException
	{
		Account acc = new Account(accNo); //temporary instance to search by primary key functionality
		
		if(accounts.contains(acc))//internally uses overrided equals method in Account class
		{
			int c = accounts.indexOf(acc);
			return accounts.get(c);//returns the account to tester
		}
		else
			throw new InvalidAccountException(accNo+" : Account not found !!!");//if not found 

	}
	
	//uses for each loop to display all accounts
	public void displayAllAccounts(ArrayList<Account> accounts)
	{
		//prints all accounts in the received arraylist
		for(Account a : accounts)
			System.out.println(a);
	}
	
	//removes the account if found
	public void removeAccountByEmail(String email, ArrayList<Account> accounts) 
			throws InvalidAccountException
	{
		for(Account a : accounts)
		{
			if(email.equals(a.getEmail()))//checks user input email equality with all account emails until found
			{
				System.out.println("Removal Status : "+accounts.remove(a));//removes if found
				return;//return to tester
			}
				
		}
		//if not returned to tester, email not found linked to any email 
		throw new InvalidAccountException("Account not found !!!");
	}

	//deduces balance if available by setter and getter
	public void withdrawCash(String accNo, double cash, ArrayList<Account> accounts) 
			throws InvalidAccountException, InsufficientBalanceException
	{
		Account acc = getAnAccount(accNo, accounts);//fetches account from given arraylist
		
		if(acc.getBalance() >= cash)//checks if balance is available to deduce
			acc.setBalance(acc.getBalance() - cash);//deduces balance
		else//if balance is less than cash to be withdrawn
			throw new InsufficientBalanceException("Insufficient balance !!!");
	
	}
	
	//deposit into balance by adding through setter
	public void depositCash(String accNo, double cash, ArrayList<Account> accounts) 
			throws InvalidAccountException
	{
		//fetches account from given arraylist
		Account acc = getAnAccount(accNo, accounts);
		
		//adds cash to Account balance by setter
		acc.setBalance(acc.getBalance() + cash);
		
	}
	
	
	//balance from 1 account to another account by getters and setters
	public void transferCash(String accNo1, String accNo2, double cash, ArrayList<Account> accounts) 
			throws InvalidAccountException, InsufficientBalanceException
	{
		Account acc1 = getAnAccount(accNo1, accounts);//getting account references 
		Account acc2 = getAnAccount(accNo2, accounts);//by account number
		
		if(acc1.getBalance() >= cash)//checks if balance is available to deduce
		{
			acc1.setBalance(acc1.getBalance() - cash);//deduces from 1st account
			acc2.setBalance(acc2.getBalance() + cash);//deposits into 2nd account
		}
		else//if balance is less than cash to be transfered in 2nd account
			throw new InsufficientBalanceException("Insufficient balance !!!");
	}
	
	public void searchByName(String name, ArrayList<Account> accounts) 
			throws AccountNotFoundException
	{
		//since name can be a duplicate, we cannot return after just printing 1 Account details
		//So traversing all accounts and printing if the name matches with account holders name
		boolean key = false;//to see if name if not found
		for(Account a : accounts)
			if(name.equals(a.getName()))
			{
				System.out.println(a);
				key = true;//implies that atleast 1 name is found
			}
		if(!key)//if key is false, that means no name match is found and then throw exception
			throw new AccountNotFoundException(name+" : No Account found with this name !!!");
				
	}
	
	
	//searches account by email and returns to caller
	public Account searchByEmail(String email, ArrayList<Account> accounts) 
			throws AccountNotFoundException
	{
		for(Account a : accounts)
			if(email.equals(a.getEmail()))//checks equality of received email with all emails registered until found
			{
				System.out.println("Account found : ");
				return a;//returns Account to tester if email is found, since no duplicate are possible
			}
		
		//if email is not found
		throw new AccountNotFoundException(email+" : No Account found with this email !!!");
		
	}
	
	public Account searchByPhone(String phone, ArrayList<Account> accounts) 
			throws AccountNotFoundException
	{
		for(Account a : accounts)
			if(phone.equals(a.getPhone()))//checks equality of received email with all phones registered until found
			{
				System.out.println("Account found : ");
				return a;//returns Account to tester if phone is found, since no duplicate are possible
			}
		//if phone is not found
		throw new AccountNotFoundException(phone+" : No Account found with this phone !!!");
		
	}
	
}
