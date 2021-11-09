package utils;

import static utils.ValidationRules.*;

import java.text.ParseException;
import java.util.ArrayList;
import com.crm.core.Customer;
import com.exceptions.CustomerHandlingException;

public class CollectionUtils {
	public static ArrayList<Customer> populateSampleData() throws CustomerHandlingException, ParseException {
		ArrayList<Customer> list = new ArrayList<>();
		
		list.add(new Customer(
					"Shankar",
					"shankar@test.com",
					validatePassword("password1"),
					validateRegistrationAmount(1000),
					validateDate("1994-1-1"),
					validatePlan("Silver")
					));
		
		
		
		list.add(new Customer(
				"Akash",
				"akash@test.com",
				validatePassword("password2"),
				validateRegistrationAmount(500),
				validateDate("1992-12-1"),
				validatePlan("Gold")
				));
		
		list.add(new Customer(
				"Shubham",
				"Shubham@test.com",
				validatePassword("password3"),
				validateRegistrationAmount(1500),
				validateDate("1991-10-10"),
				validatePlan("Diamond")
				));
		
		list.add(new Customer(
				"Tejas",
				"Tejas@test.com",
				validatePassword("password4"),
				validateRegistrationAmount(2000),
				validateDate("1990-10-10"),
				validatePlan("Platinum")
				));
		
		list.add(new Customer(
				"Sujit",
				"Sujit@test.com",
				validatePassword("password5"),
				validateRegistrationAmount(500),
				validateDate("1989-10-10"),
				validatePlan("Silver")
				));
		
		list.add(new Customer(
				"Prafull",
				"Prafull@test.com",
				validatePassword("password6"),
				validateRegistrationAmount(1000),
				validateDate("1988-10-10"),
				validatePlan("Gold")
				));
		
		list.add(new Customer(
				"Abhijeet",
				"Abhijeet@test.com",
				validatePassword("password7"),
				validateRegistrationAmount(1500),
				validateDate("1987-10-10"),
				validatePlan("Diamond")
				));
		
		list.add(new Customer(
				"Mustakim",
				"Mustakim@test.com",
				validatePassword("password8"),
				validateRegistrationAmount(2000),
				validateDate("1986-10-10"),
				validatePlan("Platinum")
				));
		
		list.add(new Customer(
				"Sharmistha",
				"Sharmistha@test.com",
				validatePassword("password9"),
				validateRegistrationAmount(500),
				validateDate("1985-10-10"),
				validatePlan("Silver")
				));
		
		list.add(new Customer(
				"Umesh",
				"Umesh@test.com",
				validatePassword("password0"),
				validateRegistrationAmount(2500),
				validateDate("1984-10-10"),
				validatePlan("Diamond")
				));
		return list;
	}
	
	public static void addAadharCardDetailsInDummyData(ArrayList<Customer> customers) throws CustomerHandlingException{
		getCustomerByEmail("shankar@test.com", customers).assignAadharCard(202212325211d, "Pune");
		getCustomerByEmail("akash@test.com", customers).assignAadharCard(236823152245d, "Nashik");
		getCustomerByEmail("shubham@test.com", customers).assignAadharCard(995514142523d, "Mumbai");
		getCustomerByEmail("tejas@test.com", customers).assignAadharCard(995511223232d, "Pune");
		getCustomerByEmail("sujit@test.com", customers).assignAadharCard(748563528596d, "Mumbai");
		getCustomerByEmail("Prafull@test.com", customers).assignAadharCard(741536955123d, "Nashik");
	}
}
