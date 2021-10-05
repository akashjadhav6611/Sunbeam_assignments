package assignment1;

import java.util.Scanner;

public class assign1_4 {

	public static void main(String[] args) 
	{
		System.out.print("Enter a 5 digit number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = 0, ans = 0;
		while(n>0)
		{
			a++;
			int rem = n%10;
			n = n/10;
			
			if(a==2 || a==5)
			{
				ans += rem;
			}
		}
		
		System.out.println("The summation of the first and the second last digits of this number is "+ans);
		sc.close();
	}

}
