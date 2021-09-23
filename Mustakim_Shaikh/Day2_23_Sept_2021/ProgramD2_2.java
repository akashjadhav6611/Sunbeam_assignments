package SunbeamAssignments;
import java.util.Scanner;

public class ProgramD2_2 {

	public static void main(String[] args) {
		
		 Scanner sm = new Scanner(System.in);
		 System.out.println("Enter the Upper_Bound and Lower_Bound: ");
		 int LB = sm.nextInt();
	     int UB = sm.nextInt();
		
// Printing LowerBound and UpperBound: 
	     
		System.out.println("User input numbers are: " + LB +" and "+ UB);
		
		ForOddNum(LB , UB);   // calling method 
		ForEvenNum(LB , UB);  // calling method
	}

// Method to calculate Sum of Even Numbers:
	
	static void ForOddNum(int LB , int UB) {
		
		int sum = 0;
		
		while(LB <= UB) {
		
			if(LB % 2 == 1) {
			 sum = sum + LB;	 
			
		   }
			 LB++;
	    }
	
          System.out.println("Sum of All ODD numbers in LB & UB is: " +sum);	
	
	  }

// Method to calculate Sum of Even Numbers:
	
      static void ForEvenNum(int LB , int UB) {
		
		int sum = 0;
		
		while(LB <= UB) {
		
			if(LB % 2 == 0) {
			 sum = sum + LB;	 
			
		   }
			 LB++;
	    }
	
          System.out.println("Sum of All Even numbers in LB & UB is: " +sum);	
	  }

}
		
	