package tester;

import java.util.ArrayList;
import java.util.Scanner;

import com.app.core.Account;
import com.utils.AccountUtils;
import com.utils.Operations;

import custom_exceptions.AccountHandlingException;
import custom_exceptions.AccountNotFoundException;
import custom_exceptions.InsufficientBalanceException;
import custom_exceptions.InvalidAccountException;

import static com.utils.CollectionUtils.*;
import static com.utils.ValidationUtils.*;

public class Account_Tester {

	public static void main(String[] args) {
		//try with resources --> will free resources automaticallly
		try(Scanner scan = new Scanner(System.in))
		{//try block 1 starts
			//populating our arraylist by some sample data for testing
			ArrayList<Account> accounts = populateSampleData();
			//creating reference of Operations i/f with instance of AccountUtils to access overrided methods
			Operations operation = new AccountUtils();
			
			//while loop key
			boolean key = false;
			
			while(!key)
			{//while starts
				
				try
				{//try 2 starts
					//all functionalities choices
					System.out.println("\n1.Add an account 2.Display an account 3.Display all accounts "
							+ "\n4.Remove Account by email 5.Withdraw cash 6.Deposit cash "
							+ "7.Transfer cash \n8.Search account by name 9.Search account by email "
							+ "10.Search account by phone 0.Exit");
					System.out.println("Enter choice : ");
					switch (scan.nextInt()) 
					{
					case 1:
						//[accNumber,name,email, phone,balance]
						System.out.println("Enter account details : AccountNumber Name Email Phone Balance");
						//user input sent to ValidationUtils class method for verification
						//if any exception found --> handled by catch block and while loop repeats
						Account a = verifyAllInputs(scan.next(), scan.next(), scan.next(), scan.next(), scan.nextDouble(), accounts);
						//sends element to AccountUtils for adding is given arraylist
						operation.addAccount(a, accounts);
						//added account
						System.out.println("Account created successfully...");
						break;
						
					case 2://gets account details by accNo(primary key)
						System.out.println("Enter AccountNumber : ");
						//fetches Account by getAnAccount functionality, search by primary key(accountNumber)
						Account acc2 = operation.getAnAccount(scan.next(), accounts);
						//throws invalid account exception if not found
						//else prints toString() of fetched Account
						System.out.println(acc2);
						break;
						
					case 3://display all accounts in order it was added
						operation.displayAllAccounts(accounts);
						break;
						
					case 4://removes an account by searching email
						System.out.println("Enter email : ");
						//if found --> deletes account, else throws not found exception
						operation.removeAccountByEmail(scan.next(), accounts);
						break;
						
					case 5:
						System.out.println("Enter AccountNumber and amount to be withdrawn : ");
						//user will enter accountNumber and cash
						operation.withdrawCash(scan.next(), scan.nextDouble(), accounts);
						//if no exception, cash will be deducted from balance
						System.out.println("Transaction successful...");
						break;
						
					case 6:
						System.out.println("Enter AccountNumber and amount to be deposited : ");
						//user will enter accountNumber and cash
						operation.depositCash(scan.next(), scan.nextDouble(), accounts);
						//if no exception, cash will be added from balance
						System.out.println("Transaction successful...");
						break;
						
					case 7:
						System.out.println("Enter Account Numbers : ");
						System.out.println("Transfer from, Transfer to, Amount to be transfered");
						//user will enter both accountNumbers and cash
						operation.transferCash(scan.next(), scan.next(), scan.nextDouble(), accounts);
						//if no exceptions, cash will be transfered
						System.out.println("Transaction successful...");
						break;
						
					case 8:
						System.out.println("Enter name : ");
						//sending name accepted from user to functionality to print Account details
						operation.searchByName(scan.next(), accounts);
						break;
						
					case 9:
						System.out.println("Enter email : ");
						//fetches account by searching email
						Account acc9 = operation.searchByEmail(scan.next(), accounts);
						//if account found, prints fetched Account details
						System.out.println(acc9);
						break;
						
					case 10:
						System.out.println("Enter phone : ");
						//fetches account by searching phone
						Account acc10 = operation.searchByPhone(scan.next(), accounts);
						//if account found, prints fetched Account details
						System.out.println(acc10);
						break;
						
					case 0:
						System.out.println("Exited the program...");
						//will break the while loop
						key = true;
						break;

					default:
						//if any input except given choices is put by user
						System.out.println("Invalid input !!!");
						break;
					}
				}//try 2 ends
				catch(AccountHandlingException e)
				{
					System.out.println(e);
				}
				catch(AccountNotFoundException e)
				{
					System.out.println(e);
				}
				catch(InvalidAccountException e)
				{
					System.out.println(e);
				}
				catch(InsufficientBalanceException e)
				{
					System.out.println(e);
				}
				catch(Exception e)//catch all block
				{
					System.out.println(e);
				}
				scan.nextLine();
			}//while ends
			
		}//try block 1 ends
		catch(Exception e)
		{
			//prints exception details
			e.printStackTrace();
		}
	}

}
