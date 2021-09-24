package sunbeam;

import java.util.Scanner;

public class Assignment1_P6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		int num;
		System.out.println("Enter a integer number : ");
		num = s.nextInt();		
		System.out.printf("Absolute value of number :%d ",Math.abs(num));
		System.out.println("\nEnter float number: ");
		float n=s.nextFloat();
		System.out.printf("Absolute value of number :%.2f ",Math.abs(n));

	}

}
