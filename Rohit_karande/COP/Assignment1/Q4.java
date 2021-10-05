package Asm;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
		int num;
		int first,fourth;
		System.out.println("Enter five digit num");
		num=sc.nextInt();

		
		first=num/10000;
		
		System.out.println("1st no= "+first);
		
		fourth=num%100;
		fourth=fourth/10;
		
		System.out.println("second last no= "+fourth);

		System.out.println("addition= "+(first+fourth));
		
		sc.close();
	}

}
