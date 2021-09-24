package sunbeam;

import java.util.Scanner;

public class Assign2_2 {
	
	public static void main(String args[])
	{
		System.out.print("Enter the lower bound number: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.print("Enter the upper bound number: ");
		int b = sc.nextInt();
		
		int odd_sum = 0, even_sum = 0;
		
		while(a <= b)
		{
			if(a%2 != 0)
			{
				odd_sum += a;
			}
			else
			{
				even_sum += a;
			}
			a++;
		}
		
		System.out.print("The summation of the odd numbers from lower bound to upper bound is "+odd_sum+"\nAnd the summation of the even numbers from lower bound to upper bound is "+even_sum);
		sc.close();
	}
}
