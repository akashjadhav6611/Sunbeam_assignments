package com.tester;

import java.util.Scanner;

import com.app.details.Customer;
import com.exception.CustomerHandlingException;
import static com.utils.ValidationRules.*;

public class Registration 
{
	public static void main(String[] args)													//main starts
	{
		try(Scanner scan = new Scanner(System.in))											//try 1 starts
		{
			System.out.println("Enter no of customers : ");
			Customer[] customer = new Customer[scan.nextInt()];								//Array of customers
			
			boolean key = false;
			int counter = 0;
			
			while(!key)																		//While starts
			{
				try																			//try 2 starts
				{
					System.out.println("1.Add a customer 2.Display all customers 3.Link adhaar card 10.Exit");
					switch (scan.nextInt()) 												//switch case starts
					{
						case 1:
							if(counter < customer.length)									//checks array availability
							{
								System.out.println("Enter customer details : Name, Email, Password, RegistrationAmount, DOB, Plan");
								Customer c = new Customer(scan.next(), 						//Name
										verifyEmail(scan.next(), customer), 				//Email
										verifyPassword(scan.next()), 						//Password
										verifyRegistrationAmount(scan.nextDouble()), 		//RegistrationAmount
										verifyDate(scan.next()), 							//DOB
										verifyPlan(scan.next()));							//Plan
								
								customer[counter++] = c;									//array element added
								System.out.println("Customer added to the database.");
							}
							else
								throw new CustomerHandlingException("Max capacity reached !!!");

							break;
							
						case 2:
							for(Customer e : customer)
								if(e != null)
									System.out.println(e);
							break;
	
						case 3:
							System.out.println("Enter email id of customer : ");
							Customer c1 = findByEmail(scan.next(), customer);					//find customers
							
							if(c1.getAdhaar() != null)											//checks if already linked
								throw new CustomerHandlingException("Adhaar already already linked");
							
							System.out.println("Enter adhaar details : AdhaarCardNo Location");
							c1.linkAdhaar(scan.next(), scan.next());							//links adhaar card
							System.out.println("Adhaar card linked...");
							break;
							
						case 10:
							System.out.println("Exited the program !!!");
							key = true;
							break;
							
						default:
							break;
					}
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				scan.nextLine();
			}
			
		}
	}
	

}
