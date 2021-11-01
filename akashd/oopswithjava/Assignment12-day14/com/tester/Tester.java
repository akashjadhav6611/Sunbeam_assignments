package com.tester;

import java.util.Date;
import java.util.Scanner;

import com.crm.core.Customer;
import com.crm.core.Plans;
import com.crm.core.Customer.AadharCard;
import static utils.ValidationRules.*;

public class Tester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			Customer[] customers = new Customer[5];
			
			// String name, String email, String password, double registrationAmount, Date dob, Plans plan
			
			Customer c1 = new Customer("Akash", "akash@test.com", "password", 500, new Date(), Plans.GOLD); // quickadd
			
			System.out.println(c1);
			c1.assignAadharCard(902190515021d, "Nashik");
			AadharCard c1a = c1.getAadharReference();
			System.out.println(c1a);
			
			Customer c2 = new Customer (
					"Shankar",
					validateRegistration("shankar@test.com", customers),
					validatePassword("password"),
					validateRegistrationAmount(1000),
					validateDate("1989-10-10"),
					validatePlan("Diamond")
					);
			
			c2.assignAadharCard(202295125114d, "Pune");
			AadharCard c2a = c2.getAadharReference();
			System.out.println(c2);
			System.out.println(c2a);
			
			customers[0] = c1;
			customers[1] = c2;
			
		} catch (Exception e) {
			System.out.println("Error!");
			System.out.println(e.getMessage());
		}
		
	}
}

/*
 * future changes: add prices for silver, gold, diamond, platinum
 * 
 * */
