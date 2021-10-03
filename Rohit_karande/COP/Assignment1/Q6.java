package Asm;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
     int num;
		System.out.println("Enter num");

     num=sc.nextInt();
     
		System.out.println("num= "+num);
		
	    int value = Math.abs(num);
	    System.out.println("Absolute Number is: " + value);
		
		sc.close();

     
     


	}

}
