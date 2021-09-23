//1. Program to display addition of numbers from a lower bound to an
//upper bound using a while-loop.


package Assignment2;
import java.util.Scanner;

public class Assignment2_1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lb,ub,i,x = 0;
		System.out.println("Enter lower bound");
		lb=sc.nextInt();
		System.out.println("Enter upper bound");
		ub=sc.nextInt();
		i=lb+1;
		
		
		while(i>=lb && i<ub) {
			 x = x+i;
			 i++;
			
		}
		System.out.println(x);
	}

}
