package absolute;

import java.util.Scanner;

public class Abs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		System.out.println("User Input is = "+num);
		System.out.println("Absolute value of given number is = "+(Math.abs(num)));

	}

}
