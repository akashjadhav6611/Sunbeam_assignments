package A2;

import java.util.Scanner;

/*******************************************************************************************************
 * Q1. Program to display addition of numbers from a lower bound to an upper bound using a while-loop.
 *******************************************************************************************************/
public class Q1 
{

	public static void main(String[] args) 
	{
		int ub,lb,sum = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a lower and Upper bound : ");
		lb = sc.nextInt();
		ub = sc.nextInt();
		do
		{
			sum = sum + lb;
			lb++;
			System.out.println("Sum = "+sum);
		}while(lb<=ub);
		System.out.println("Sum = "+sum);

	}

}
