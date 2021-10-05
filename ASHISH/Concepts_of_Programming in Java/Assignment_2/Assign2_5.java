package sunbeam;

import java.util.Scanner;

public class Assign2_5 {

	public static void main(String[] args) 
	{
		int pos_num = 0, neg_num = 0, odd_num = 0, even_num = 0, zeros = 0;
		System.out.println("Enter 20 numbers:");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<20; i++)
		{
			int n = sc.nextInt();
			
			if(n > 0 && n%2 == 0)
			{
				pos_num++;
				even_num++;
			}
			else if(n > 0 && n%2 != 0)
			{
				pos_num++;
				odd_num++;
			}
			else if(n < 0 && n%2 == 0)
			{
				neg_num++;
				even_num++;
			}
			else if(n < 0 && n%2 != 0)
			{
				neg_num++;
				odd_num++;
			}
			else
			{
				zeros++;
			}
		}
		
		System.out.println("Number of positive numbers is: "+pos_num);
		System.out.println("Number of negative numbers is: "+neg_num);
		System.out.println("Number of even numbers is: "+even_num);
		System.out.println("Number of odd numbers is: "+odd_num);
		System.out.println("Number of zeros is: "+zeros);
		sc.close();
	}

}
