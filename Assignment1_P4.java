package sunbeam;

import java.util.Scanner;

public class Assignment1_P4 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 5-digit number : ");
		int n;
		n = s.nextInt();
		int first_num, second_last,Sum;
		first_num= n/10000;
		second_last = ((n%100)/10);
		Sum = first_num+ second_last;
		System.out.println("Sum = "+Sum);
		s.close();
		
	}

}
