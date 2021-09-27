/*
6. Write a program to print absolute value of a number entered by user. 
E.g.-
INPUT: 1 OUTPUT: 1
INPUT: -1 OUTPUT: 1
*/

package assign01;

import java.util.Scanner;

class AbsoluteValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number (+ve / -ve) : ");
		int number = sc.nextInt();
		
		// Using multiplied by -1 logic.
		if(number < 0)
			System.out.println("Absolute value of a number is : "+(number * (-1)));
		else
			System.out.println("Absolute value of a number is : "+number);
		
		// Using java.lang.Math class's   public static int abs(int a)  method.
		int absolute = Math.abs(number);
		System.out.println("Absolute value of a number is : "+absolute);
		
		sc.close();
	}
}
