package assignment2_1;

import java.util.Scanner;

public class Ass2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = 'a';
		int count = 0;
		int product = 1 ;
		int i = 0;
		while( ch!='q'){
			System.out.println("Enter the input or press 'q' to exit");
			String s =sc.next();
			if (s.charAt(0) == 'q') {
				ch = 'q';
			}
			else {
				int num = Integer.parseInt(s);
				count = count + num;
				product = product*num;
				i++;
			}
		}
		sc.close();
		System.out.println("total numbers are = "+i);
		double avg = (double)count/ (double)i;
		System.out.println("Sum of numbers is = "+count);
		System.out.println("Average of numbers is = "+avg);
		System.out.println("product of numbers is = "+product);
	}

}
