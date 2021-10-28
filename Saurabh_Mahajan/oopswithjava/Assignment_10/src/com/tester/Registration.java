package com.tester;

import java.util.Date;
import java.util.Scanner;

import com.app.details.Customer;
import com.app.details.Plan;
import com.exception.CustomerHandlingException;
import static com.utils.ValidationRules.*;

public class Registration 
{
	public static void main(String[] args)
	{
		try(Scanner scan = new Scanner(System.in))
		{
			System.out.println("Enter no of customers : ");
			Customer[] customer = new Customer[scan.nextInt()];
			
			boolean key = false;
			int counter = 0;
			
			while(!key)
			{
				try
				{
					System.out.println("1.Add a customer 2.Display all customers 3.Link adhaar card 10.Exit");
					switch (scan.nextInt()) 
					{
						case 1:
							if(counter < customer.length)
							{
								System.out.println("Enter customer details : Name, Email, Password, RegistrationAmount, DOB, Plan");
								Customer c = new Customer(scan.next(), 
										verifyEmail(scan.next(), customer), 
										verifyPassword(scan.next()), 
										verifyRegistrationAmount(scan.nextDouble()), 
										verifyDate(scan.next()), 
										verifyPlan(scan.next()));
								
								customer[counter++] = c;
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
							Customer c1 = findByEmail(scan.next(), customer);
							
							if(c1.getAdhaar() != null)
								throw new CustomerHandlingException("Adhaar already already linked");
							
							System.out.println("Enter adhaar details : AdhaarCardNo Location");
							c1.linkAdhaar(scan.next(), scan.next());
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
