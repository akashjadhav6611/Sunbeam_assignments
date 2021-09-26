package sunbeam;

import java.util.Scanner;

public class Asg_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter lower bound : ");
		int lower = sc.nextInt();
		System.out.println("Enter upper bound : ");
		int upper = sc.nextInt();
		
		int sumeven = 0;
		int sumodd = 0;
		
		for(int i = lower ; i <= upper ; i++)
		{
			if(i%2 == 0)
				sumeven = sumeven + i;
			else
				sumodd = sumodd +i;
		}
		System.out.println("Sum of odd numbers : "+sumodd+"\nSum of even numbers : "+sumeven);
	}
}
