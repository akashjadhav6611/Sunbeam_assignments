package assignment1;

import java.util.Scanner;

public class assign1_6 {

	public static void main(String[] args) 
	{
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print("The absolute value of this number is ");
		if(n >= 0)
		{
			System.out.print(n);
		}
		else
		{
			System.out.print(-1*n);
		}
		
		sc.close();
	}

}
