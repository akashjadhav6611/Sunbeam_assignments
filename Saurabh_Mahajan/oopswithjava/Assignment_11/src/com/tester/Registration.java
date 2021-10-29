package com.tester;

import java.util.ArrayList;
import java.util.Scanner;

import com.app.details.Customer;
import com.exception.CustomerHandlingException;
import static com.utils.ValidationRules.*;
import static com.utils.CollectionUtils.*;

public class Registration 
{
	public static void main(String[] args)													//main starts
	{
		try(Scanner scan = new Scanner(System.in))											//try 1 starts
		{
			ArrayList<Customer> customer = enterSampleData(); 							//Array of customers
			
			
			boolean key = false;
			
			while(!key)																		//While starts
			{
				try																			//try 2 starts
				{
					System.out.println("1.Add a customer 2.Display all customers 3.Link adhaar card 4.Customer Login "
							+ "5.Change password 6.Unsubscribe customer \n7.Display customer names who have taken specific plan"
							+ " 8.Display customers born after date 9.Search customer by location "
							+ "10.Exit");
					switch (scan.nextInt()) 												//switch case starts
					{
						case 1:
								System.out.println("Enter customer details : Name, Email, Password, RegistrationAmount, DOB, Plan");
								Customer c1 = verifyAllInputs(scan.next(), scan.next(), customer, scan.next(), 
										scan.nextDouble(), scan.next(), scan.next());
								
								customer.add(c1);
								System.out.println("Customer added to the database.");

							break;
							
						case 2:
							displayArrayList(customer);
							break;
	
						case 3:
							System.out.println("Enter email id of customer : ");
							Customer c3 = findByEmail(scan.next(), customer);					//find customers
							
							if(c3.getAdhaar() != null)											//checks if already linked
								throw new CustomerHandlingException("Adhaar already linked");
							
							System.out.println("Enter adhaar details : AdhaarCardNo Location");
							c3.linkAdhaar(scan.next(), scan.next());							//links adhaar card
							System.out.println("Adhaar card linked...");
							break;
							
						case 4:
							System.out.println("Enter email id and password : ");
							Customer c4 = customerLogin(scan.next(), scan.next(), customer);
							System.out.println(c4);
							break;
							
						case 5:
							System.out.println("Enter email id and password : ");
							Customer c5 = customerLogin(scan.next(), scan.next(), customer);
							System.out.println(c5);
							System.out.println("Enter new password : ");
							c5.setPassword(verifyPassword(scan.next()));
							System.out.println("Password successfully changed...");
							break;
							
						case 6:
							System.out.println("Enter email id and password : ");
							Customer c6 = customerLogin(scan.next(), scan.next(), customer);
							int i6 = customer.indexOf(c6);
							System.out.println(customer.remove(i6));
							System.out.println("Customer has successfully un-subscribed");
							break;
							
						case 7:
							System.out.println("Enter plan : ");
							ArrayList<Customer> arr7 = customerByPlan(scan.next(), customer);
							if(!arr7.isEmpty())
								for(Customer c7 : arr7)
									System.out.println(c7.getName());
							
							else
								throw new CustomerHandlingException("No customers applied for this plan !!!");
							break;
							
						case 8:
							System.out.println("Enter date : dd-MM-yyyy");
							ArrayList<Customer> arr8 = customerAfterDate(scan.next(), customer);
							if(!arr8.isEmpty())
								displayArrayList(arr8);
							else
								throw new CustomerHandlingException("No customer in the database !!!");
							break;
							
						case 9:
							System.out.println("Enter Location");
							ArrayList<Customer> arr9 = customerByLocation(scan.next(), customer);
							if(!arr9.isEmpty())
								displayArrayList(arr9);
							else
								throw new CustomerHandlingException("No customer in the database from this location !!!");
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
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

}
