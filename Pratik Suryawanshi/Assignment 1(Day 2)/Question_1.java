//Write a Java program that reads 
//an integer between 0 and 1000 
//and adds all the digits in the integer.

package question_1;

import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		int num,sum=0,digit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number between 0 and 1000: ");
		num=sc.nextInt();
		if(num>0&&num<=1000) {

			while(num>0 ) {
				digit=num%10;
				sum+=digit;
				num=num/10;
			}	
			System.out.println("Addition of digit: "+sum);
		}
		
		else {
			System.out.print("Number should be between 0 and 1000");
		}

	}

}
