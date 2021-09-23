package SunbeamAssignments;
import java.util.*;

public class ProgramD2_4 {

	public static void main(String[] args) {
		
		char press; int  num , NumCount = 0 ; int TotalSum = 0 ; int product = 1;
		Scanner sm = new Scanner(System.in);
		do {
			
			System.out.println("Enter the Numbers: ");
			num = sm.nextInt();
			
			System.out.println("Press q to Exit. or Enter 'c' to continue ");
		    press = sm.next().charAt(0);
		    
		    // Total Sum Of all numbers:
		    TotalSum = TotalSum + num ;
		    
		   // Counting Total Numbers:
			NumCount++;
			
		   // Product of all numbers:	
			product = product * num;
		}while(press != 'q');
	
	     //Average calculation:
		int avrg = TotalSum / NumCount ;
		
	    System.out.println("Average of Numbers is: " +avrg+ " Product is: " +product);
	
	} 

}
