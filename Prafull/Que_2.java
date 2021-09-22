import java.util.Scanner;

public class Que_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Radius");

	    int num = scan.nextInt();
	    System.out.println("User input number is: " + num);
	    
	    double pi = 3.141529;
	   
	    System.out.println("Circumference is: " + (2*pi*num));
	    System.out.println("Area is: " + (pi*num*num));

	}

}
