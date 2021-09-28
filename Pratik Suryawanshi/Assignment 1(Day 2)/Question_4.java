//Write a program to calculate the sum of the
//first and the second last digit of a 5 digit.
package question_4;

import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		int num,d1,d4;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		d4=(num/10)%10;
		while(num>10) {
			num=num/10;
				
		}
		d1=num;
		int sum=d1+d4;
		System.out.printf("Addition: %d+%d=%d",d1,d4,sum);
		

	}

}
