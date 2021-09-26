//Program to display addition of numbers from a lower bound to an upper bound using a while-loop.

package question_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int lBound,uBound,sum=0;
		System.out.print("Enter The Lower Bound: ");
		lBound=sc.nextInt();
		System.out.print("Enter The Upper Bound: ");
		uBound=sc.nextInt();
		while(lBound<=uBound) {
			sum=sum+lBound;
			lBound++;
		}
		System.out.print("Sum: "+sum);

	}

}
