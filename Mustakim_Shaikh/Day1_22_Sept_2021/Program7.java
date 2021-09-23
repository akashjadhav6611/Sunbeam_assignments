package SunbeamAssignments;
import java.util.*;
public class Program7 {

	public static void main(String[] args) {
		
		int TotalAmount;
		
		Scanner sm = new Scanner(System.in);
		System.out.println("Enter the Number of units purchased: ");
		int units = sm.nextInt();
		
		int amount = units * 100;
		
		if(amount > 1000) {
			
		TotalAmount = amount - (amount * 10) / 100;
		System.out.println("Paying amount is: " +TotalAmount);
		
		}
		
		else
			System.out.println("Paying amount is: " +amount);
	
	}

}
