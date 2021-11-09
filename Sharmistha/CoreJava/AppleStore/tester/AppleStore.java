package tester;

import java.util.Scanner;
import static utils.ValidationRules.*; // ye static karna hai 
import com.app.customer.Customer;
import java.util.Date;

import com.app.customer.Device;
import cust_exc.AppleDeviceHandlingException;
@SuppressWarnings("unused")
public class AppleStore {

	
	public static void main(String[] args) {
	
		try(Scanner sc= new Scanner(System.in))
		{
			System.out.println(" Enter no. of Customers : "); // humko input chahiye
			Customer[] c1= new Customer[sc.nextInt()];
			
			boolean key =false; //mam ka switch case wala while method
			int count = 0 ;
			
			while(!key)
			{
				try {
					System.out.println(" 1. Add customer 2. Display all customers 3. Link Order ID 10. Exit");
				switch(sc.nextInt())
				{
				case 1 : //add customer
					if(count < c1.length) // to check jagah khali hai ki nahi : ya customer kahi hai to nahi ?
					{
						System.out.println(" Add customer details : name, email, password, productname, dop , device");
					
//		String name, String email, String password, String productName, Date dop,
//						Device dev)		
					Customer c2= new Customer(sc.next(), 
							verifyEmail(sc.next(), c1), 
						verifyPassword(sc.next()),
							verifyProductName(sc.next()), 
							verifyDate(sc.next()),
							verifyDevice(sc.next()));
					c1[count++]= c2;
					System.out.println("Customer Registered");
					
					}
					else 
						throw new AppleDeviceHandlingException("Customer exists!");
					break;
					
					
					
				
				case 2 : // display karega 
					System.out.println(" Display all customers and orders : ");
					for( Customer c3 : c1)
						if(c3!=null)
							System.out.println(c3);
					
					
					
				case 3: // Link Order ID
					System.out.println("Enter Email Id to register");
					Customer c4 = findByEmail(sc.next(), c1); 
					
					if(c4.getoD()!= null)  // iska matlab already link hua hai customer
					throw new AppleDeviceHandlingException("Customer already exists"); // yaha bahar hojayega if exists
					
					//idhar aya toh customer not exists so add new
					System.out.println("Order details : ID , product numbers");
					c4.OrderDetails(sc.nextInt(), sc.nextInt()); // issme add krenge
					System.out.println("Add success");
					
				case 10 :
					key = true; //tata bye bye
					break;
					
			} 
				}
				catch (Exception e) // exception aya toh idhar ayega
				{
				System.out.println(e.getMessage());
				}
			
			sc.nextLine(); //scanner buffer clear (while ke last me before closing parenthesis
		}

	}


	
}
}

