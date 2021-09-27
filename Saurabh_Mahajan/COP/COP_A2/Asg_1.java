package sunbeam;

import java.util.Scanner;

public class Asg_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter lower bound : ");
		int lower = sc.nextInt();
		System.out.println("Enter upper bound : ");
		int upper = sc.nextInt();
		
		int sum=0;
		int i = lower;
		
		while(i <= upper)
		{
			sum = sum +i;
			i++;
		}
		System.out.println("Sum : "+sum);
	}
}
