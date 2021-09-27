//Display sum of the odd numbers and the even numbers from a lower bound to an upper bound.

package question_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int lBound,uBound,Esum=0,Osum=0;
		System.out.println("Enter The Lower Bound: ");
		lBound=sc.nextInt();
		System.out.println("Enter The Upper Bound: ");
		uBound=sc.nextInt();
		while(lBound<=uBound) {
			if(lBound%2==0) {
				Esum+=lBound;
			}
			else {
				Osum+=lBound;
			}
			lBound++;
		}
		System.out.println("Sum of Even Numbers: "+Esum);
		System.out.println("Sum of Odd Numbers: "+Osum);

	}

}
