package sunbeam;

import java.util.Scanner;

public class Asg_4 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int number,i=0;
		char quit = 'a';
		int product = 1;
		double avg = 0;
		
		while(quit != 'q')
		{
			System.out.println("Enter number or press 'q' to quit");
			String str = sc.next();
			if(str.charAt(0) == 'q')
				quit = 'q';
			else
			{
				number = Integer.parseInt(str);
				i++;
				product = product*number;
				avg = avg + number;
			}
		}
		
		avg = (double)(avg/i);
		
		System.out.println("Product is : "+product+"\nAverage is : "+avg);
	}
}