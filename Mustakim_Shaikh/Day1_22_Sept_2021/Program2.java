package SunbeamAssignments;
import java.util.*;

public class Program2 {

	public static void main(String[] args) {
		
		final float pi = 3.142f;
		Scanner sm = new Scanner(System.in); 
		System.out.println("Enter Radius of Circle: ");
		float r = sm.nextFloat();

		float Area , Cir;
		
		Area = pi * r * r ;
		Cir = 2 * pi * r ;
		
		System.out.println("Area of Circle is : " +Area+ " Circumference of Circle is: " +Cir);
		
	}

}
