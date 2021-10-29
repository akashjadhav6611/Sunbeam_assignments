package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.crm.core.Customer;
import com.crm.core.Plans;
import com.exceptions.CustomerHandlingException;

public class ValidationRules {
	
	public static SimpleDateFormat sdf = null;
	public static Date beforeDate = null;
	
	static {
		try {
			sdf = new SimpleDateFormat("yyyy-MM-dd");
			beforeDate = sdf.parse("1995-01-01");
		} catch (Exception e) {
			System.out.println("Error while parsing date format!");
		}
	}

	public static String validateEmail(String emailString) throws CustomerHandlingException {
		
		if(!emailString.contains("@")) {
			throw new CustomerHandlingException("Email must contain @");
		}
		if(!emailString.endsWith(".com".toLowerCase())) {
			throw new CustomerHandlingException("Email must be from a .com domain");
		}
		return emailString;
	}
	
	public static String validatePassword(String passwordString) throws CustomerHandlingException {
		if(passwordString.length() < 4 || passwordString.length() > 10) {
			throw new CustomerHandlingException("Password must be between 4 and 10 chars long");
		}
		return passwordString;
	}
	
	public static double validateRegistrationAmount(double regAmt) throws CustomerHandlingException {
		if((regAmt % 500) != 0)
			throw new CustomerHandlingException("Registration amount must be in multiples of 500");
		return regAmt;
	}
	
	public static Date validateDate(String dateString) throws ParseException, CustomerHandlingException  {
		Date dob = sdf.parse(dateString);
		
		if(dob.after(beforeDate)) {
			throw new CustomerHandlingException("Error with date!");
		}
		return dob;
	}
	
	public static Plans validatePlan(String plan) throws CustomerHandlingException {
		Plans p = null;
		
		try {
			p = Plans.valueOf(plan.toUpperCase());
		} catch (Exception e) {
			StringBuilder sb = new StringBuilder("Valid values are: ");
			for(Plans px : Plans.values()) {
				sb.append(px.name());
				sb.append(", ");
				throw new CustomerHandlingException("Invalid category!" + sb);
			}
		}
		return p;
	}
	
	public static String validateRegistration(String email, Customer[] customers) throws CustomerHandlingException {
		Customer cx = new Customer(validateEmail(email));
		
		for(Customer c : customers) {
			if (c != null)
				if(c.equals(cx))
					throw new CustomerHandlingException("Customer email already exists!");
		}
		return email;
	}
	
	/* Additional Rules for ArrayList Type */

	public static String validateRegistration(String email, ArrayList<Customer> customers) throws CustomerHandlingException {
		Customer cx = new Customer(validateEmail(email));
		
		for(Customer c : customers) {
			if(c.equals(cx))
				throw new CustomerHandlingException("Customer email already exists!");
		}
		return email;
	}
	
	// find customer by email
	public static Customer getCustomerByEmail(String email, ArrayList<Customer> customers) throws CustomerHandlingException {
		Customer custToLogIn = new Customer(validateEmail(email));
		int customerIndex = customers.indexOf(custToLogIn);
		if (customerIndex == -1)
			throw new CustomerHandlingException("User not found!");
		
		return customers.get(customerIndex);
	}
	
	public static boolean validateLogin(String email, String password, ArrayList<Customer> customers) throws CustomerHandlingException {
		Customer foundCustomer = getCustomerByEmail(email, customers);
		// compare the password
		if(!foundCustomer.checkPassword(password))
			throw new CustomerHandlingException("Password error!");
		// customer login successful
		return true;
	}
	
	public static boolean changePassword(String email, String newPassword, ArrayList<Customer> customers) throws CustomerHandlingException {
		Customer foundCustomer = getCustomerByEmail(email, customers);
		foundCustomer.setPassword(newPassword);
		return true;
	}
	
	public static void  removeCustomer(String email, ArrayList<Customer> customers) throws CustomerHandlingException {
		Customer foundCustomer = getCustomerByEmail(email, customers);
		customers.remove(foundCustomer);
	}
	
	public static void displayAllWithPlan(String planString, ArrayList<Customer> customers) throws CustomerHandlingException {
		Plans planToFind = validatePlan(planString);
		ArrayList<Customer> selectedCustomers = new ArrayList<>();
		for (Customer c : customers) 
			if(planToFind.name().equals(c.getPlan().name())) 
				selectedCustomers.add(c);
			
		displayList(selectedCustomers);
	}
	
	public static void displayAllBornAfterDate(String dateString, ArrayList<Customer> customers) throws ParseException {
		Date bornAfterDate = sdf.parse(dateString);
		ArrayList<Customer> selectedCustomers = new ArrayList<>();
		for (Customer c : customers) 
			if (c.getDob().after(bornAfterDate))
				selectedCustomers.add(c);
		
		displayList(selectedCustomers);
	}
	
	public static void displayAllWithAadharLocation(String location, ArrayList<Customer> customers) {
		ArrayList<Customer> selectedCustomers = new ArrayList<>();
		for (Customer c : customers) 
			if (c.getAadharReference() != null)
				if(location.toLowerCase().equals(c.getAadharReference().getLocation().toLowerCase()))
					selectedCustomers.add(c);
		
		displayList(selectedCustomers);
	}
	
	public static void displayList(ArrayList<Customer> selectedCustomers) {
		for(Customer c : selectedCustomers)
			System.out.println(c);
	}
	
	
}
