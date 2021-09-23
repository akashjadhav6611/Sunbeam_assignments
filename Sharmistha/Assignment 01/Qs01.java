import java.util.*;
public class Qs01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter 4 digit Number");

	    int num = scan.nextInt();
	    System.out.println("User input number is: " + num);
	    
	    int count = 0;
	    
	    for (int i = 0; i<4; i++) {
	    	 count = count + num%10;
	    	 num = num / 10;
	    }
	    System.out.println("Digit sum is: " + count);

	}

}
