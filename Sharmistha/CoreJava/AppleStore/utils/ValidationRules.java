package utils;
import static com.app.customer.Customer.sdf;

import java.text.ParseException;

import java.util.Date;

import com.app.customer.Customer;
import com.app.customer.Device;
import cust_exc.AppleDeviceHandlingException;

public class ValidationRules {
	// date part
	private static Date strtdate,enddate;
	private static int  MIN,MAX;
	private static StringBuilder sb;
	static {
		MIN =4; // for pw length
		MAX=10;
		
		sb = new StringBuilder("");
		for(Device d : Device.values())
			sb.append(d+", ");				//appends all enum values : Devices
		try {
			strtdate=sdf.parse("01-Jan-2022");
			enddate =sdf.parse("30-Nov-2022");
		}
		catch (ParseException e)
		{System.out.println("Err in parsing date" + e);
	
		}
	}
	
	
	//name(string),email(string),password(string),productname(string),
	//dateofpurchasing(Date),device(enum : IPHONE, MACBOOK, WATCH, IPAD)
	//1st do this, then validate one by one
	

public static Device verifyDevice(String device) throws AppleDeviceHandlingException {
	
	try 
	{
		return Device.valueOf(device.toUpperCase());//return respective enum value
	} 
	catch (IllegalArgumentException e)  // enum ke illegal arg ke liye
	{
		System.out.println(e);
		System.out.println("Valid devices are : ");	
		throw new AppleDeviceHandlingException(sb.toString()); //choice dikhane ke liye
	}
	}
public  static Date verifyDate(String dop) throws ParseException, AppleDeviceHandlingException {
	// parse
	Date d1 = sdf.parse(dop);
	// =>parsing successful --- validation

	if (d1.after(enddate) || d1.before(strtdate))
		throw new AppleDeviceHandlingException("Invalid Date of Purchase!!!!!");
	
	// => parsing n validation : success
	return d1;// ret parsed n validated date cls instance to the caller (Tester)

} // end of date
	


public static String verifyProductName(String productName) {
		// TODO Auto-generated method stub
		return productName;
	}


//password must be min 4 max 10 chars long
  public static String verifyPassword(String temp) throws AppleDeviceHandlingException{
		if (temp.length() < MIN || temp.length() > MAX)
			throw new AppleDeviceHandlingException(" Pass should be between 4 to 10 characters");
		
		return temp;
	}


//email must contain "@" & should be from ".com" domain
	// Primary key chahiye tha so array ke list me pure ke sath compare karna hoga
	public static String verifyEmail(String email, Customer[] customer) throws AppleDeviceHandlingException {
	
		
         Customer e = new Customer(email);
         //temporary instance to compare email with database
		
		if(customer.equals(e))//checks email equality
			throw new AppleDeviceHandlingException("Customer already exists !!!");
		if(!(email.contains("@")))//checks if email contains @
			throw new AppleDeviceHandlingException("Email id must contain '@' !!!");
		if(!(email.endsWith(".com")))//checks if email ends with .com			
			throw new AppleDeviceHandlingException("Email id must be from domain '.com' !!!");
		
		return email;
		
	}
	
	// primary key ke liye as unique ID is email
	public static Customer findByEmail(String temp, Customer[] customer) throws AppleDeviceHandlingException
	{
		Customer c = new Customer(temp); //temporary instance to compare email with database
		
		for(Customer e : customer)
			if(e != null) // null checking
				if(e.equals(c)) // single object check
					return e;

		throw new AppleDeviceHandlingException("Customer not found !!!");
	}
	

	
	
	
	

}
