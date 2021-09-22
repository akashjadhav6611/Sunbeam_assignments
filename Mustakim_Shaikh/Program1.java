package SunbeamAssignments;
import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		
		int n , sum = 0 ;
		Scanner sm = new Scanner(System.in);
		System.out.println("Enter the number of your choice: ");
		int num = sm.nextInt();
		int temp = num ;
		
		if(num > 0 && num <=1000) {
			
			while(num > 0) {
				
				n = num % 10;
				sum = sum + n;
				num = num / 10;
			}
			
			System.out.println("Sum of the digits of number: " +temp + " is: " +sum);
			
		}
		
		else { 
			System.out.println("Enter the correct number.");
	     }
	}
}
