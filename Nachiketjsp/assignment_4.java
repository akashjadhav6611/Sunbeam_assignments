package assignment_1;
import java.util.Scanner;

public class assignment_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a num	:");
		int num=sc.nextInt();
		int n1,n2;
		
		n1=num/10000;
		num=num/10;
		n2=num%10;
		
		System.out.println("Sum of 1st and 5th digit of num	:"+(n1+n2));
	}

}
