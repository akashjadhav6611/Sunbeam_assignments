package assignment1;

import java.util.Scanner;

public class assign1_1 {
	public static void main(String[] args)
	{
		System.out.print("Enter a number between 0 and 1000: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		while(n>0)
		{
			int rem = n%10;
			sum += rem;
			n /= 10;
		}
		
		System.out.println("The summation of the digits of this number is: "+sum);
		sc.close();
	}
}
