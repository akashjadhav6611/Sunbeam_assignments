//2. Display sum of the odd numbers and the even numbers from a lower
//bound to an upper bound.

package Assignment2;
import java.util.Scanner;

public class Assignment2_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int lb,ub,i,x,y;
		x=y=0;
		System.out.println("Enter lower bound");
		lb=sc.nextInt();
		System.out.println("Enter upper bound");
		ub=sc.nextInt();
		
		i=lb+1;
		
		while(i>=lb && i<ub) {
			
			if((i%2)==0) {
				x=x+i;
				}
			else 
				y=y+i;
			i++;
	}
		System.out.println("Sum of even numbers		:  "+x);
		System.out.println("Sum of odd numbers		:  "+y);
}

}