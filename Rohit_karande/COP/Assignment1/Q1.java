package Asm;

import java.util.Scanner;

// Write a Java program that reads an integer between 0 and 1000 and 
//adds all the digits in the integer
//import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		int n1,a,b;
	
		System.out.println("Enter value");
		
		n1=sc.nextInt();
		
		if(n1>0 && n1<100) {
			
			System.out.println("num= "+n1);
			 
		}
		else {
			System.out.println("out of range");
		}
		
        a=n1/10;
        b=n1%10;
		System.out.println("addition of digits= "+(a+b));

        
		sc.close();
		
		

	}

}
