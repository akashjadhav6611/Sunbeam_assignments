import java.util.Scanner;

public class ques_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Quantity: ");

	    int quantity = scan.nextInt();
	    System.out.println("User input number is: " + quantity);
	    
	    int cost = 100;
	    double total = 0; 
	    
	    /*
	     * A shop will give discount of 10% if the cost of purchased 
	     * quantity is more than 1000. Ask user for quantity and suppose, 
	     * one unit will cost 100. 
	     * Calculate and print total cost for user.
	     * */
	    
	    if(quantity > 1000) {
	    	total = cost*quantity*0.9;
	    }
	    else {
	    	total = cost*quantity;
	    }
	    
	    System.out.println("Total price: " + total);
	    scan.close();

	}

}
