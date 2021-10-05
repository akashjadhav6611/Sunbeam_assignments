package sunbeam;

import java.util.Scanner;

public class Assign2_1 {
	
	public static void main(String args[])
	{
		System.out.print("Enter the lower bound number: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.print("Enter the upper bound number: ");
		int b = sc.nextInt();
		
		int sum = 0;
		
		while(a <= b)
		{
			sum += a;
			a++;
		}
		
		System.out.print("The summation of the number from lower bound to upper bound is "+sum);
		sc.close();
	}
}
