package assignment1;

import java.util.Scanner;

public class assign1_3b {
	
	public static void main(String args[])
	{
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		switch(a)
		{
		case 1:
			System.out.print("ONE");
			break;
		case 2:
			System.out.print("TWO");
			break;
		case 3:
			System.out.print("THREE");
			break;
		case 4:
			System.out.print("FOUR");
			break;
		case 5:
			System.out.print("FIVE");
			break;
		case 6:
			System.out.print("SIX");
			break;
		case 7:
			System.out.print("SEVEN");
			break;
		case 8:
			System.out.print("EIGHT");
			break;
		case 9:
			System.out.print("NINE");
			break;
		default:
			System.out.print("OTHER");
		}
		sc.close();
	}
	
	
}
