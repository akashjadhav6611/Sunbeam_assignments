package sunbeam;

import java.util.Scanner;

class TestClass
{
	public static int addition(int number1, int number2)
	{
		return (number1 + number2);
	}
	public static int subtraction(int number1, int number2)
	{
		return (number1 - number2);
	}
	public static int multiplication(int number1, int number2)
	{
		return (number1 * number2);
	}
	public static int division(int number1, int number2)
	{
		return (number1 / number2);
	}
}

public class Practice {

	public static void main(String[] args) {
		int choice;
		int number1,number2,result;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Enter first number : ");
			number1 = sc.nextInt();
			System.out.println("Enter second number : ");
			number2 = sc.nextInt();
			System.out.println("0. Exit\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 0:
					break;
					
				case 1:
					result = TestClass.addition(number1, number2);
					System.out.println("Addition = "+result);
					break;
				
				case 2:
					result = TestClass.subtraction(number1, number2);
					System.out.println("Subtraction = "+result);
					break;
					
				case 3:
					result = TestClass.multiplication(number1, number2);
					System.out.println("Multiplication = "+result);
					break;
					
				case 4:
					if(number2 != 0)
					{
						result = TestClass.division(number1, number2);
						System.out.println("Division = "+result);
					}
					else
						System.out.println("Cannot divide by zero !!!");
					break;
				
				default:
					System.out.println("Invalid choice !!!");	
			}
		}while(choice != 0);
	}
}
