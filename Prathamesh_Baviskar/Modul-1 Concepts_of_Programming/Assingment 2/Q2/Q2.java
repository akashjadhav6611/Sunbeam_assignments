package A2;

import java.util.Scanner;

/*******************************************************************************************************
 * Q2. Display sum of the odd numbers and the even numbers from a lower bound to an upper bound.
 *******************************************************************************************************/
public class Q2 
{

	public static void main(String[] args) 
	{
		int ub,lb,esum = 0,osum = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a lower and Upper bound : ");
		lb = sc.nextInt();
		ub = sc.nextInt();
		do
		{
			if(lb % 2 == 0)//even number lb % 2 = 0
			{
				esum = esum + lb;
				System.out.println("lb = "+lb+" Sum of even = "+esum);
			}
			else //if(lb % 2 !=0)
			{
				osum = osum + lb;
				System.out.println("lb = "+lb+" Sum of odd = "+osum);
			}
			lb++;
		}while(lb<=ub);
		System.out.println("Sum of even = "+esum+" sum of odd = "+osum);

	}

}
