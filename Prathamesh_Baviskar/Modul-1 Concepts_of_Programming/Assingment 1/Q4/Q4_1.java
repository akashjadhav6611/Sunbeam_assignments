package A1;
import java.util.Scanner;

/********************************************************************************
 *Q4. Write a program to calculate the sum of the first and the second last digit 
 * of a 5 digit. E.g.- NUMBER : 12345 OUTPUT : 1+4=5
 ********************************************************************************/
public class Q4_1 
{

	public static void main(String[] args)
	{
		int i,p,q,sum;
		String str,x,y;
		char a,b;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a 5 digit number  : ");
		i = sc.nextInt();
		
		str = Integer.toString(i);
		System.out.println("str : "+str);
		a = str.charAt(0);
		b = str.charAt(3);
		System.out.println("1st(char) : "+a+" 2nd(char) : "+b);
		
		x = Character.toString(a);
		p = Integer.valueOf(x);
		y = Character.toString(b);
		q = Integer.valueOf(y);
		
		System.out.println("1st digit : "+p+" Second digit : "+q);
		sum = p+q;
		System.out.println("Sum of 1st and 4th digit : "+sum);

	}

}
