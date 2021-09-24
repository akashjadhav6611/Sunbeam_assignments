package operation;

import java.util.Scanner;

public class Ass1_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double div;
		System.out.println("Enter 1st number A");
		int A= sc.nextInt();
		System.out.println("Enter 2nd number B");
		int B= sc.nextInt();
		System.out.println("********enter choice*********\n 1.ADDITION 2.SUBSTRACTION 3.MULTIPLICATION 4.DIVISION 5.EXIT");
		int num = sc.nextInt();
		
		
			switch(num) {
		
		case 1: System.out.println("ADDITION = "+(A+B));
				break;
		
		case 2: System.out.println("SUBSTRACTION = "+(A-B));
				break;		
				
		case 3: System.out.println("MULTIPLICATION = "+(A*B));
				break;	
				
		case 4:  
			div = (double)A/B;
			 System.out.println("DIVISION = "+div);
				break;
		case 5: System.exit(0);		
		}
		

	}

}
