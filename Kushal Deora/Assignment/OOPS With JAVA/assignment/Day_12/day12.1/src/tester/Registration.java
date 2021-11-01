package tester;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import static utils.ValidationRules.*;
import com.app.core.Customer;
import com.app.core.Plan;

import custom_exception.CustomerHandlingException;

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
			System.out.println("Choice: 0. Link Adhar 1. Register new customer 2. Customer login 3. Change password 4.Un subscribe customer 5.Display all customer names , who have taken a specific plan 6. Display all customer details , born after specific date 7. 5.7 Display all customer details , with specified adhar card location. 10.Exit");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("name,email,password,registrationAmount,dob,Plan plan");
				Customer c= new Customer(sc.next(), validateEmail(sc.next(),customer), validatePassword(sc.next()),validateAmounyt(sc.nextDouble()), parseAndVlaidateDob(sc.next()), parseAndVlaidatePlan(sc.next()));
				customer.add(c);
				//(String name, String email, String password, double registrationAmount, Date dob, Plan plan)
				c=null;
				break;
			case 2:
//				for(Customer c1:customer)
//				{
//					System.out.println(c1);
//				}
				System.out.println("Enter email and Password");
				c= getCustomers(sc.next(), customer);
				String pass=sc.next();
				if(c.getPassword().equals(pass))
				{
					System.out.println("Password Match Login Succesfull");
				}
				
				else
					{
					throw new CustomerHandlingException("Login Unsuccessfull");
					}
				
			case 3:
				
				System.out.println("Enter email and Password");
				c= getCustomers(sc.next(), customer);
				 pass=sc.next();
				if(c.getPassword().equals(pass))
				{
					System.out.println("Password Match Login Succesfull");
				}
				
				else
					{
					throw new CustomerHandlingException("Login Unsuccessfull");
					}
				System.out.println("Enter New Password");
				c.setPassword(sc.next());
				System.out.println("Password Updated");
				break;
			case 4:
				System.out.println("Enter email");
				c= getCustomers(sc.next(), customer);
				customer.remove(c);
				System.out.println("customer Removed");
				break;
			case 5:
			
				System.out.println("Enter Plan");
				Plan plan=parseAndVlaidatePlan(sc.next());
				for(Customer c1:customer)
					{if(plan==c1.getPlan())
						System.out.println(c1);
					}
				break;
			case 6:
				
				System.out.println("Enter Date");
				Date date=parseAndVlaidateDob(sc.next());
				for(Customer c1:customer)
					{if(date.before(c1.getDob()))
						System.out.println(c1);
					}
				break;
		case 7:
				
				System.out.println("Enter location");
				String loc=sc.next();
				for(Customer c1:customer)
					{if(c1.getAdhaar()!=null)
						if(c1.getAdhaar().getLocation()==loc)
						System.out.println(c1);
					}
				break;
		case 0:
			System.out.println("Enter email");
			c= getCustomers(sc.next(), customer);
			if(c.getAdhaar()!=null)
			{
				System.out.println("enter Addhar Card number And location");
				c.link(sc.next(), sc.next());
			}
			else
				System.out.println("Already Link");
			break;
		case 10:
			exit=true;
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
