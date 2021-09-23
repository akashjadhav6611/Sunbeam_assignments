package SunbeamAssignments;
import java.util.*;

public class Program4 {

	public static void main(String[] args) {
		
		Scanner sm = new Scanner(System.in);
		System.out.println("Enter a five digit number: ");
		int num = sm.nextInt();
		
		int temp = num ;
		
		int n = num / 10;
		int slD = n % 10 ;
		
		while(num >= 10) {
			
			num = num / 10;
		}
		
		int fD = num ;
		
		int sum = fD + slD;
		
		System.out.println("Sum of First and SecondLast digit of " +temp+ " is: "+sum );
	}

}
