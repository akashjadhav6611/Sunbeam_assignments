package sunbeam;

import java.util.Scanner;

public class Assign2_4 {
	
	public static void main(String args[])
	{	
		String str = "0"; 
		int avg = 0, sum = 0, count = 0,  mul = 1;
		
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		char c = str.charAt(0);
		
		while(c != 'q')
		{
			int n = Integer.parseInt(str);
			
			count++;
			sum = sum + n;
			avg = sum / count;
			mul = mul*n;
			
			System.out.println("The average of these numbers is "+avg);
			System.out.println("The multiplication of these numbers is "+mul+"\n");
			
			System.out.print("Enter a number: ");
			str = sc.next();
			c = str.charAt(0);
		}
	}
}
