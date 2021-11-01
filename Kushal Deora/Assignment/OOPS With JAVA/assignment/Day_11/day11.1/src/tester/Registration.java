package tester;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import static utils.ValidationRules.*;
import com.app.core.Customer;
import com.app.core.Plan;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try(Scanner sc =new Scanner(System.in))
{
	ArrayList<Customer> customer =new ArrayList<Customer>();
	
	boolean exit=false;
	while(!exit)
	{
		try {
			System.out.println("Choice: 1. Add User 2. Display user 3. Link Adhar");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("name,email,password,registrationAmount,dob,Plan plan");
				Customer c= new Customer(sc.next(), validateEmail(sc.next(),customer), validatePassword(sc.next()),validateAmounyt(sc.nextDouble()), parseAndVlaidateDob(sc.next()), parseAndVlaidatePlan(sc.next()));
				customer.add(c);
				//(String name, String email, String password, double registrationAmount, Date dob, Plan plan)
				break;
			case 2:
				for(Customer c1:customer)
				{
					System.out.println(c1);
				}
				
			case 3:
				
				c= getCustomers(sc.next(), customer);
				if(c.getAdhaar()==null)
				{
					System.out.println("Enter Adhar Number and Location");
					c.link(sc.next(), sc.next());
				}
				else
				{
					System.out.println("Customer is there");
				}
				break;
			
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		sc.nextLine();
	}
	
	
	
}

	}

}
