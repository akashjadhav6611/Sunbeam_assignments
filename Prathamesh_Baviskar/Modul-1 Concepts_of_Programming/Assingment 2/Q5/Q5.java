package A2;

import java.util.Scanner;

/*******************************************************************
 * Q5. Accept 20 integer inputs from user and print the following:
 * number of positive numbers , number of negative numbers number of 
 * odd numbers , number of even numbers, number of 0s.
 *******************************************************************/
public class Q5 
{

	public static void main(String[] args) 
	{
		int i, positive=0, negative=0, odd=0, even=0, zero=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 20 number : ");
		for(int a=0; a<20; a++)
		{
			i = sc.nextInt();
			{
				if(i%2 == 0)
					even++;
				else
					odd++;
			}
			{
				if(i>0)
					positive++;
				else if(i<0)
					negative++;
					else
						zero++;
			}
		}
		System.out.println("Even = "+even+" Odd = "+odd+" Positive = "+positive+" Negative = "+negative+" Zero = "+zero);
		
	}

}
