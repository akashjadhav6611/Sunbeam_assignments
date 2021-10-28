package com.tester;

import java.util.Date;

import com.crm.core.Customer;
import com.crm.core.Plans;
import com.crm.core.Customer.AadharCard;

public class Tester {

	public static void main(String[] args) {
		// String name, String email, String password, double registrationAmount, Date dob, Plans plan
		Customer c1 = new Customer("Akash", "akash@test.com", "password", 500, new Date(), Plans.GOLD); // quickadd
		
		System.out.println(c1);
		c1.assignAadharCard(902190515021d, "Nashik");
		
		AadharCard c1a = c1.getAadharDetails();
		System.out.println(c1a);
	}

}
