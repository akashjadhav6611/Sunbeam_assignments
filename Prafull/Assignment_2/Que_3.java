import java.util.Scanner;

public class Que_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Your Marks: ");
	    int num1 = scan.nextInt();
	    //System.out.println("Enter Upper Bound Number: ");
	    //int num2 = scan.nextInt();
	    
	    System.out.println("User input number is: " + num1);
	    
	    String grade = "F";
	    
	    if(num1 <= 25) {
	    	grade = "F";
	    }
	    else if(num1 > 25 && num1<= 45) {
	    	grade = "E";
	    }
	    else if(num1 > 45 && num1<= 50) {
	    	grade = "D";
	    }
	    else if(num1 > 50 && num1<= 60) {
	    	grade = "C";
	    }
	    else if(num1 > 60 && num1<= 80) {
	    	grade = "B";
	    }
	    else if(num1 > 80) {
	    	grade = "A";
	    }
	    
	    System.out.println("Your Grade is: " + grade);

	}

}


/*
 *  a. Below 25 - F
	b. 25 to 45 - E
	c. 45 to 50 - D
	d. 50 to 60 - C
	e. 60 to 80 - B
	f. Above 80 - A
 * */
 