import java.util.Scanner;


public class Que_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Lower Bound Number: ");
	    int num1 = scan.nextInt();
	    System.out.println("Enter Upper Bound Number: ");
	    int num2 = scan.nextInt();
	    
	    System.out.println("User input numbers are: " + num1 +" and "+ num2);
	    
	    int count = 0;
	    while (num1<=num2) {
	    	count = count + num1;
	    	num1++;
	    }
	    System.out.println("Digit sum is: " + count);

	}

}
