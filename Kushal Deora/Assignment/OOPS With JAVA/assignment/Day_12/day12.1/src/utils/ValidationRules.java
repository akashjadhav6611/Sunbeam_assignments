
/*
 email must contain "@" & should be from ".com" domain
password must be min 4 max 10 chars long
reg amount should be multiples of 500
dob should be before 1st Jan 1995
no duplicate registrations.
 */

package utils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import com.app.core.Customer;
import com.app.core.Plan;


import static com.app.core.Customer.sdf;
import custom_exception.CustomerHandlingException;

public class ValidationRules {

	
	
	public static String validateEmail(String email,ArrayList<Customer> cust) throws CustomerHandlingException
	{
		Customer c =new Customer(email);
		if(cust.contains(c))
		throw new CustomerHandlingException("Email Duplicate");
		if(!email.contains("@"))
			throw new CustomerHandlingException("@ Required");
		if(!email.endsWith(".com"))
			throw new CustomerHandlingException(".com Required");
			
		return email;
	}

public static Plan parseAndVlaidatePlan(String plan)
{
	return Plan.valueOf(plan.toUpperCase());
}

public static Date parseAndVlaidateDob(String date) throws ParseException,CustomerHandlingException
{
	Date d=sdf.parse("1995-01-01");
	
	Date d1=sdf.parse(date);
	if(d1.before(d))
			return d1;
	throw new CustomerHandlingException("Date must be Before 1-1-1995");
}

public static String validatePassword(String password) throws CustomerHandlingException
{
	if(password.length()>=4&&password.length()<=8)
		return password;
	throw new CustomerHandlingException("Lenght must be b/w 4 and 8");
				
}


public static double validateAmounyt(double amt) throws CustomerHandlingException
{
	if(amt%500==0)
		return amt;
				throw new CustomerHandlingException("Amount must be multiple of 500");
}

public static Customer getCustomers(String email,ArrayList<Customer> cust) throws CustomerHandlingException
{
	Customer c =new Customer(email);
	int idx= cust.indexOf(c);
	if(idx==-1)
		throw new CustomerHandlingException("No Customer Found");
	return cust.get(idx);
	
}
}
