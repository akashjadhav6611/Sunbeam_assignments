package Assignment02;

import java.util.Scanner;

public class Qs01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    
	       System.out.println("Enter lower bound: ");
	       int num1 = sc.nextInt();
	       System.out.println("Enter upper bound: ");
	       int num2 = sc.nextInt();
	      
	       int count=0;
	       while (num1<=num2)
	       { count= count +num1;
	       num1++; 
	    	
	       }
	    		 
	       System.out.println("Sum: " +count);
	}

}
