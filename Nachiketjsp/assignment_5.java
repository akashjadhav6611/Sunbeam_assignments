package assignment_1;
import java.util.Scanner;

public class assignment_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a num1	:");
		int num1=sc.nextInt();
		System.out.println("Enter a num2	:");
		int num2=sc.nextInt();
		
		int ch;
		
		do {
			System.out.println("0.exit\n1.addition\n2.subtraction\n3.product\n4.division");
			System.out.println("Enter a choice	:");
			ch=sc.nextInt();
			
			switch(ch) {
				case 1:
					System.out.println("sum	:"+(num1+num2));
					break;
					
				case 2:
					if(num1>=num2)
						System.out.println("subtraction	:"+(num1-num2));
					else 
						System.out.println("subtraction	:"+(num2-num1));
					break;
					
				case 3:
					System.out.println("product	:"+(num1*num2));
					break;
					
				case 4:
					if(num1>=num2)
					System.out.println("division	:"+(num1/num2));
					else 
						System.out.println("division	:"+(num2/num1));
					break;

			}
		}while(ch!=0);
	}
}
