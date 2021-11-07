package com.utils;

import java.util.ArrayList;

import com.app.core.Account;

import custom_exceptions.AccountNotFoundException;
import custom_exceptions.InsufficientBalanceException;
import custom_exceptions.InvalidAccountException;

public interface Operations 
{
	public void addAccount(Account a, ArrayList<Account> accounts);
	
	public Account getAnAccount(String accNo, ArrayList<Account> accounts) throws InvalidAccountException;
	
	public void displayAllAccounts(ArrayList<Account> accounts);
	
	public void removeAccountByEmail(String email, ArrayList<Account> accounts) throws InvalidAccountException;
	
	public void withdrawCash(String accNo, double cash, ArrayList<Account> accounts) throws InvalidAccountException, InsufficientBalanceException;
	
	public void depositCash(String accNo, double cash, ArrayList<Account> accounts) throws InvalidAccountException;
	
	public void transferCash(String accNo1, String accNo2, double cash, ArrayList<Account> accounts) throws InvalidAccountException, InsufficientBalanceException;
	
	public void searchByName(String name, ArrayList<Account> accounts) throws AccountNotFoundException;
	
	public Account searchByEmail(String email, ArrayList<Account> accounts) throws AccountNotFoundException;
	
	public Account searchByPhone(String phone, ArrayList<Account> accounts) throws AccountNotFoundException;

}
