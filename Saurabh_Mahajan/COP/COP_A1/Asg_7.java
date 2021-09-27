package shop;

import java.util.Scanner;

public class Asg_7 
{

	public static void main(String[] args) 
	{
		int unit = 100;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the quantity : ");
		int qty = sc.nextInt();
		
		int cost = qty*unit;
		
		if(cost >= 1000)
			System.out.println("Total cost : "+(double)(cost*0.9));
		else
			System.out.println("Total cost : "+cost);

	}

}
