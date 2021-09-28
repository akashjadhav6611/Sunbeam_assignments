
/*

4. Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). Print average and product of all numbers.

*/

import java.util.Scanner;

public class Que4 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String str="";
		int sum=0;
		int product=1;
		int count=0;
		
		while(!str.equals("q")) {
			
			
			System.out.println("Enter a integer or enter q :");
			str=sc.next();
			
			
			if(!str.equals("q")) {
			int number = Integer.parseInt(str);
			sum=sum+number;
			product=product*number;
			count++;
			
			}
		}
			
		
		System.out.println("Product is: "+product);
		System.out.println("Sum is: "+sum);
		System.out.println("Count is: "+count);
		System.out.println("Average is: "+((float)sum/count));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int i=0;
		int product=1;
		char ch='a';
		
		while(ch!='q') {
			
			System.out.println("Enter the next element or enter q:");
			String s=sc.next();
			
			
			if(s.charAt(0)=='q') {
				ch='q';
			}
			else {
				int x = Integer.parseInt(s);
				sum=sum+x;
				product=product*x;
				i++;
			}
		}
		
		double avg=sum/i;
		System.out.println("Number of Elements: "+i);
		System.out.println("Sum of all the Elements: "+sum);
		System.out.println("Product of all the elements: "+product);
		System.out.println("Average of all the elements: "+avg);
		
		
		
		
		*/
		
		
		
		
	}

}
