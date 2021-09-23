import java.lang.Math;
import java.util.Scanner;

public class Que_6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter any Number");

	    int num = scan.nextInt();
	    System.out.println("User input number is: " + num);
	    
	    int value = Math.abs(num);
	    System.out.println("Absolute Number is: " + value);
	}

}
