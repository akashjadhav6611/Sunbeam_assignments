package A1;

import java.util.Scanner;

/******************************************************************************************************
 * 7. A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
 * Ask user for quantity and suppose, one unit will cost 100. Calculate and print total cost for user.
******************************************************************************************************/
public class Q7 
{

	public static void main(String[] args)
	{
		int q, p = 100;
		double f;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Quantity of purchase item : ");
		q = sc.nextInt();
		int total_cost = p*q;
		
		if(total_cost>1000)
		{
			f = (total_cost * 0.9);
			System.out.println("Total cost for user(with discount 10%) : "+ f);
		}
		else
			System.out.println("Total cost for user : "+ total_cost);
	}

}
