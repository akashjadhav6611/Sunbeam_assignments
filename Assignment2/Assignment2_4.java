//4. Take integer inputs from user until he/she presses q ( Ask to press q
//to quit after every integer input ). Print average and product of all
//numbers.

package Assignment2;
import java.util.Scanner;

public class Assignment2_4 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int c,i,sum=0,num,product=1;
		char ch='l';
		
			for(i=0;ch!='q';i++) {
				System.out.println("Enter value for num	:");
				num=sc.nextInt();
				sum=sum+num;
				System.out.println("Press 'q' to Quit & anthing to continue	:");
				ch=sc.next().charAt(0);
				
				product=product*num;
			}
			System.out.println("Average of entered numbers is	: "+(sum/i));
			System.out.println("Product of entered numbers is	: "+product);				
	}	
		

}
