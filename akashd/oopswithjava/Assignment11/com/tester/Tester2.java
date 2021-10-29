package com.tester;

import static utils.ValidationRules.*;

import java.util.ArrayList;
import java.util.Scanner;

import com.crm.core.Customer;
import static utils.CollectionUtils.*;

public class Tester2 {

	public static void main(String[] args) {
		// ArrayList<Customer> customers = new ArrayList<>();
		
		try(Scanner sc = new Scanner(System.in)) {
			ArrayList<Customer> customers = populateSampleData();
			addAadharCardDetailsInDummyData(customers);
			boolean exit = false;
			while(!exit) {
				System.out.println("Menu");
				System.out.println("1. Register a new customer");
				System.out.println("2. Login");
				System.out.println("3. Change password");
				System.out.println("4. Unsubscribe");
				System.out.println("5. Display all customers with specific plan");
				System.out.println("6. Display all customers born after specific date");
				System.out.println("7. Display all customers wich specific aadhar card location");
				System.out.println("8. Exit");
				
				try {
					switch (sc.nextInt()) {
					case 1: // register
						// String name, String email, String password, double registrationAmount, Date dob, Plans plan						
						System.out.println("Enter customer details in the following order");
						System.out.println("name, email, password, regAmt, dob, plan");
						Customer custToAdd = new Customer(
								sc.next(),
								validateRegistration(sc.next(), customers),
								validatePassword(sc.next()),
								validateRegistrationAmount(sc.nextDouble()),
								validateDate(sc.next()),
								validatePlan(sc.next())
								);
						customers.add(custToAdd);
						break;
					case 2: // login
						System.out.println("To login, enter your email and password");
						// boolean login2 = validateLogin("shankar@test.com", "password1", customers);
						boolean login2 = validateLogin(sc.next(), sc.next(), customers);
						System.out.println("Login : " + login2);
						
						break;
					case 3: // change pwd
						
						System.out.println("To change password, login first.");
						System.out.println("Enter your email and password");
						//boolean login3 = validateLogin("shankar@test.com", "password1", customers);
						boolean login3 = validateLogin(sc.next(), sc.next(), customers);
						System.out.println("Login : " + login3);
						
						if(login3) {
							// set password
							System.out.println("Enter your email and your new password");
							// changePassword("shankar@test.com", "password1", customers); // change password
							changePassword(sc.next(), sc.next(), customers); // change password
							//System.out.println(getCustomerByEmail("shankar@test.com", customers)); // print to verify
						}
						
						break;
					case 4: // unsub
						// use remove
						System.out.println("Enter your email to unsunscribe");
						//removeCustomer("shankar@test.com", customers); // remove customer
						removeCustomer(sc.next(), customers); // remove customer
						
						// System.out.println(getCustomerByEmail("shankar@test.com", customers)); // should raise exception
						
						break;
					case 5: // dispall with plan
						
						System.out.println("Enter the plan name to display which customers are subscribed");
						// displayAllWithPlan("Diamond", customers);
						displayAllWithPlan(sc.next(), customers);
						break;
					case 6: // dispall after date
						System.out.println("Enter the date (yyyy-MM-dd) for which customers after date will be displayed");
						// displayAllBornAfterDate("1989-01-01", customers);
						displayAllBornAfterDate(sc.next(), customers);
						break;
					case 7: // dispall with adhar card location
						System.out.println("Enter the region for which you want to see customers with same aadhar card region");
						// displayAllWithAadharLocation("Pune", customers);
						displayAllWithAadharLocation(sc.next(), customers);
						break;
					case 8: // exit
						exit = true;
						break;
					default:
						System.out.println("Wrong input!");
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				sc.nextLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
