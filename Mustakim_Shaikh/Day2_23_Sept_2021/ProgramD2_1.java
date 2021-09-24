package SunbeamAssignments;
import java.util.*;

public class ProgramD2_1 {

public static void main(String[] args) {


	 Scanner sm = new Scanner(System.in);
	 System.out.println("Enter the Upper_Bound and Lower_Bound: ");
	 int LB = sm.nextInt();
	 int UB = sm.nextInt();
	
	System.out.println("User input numbers are: " + LB +" and "+ UB);
	 
	int sum = 0;
	 while(LB <= UB) {
		 
		 sum = sum + LB;
		 
		 LB++;
	 }
	 
	 System.out.println("Total sum of digits in Lower_Bound and Upper_Bound is: " +sum);
   
     }
}

