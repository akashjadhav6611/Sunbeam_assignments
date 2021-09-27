package A1;

import java.util.Scanner;

/*
 * 5. Write a program to perform arithmetic operations, by accepting numbers from user 
 * and the choice from user. Write a menu driven program to perform operations.
 */
public class Q5 
{

	public static void main(String[] args)
	{
		int a,b,ch;
		System.out.println("Enter two numbers for operations : ");
		Scanner sc =new Scanner (System.in);
		a = sc.nextInt();
		b = sc.nextInt();		
		do
		{
			System.out.println("Enter the operation number :0.Exit \n 1. Add\n 2. Subtract\n 3. Multiply\n 4. Divide\n 5. Modulus");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case(1):
				System.out.println("Sum = "+(a+b));
				break;
			case(2):
				System.out.println("Sum = "+(a-b));
				break;
			case(3):
				System.out.println("Sum = "+(a*b));
				break;
			case(4):
				System.out.println("Sum = "+(a/b));
				break;
			case(5):
				System.out.println("Sum = "+(a%b));
				break;
			}
		}while(ch!=0);			
		
	}

}
