
/*

2. Display sum of the odd numbers and the even numbers from a lower bound to an upper bound.


*/

import java.util.Scanner;


public class Que2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Lower Bound Number: ");
	    int num1 = scan.nextInt();
	    System.out.println("Enter Upper Bound Number: ");
	    int num2 = scan.nextInt();

	    System.out.println("User input numbers are: " + num1 +" and "+ num2);

	    //int count = 0;

	    System.out.println("Odd Digit sum is: " + countOdd(num1, num2));
	    System.out.println("Even Digit sum is: " + countEven(num1, num2));

	}

	static int countOdd(int i, int j) {
		int count = 0; 
		int odd = i%2==1?1:0;
		if(odd==1) {
			while (i<=j) {
		    	count = count + i;
		    	i+=2;
		    }
		}
		else {
			i++;
			while (i<=j) {
			    count = count + i;
			    i+=2;
			    }	
			}
		return count;
		}

	static int countEven(int i, int j) {
		int count = 0; 
		int even = i%2==0?1:0;
		if(even==1) {
			while (i<=j) {
		    	count = count + i;
		    	i+=2;
		    }
		}
		else {
			i++;
			while (i<=j) {
			    count = count + i;
			    i+=2;
			    }	
			}
		return count;
		}

	}
