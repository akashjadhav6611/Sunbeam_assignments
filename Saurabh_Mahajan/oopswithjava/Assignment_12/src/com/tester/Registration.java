package com.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

import com.app.details.Customer;
import com.app.details.Plan;
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
							+ " 8.Display customers born after date 9.Search customer by location \n10.Customer ordering by descending email Id "
							+ "11.Customer ordering by DOB and Registration Amount "
							+ "0.Exit");
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
							System.out.println("Enter email id : ");
							System.out.println("Removal status : "+customer.remove(new Customer(scan.next())));
							System.out.println("Customer has successfully un-subscribed");
							break;
							
						case 7:
							System.out.println("Enter plan : ");
							Plan p7 = verifyPlan(scan.next());
							for(Customer c7 : customer)
								if(c7.getPlan() == p7)
									System.out.println(c7.getName());
							break;
							
						case 8:
							System.out.println("Enter date : dd-MM-yyyy");
							Date d8 = verifyDate(scan.next());
							for(Customer c8 : customer)
								if(c8.getDate().after(d8))
									System.out.println(c8);
							break;
							
						case 9:
							System.out.println("Enter Location");
							String l9 = scan.next();
							for(Customer c9 : customer)
								if(c9.getAdhaar() != null)
									if(l9.equals(c9.getAdhaar().getLocation()))
										System.out.println(c9);
							break;
							
						case 10:
							System.out.println("Ordering based on descending email Id");
							Collections.sort(customer);
							displayArrayList(customer);
							break;
							
						case 11:
							System.out.println("Ordering by DOB and Registration Amount");
							Collections.sort(customer, new Comparator<Customer>() 
							{
								@Override
								public int compare(Customer c1, Customer c2)
								{
									int temp = c1.getDate().compareTo(c2.getDate());
									if(temp == 0)
									{
										return ((Double)c1.getRegistrationAmount()).compareTo(c2.getRegistrationAmount());
									}
									return temp;
								}
							}
							);
							displayArrayList(customer);
							break;
							
						case 0:
							System.out.println("Exited the program !!!");
							key = true;
							break;
	
						default:
							System.out.println("Invalid Input !!!");
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
