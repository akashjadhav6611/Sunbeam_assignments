package SunbeamAssignments;
import java.util.*;

public class Program3 {
	
	public static void main(String[] args) {
		
		Scanner sm = new Scanner(System.in);
		
	for(int i = 0 ; i< 10 ; i++) {	
		System.out.println("Enter the Number: ");
	    int Num = sm.nextInt();
	
	
		if(Num > 0 && Num < 9) {
			
			if(Num == 1)
				System.out.println("ONE");
			if(Num == 2)
				System.out.println("TWO");
			if(Num == 3)
				System.out.println("THREE");
			if(Num == 4)
				System.out.println("FOUR");
			if(Num == 5)
				System.out.println("FIVE");
			if(Num == 6)
				System.out.println("SIX");
			if(Num == 7)
				System.out.println("SEVEN");
			if(Num == 8)
				System.out.println("EIGHT");
			if(Num == 9)
				System.out.println("NINE");
		}
		
		else
			System.out.println("OTHER");
	
	 }
	
	}

}
