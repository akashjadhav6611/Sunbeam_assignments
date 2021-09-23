import java.util.Scanner;

public class Que_5 {
	
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
    
	int array[] = new int[20];  

    
    for (int i = 0; i<20; i++) {
    	System.out.println("Enter Number: ");
    	array[i] = scan.nextInt();
    }
    
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
    
    System.out.println("Number of zero is: " + zero);
    System.out.println("Number of positive is: " + positive);
    System.out.println("Number of negative is: " + negative);
    System.out.println("Number of odd is: " + odd);
    System.out.println("Number of even is: " + even);

}
}

/*
 *  Accept 20 integer inputs from user and print the following:
	number of positive numbers , number of negative numbers
	number of odd numbers , number of even numbers
	number of 0s.
 */