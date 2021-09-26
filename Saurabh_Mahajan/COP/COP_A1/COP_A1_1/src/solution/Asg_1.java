package solution;

import java.util.Scanner;

public class Asg_1 
{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number between 0 and 1000 : ");
		int num = sc.nextInt();		
		System.out.println("Number is = "+num);
		
		int res = 0;
		while(num != 0)
		{
			res = res + num%10;
			num = num/10;
		}
		System.out.println("Sum is = "+res);
	}

}
