package sunbeam;

import java.util.Scanner;

public class Assign2_3 {

	public static void main(String[] args) 
	{
		System.out.print("Enter the student's marks out of 100: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n > 80)
		{
			System.out.print("His/Her grade is A.");
		}
		else if(n > 60)
		{
			System.out.print("His/Her grade is B.");
		}
		else if(n > 50)
		{
			System.out.print("His/Her grade is C.");
		}
		else if(n > 45)
		{
			System.out.print("His/Her grade is D.");
		}
		else if(n > 25)
		{
			System.out.print("His/Her grade is E.");
		}
		else
		{
			System.out.print("His/Her grade is F.");
		}
		
		sc.close();
	}

}
