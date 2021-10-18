package Assignment01;
import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sm = new Scanner (System.in);
		System.out.println("Enter two numbers: ");
		double a = sm.nextDouble();
		double b = sm.nextDouble();
	    double avg;
		
		if(a % 1 == 0 && b % 1 ==0) {
			
			System.out.println("Entered number data type doesn't match!!");
		}else {
			
		     avg = (a + b) / 2;
		     System.out.println("Average of "+ a + " and " + b + " is: " + avg);
		}
	
	}

}
