package A1;

import java.util.Scanner;

/***************************************************************************
 * Q6. Write a program to print absolute value of a number entered by user. 
 * E.g.- INPUT: 1 OUTPUT: 1 INPUT: -1 OUTPUT: 1
 **************************************************************************/
public class Q6
{

	public static void main(String[] args) 
	{
		int i;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a numner : ");
		i = sc.nextInt();
		System.out.println("INPUT= "+i+" OUTPUT (Absolute value)= "+Math.abs(i));
	  
	}
   

}
