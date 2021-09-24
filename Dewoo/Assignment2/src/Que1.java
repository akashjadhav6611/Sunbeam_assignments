/*

1. Program to display addition of numbers from a lower bound to an upper bound using a while-loop.


*/
import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the lower number: ");
		int lower_bound = sc.nextInt();
		
		System.out.println("Enter upper bound number:  ");
		int upper_bound=sc.nextInt();
		
		int count=0;
		
		
		
		while(lower_bound<=upper_bound) {
			
			count = count +lower_bound;
			
			lower_bound++;
			
		}
		
		System.out.println("Addtion: "+count);
		
		
		
		
		
		

	}

}
