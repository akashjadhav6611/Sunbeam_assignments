package assignment_1;

import java.util.Scanner;

public class assignment_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number	:");
		int num = sc.nextInt();
		int n1,n2,n3;
		
		if (num==1000) {
			n1=num%10;
			num=num/10;
			
			n2=num%10;
			num=num/10;
			
			n3=num%10;
			num=num/10;
			System.out.println("Addition of digits	:"+(n1+n2+n3+num));
		}
		
		else {
		n1=num%10;
		num=num/10;
		
		n2=num%10;
		num=num/10;
		
		System.out.println("Addition of digits	:"+(n1+n2+num));
		}
		
		
	}

}
