import java.util.Scanner;

public class Que_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter 5 digit Number");

	    int num = scan.nextInt();
	    System.out.println("User input number is: " + num);
	    
	    int count = 0;
	    
	    for (int i = 0; i<5; i++) {
	    	 count = count + num%10;
	    	 num = num / 10;
	    }
	    System.out.println("Digit sum is: " + count);

	}

}
