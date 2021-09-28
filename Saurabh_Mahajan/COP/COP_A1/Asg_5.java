import java.util.Scanner;

public class Asg_5 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number : ");
		int num2 = sc.nextInt();
		int choice;
		do 
		{
			System.out.println("\n0.Exit");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Mod");
			System.out.println("Enter choice : ");
			choice = sc.nextInt();
	
			switch(choice)
			{
			case 1:
				System.out.println("\nAddition : "+(num1+num2));
				break;
			
			case 2:
				System.out.println("\nSubtraction : "+(num1-num2));
				break;
			
			case 3:
				System.out.println("\nMultiplication : "+(num1*num2));
				break;
			
			case 4:
				System.out.println("\nDivision : "+(num1/num2));
				break;
			
			case 5:
				System.out.println("\nMod : "+(num1%num2));
				break;
			}
		}while(choice != 0);
	}
}
