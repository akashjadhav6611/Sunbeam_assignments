package A2;

import java.util.Scanner;

/*************************************************************
 * Q4. Take integer inputs from user until he/she presses q 
 * ( Ask to press q to quit after every integer input ). 
 * Print average and product of all numbers.
 ***************************************************************/
public class Q4 
{

	public static void main(String[] args) 
	{
		int i,count = 0,sum = 0,product = 1;
		String s;
		char ch ='a';
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number or 'q' (to exit) : ");
		do
		{
			s = sc.next(); 
			if(s.charAt(0) == 'q')
				ch = 'q';
			else
			{
				i = Integer.parseInt(s);
				sum = sum + i;
				product = product * i;
				count++;				
			}
		}while(ch != 'q');
		System.out.println("sum = "+sum+" Product = "+product);
		double avg = (double)(sum/count);
		System.out.println("Average = "+avg+" Count = "+count);
	}

}
