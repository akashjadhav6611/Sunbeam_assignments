//Write a program to print absolute value of a number entered by user.
package question_6;

import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		int num,absValue;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		num=sc.nextInt();
		if(num<0) {
		absValue=num*-1;	
		}
		else {
			absValue=num;
		}
		
		System.out.printf("|%d| : %d",num,absValue);
	}

}
