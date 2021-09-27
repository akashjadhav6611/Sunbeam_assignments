package A1;

import java.util.Scanner;

/*
 * 4. Write a program to calculate the sum of the first and the second last digit 
 * of a 5 digit. E.g.- NUMBER : 12345 OUTPUT : 1+4=5
 */

public class Q4 {

	public static void main(String[] args) 
	{
		int i,sum;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a 5 digit number : ");
		i = sc.nextInt();
		sc.close();
		if(i>9999)
		{
			int a = i/10000;
			int b = (i%100)/10;
			sum = a+b;
			System.out.println("Sum of 1st and 4th digit = "+sum);	
			System.out.println("1st = "+a+" 4th = "+b);
		}
		else
			System.out.println("Wrong input.");
	}

}
