

package Assignment02;
import java.util.*;
public class Qs05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		
		int array[] = new int[20];  

	    for (int i = 0; i<20; i++) {
	    	System.out.println("Enter Number: ");
	    int num1 = scan.nextInt();	
	    	array[i] = scan.nextInt();
	    }
	    int num1 = 0,num2=0;
	    int count = 0;
	   
	    
	    while (num1<=num2) {
	    	count = count + num1;
	    	num1++;
	    int zero = 0;
	    int positive = 0;
	    int negative = 0;
	    int odd = 0;
	    int even = 0;

	    for (int j = 0; j<20; j++) {
	    	if (array[j] == 0) {
	    		zero++;
	    	}
	    	if (array[j]%2 == 1) {
	    		odd++;
	    	}
	    	if (array[j]%2 == 0) {
	    		even++;
	    	}
	    	if (array[j]> 0) {
	    		positive++;
	    	}
	    	if (array[j]< 0) {
	    		negative++;
	    	}
	    }
	    System.out.println("Digit sum is: " + count);

	    System.out.println("Number of zero is: " + zero);
	    System.out.println("Number of positive is: " + positive);
	    System.out.println("Number of negative is: " + negative);
	    System.out.println("Number of odd is: " + odd);
	    System.out.println("Number of even is: " + even);


	}

}
}
