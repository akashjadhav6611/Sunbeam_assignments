package assignment1;

import java.util.Scanner;

public class assign1_7 {
	
	public static void main(String args[])
	{
		System.out.print("Number of quantities user want to purchase: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		double sum = n*100;
		
		if(sum > 1000)
		{
			sum = sum*0.9;
			System.out.print("The total cost for the user after 10% discount is "+sum);
		}
		else
		{
			System.out.print("The total cost for the user is "+sum);
		}
		
		sc.close();
	}
}
