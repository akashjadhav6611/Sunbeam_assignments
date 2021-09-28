package A1;
import java.util.Scanner;

/*
1. Write a Java program that reads an integer between
0 and 1000 and adds all the digits in the integer.
*/
public class Q1 {

	public static void main(String[] args) {
		int i,j,a, sum = 0,count=1;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number : ");
		i = sc.nextInt();
		
				
		if(i>=0 && i <= 1000)
		{
			for(j=0; j<count ;j++)
			{
				a = i%10;
				sum += a;
				i = i/10;
				count++;
				
			}
			System.out.println("Sum = "+sum);
		}
		
		else
			System.out.println("Wrong Input.");
		sc.close();

	}

}
