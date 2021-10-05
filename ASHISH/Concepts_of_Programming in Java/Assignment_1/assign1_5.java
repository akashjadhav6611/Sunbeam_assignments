package assignment1;

import java.util.Scanner;

public class assign1_5 {
	
	
	public static void main(String args[])
	{
		int n = 0;
		
		do {
			System.out.println("***Enter your choice:*** \n\t1.Add \n\t2.Subtract \n\t3.Divide \n\t4.Multiply \n\t5.Exit");
			
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			
			if(n == 1)
			{
				System.out.println("Enter two numbers: ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				System.out.println("Addition of these two numbers is "+(a+b)+"\n");
			}
			else if(n == 2)
			{
				System.out.println("Enter two numbers: ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				System.out.println("Subtraction of these two numbers is "+(a-b)+"\n");
			}
			else if(n == 3)
			{
				System.out.println("Enter two numbers: ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				System.out.println("Division of these two numbers is "+(a/b)+"\n");
			}
			else if(n == 4)
			{
				System.out.println("Enter two numbers: ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				System.out.println("Multiplication of these two numbers is "+(a*b)+"\n");
			}
			else
			{
				System.out.println("Wrong input!\n");
			}
			
		}while(n != 5);
	
	}
}
