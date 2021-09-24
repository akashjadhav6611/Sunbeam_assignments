package sunbeam;

import java.util.Scanner;

public class Assignment1_P1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) 

			{
	
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter a number : ");
	        int num = sc.nextInt();
	        int f, s, t, sum;
	        if(num>0 && num<1000)
	        {
	            f = num / 100;
	            s = (num % 100) / 10;
	            t = num % 10;
	            sum = f+ s+ t;
	            System.out.println("Sum of digits: " + sum);
	        }
	        else
	        System.out.println("Number is more than or equal to 1000 ");
		
		// TODO Auto-generated method stub

	}

}
