package assignment_1;
import java.util.Scanner;

public class assignment_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a num	:");
		int num=sc.nextInt();
		
		switch(num) {
			case 1:
				System.out.println("ONE");
				break;
			case 2:
				System.out.println("TWO");
				break;
			case 3:
				System.out.println("THREE");
				break;
			case 4:
				System.out.println("FOUR");
				break;
			case 5:
				System.out.println("FIVE");
				break;
			case 6:
				System.out.println("SIX");
				break;
			case 7:
				System.out.println("SEVN");
				break;
			case 8:
				System.out.println("EIGHT");
				break;
			case 9:
				System.out.println("NINE");
				break;
			default:
				System.out.println("OTHER");
				break;
		}
		
	}
}
/*
public class assignment_3 {

	public static void main(String[] args) {
		//nested if
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a num	:");
		int num=sc.nextInt();
		
		if(num>=1 && num <=9) {
			if(num==1)
				System.out.println("ONE");
			if(num==2)
				System.out.println("TWO");
			if(num==3)
				System.out.println("THREE");
			if(num==4)
				System.out.println("FOUR");
			if(num==5)
				System.out.println("FIVE");
			if(num==6)
				System.out.println("SIX");
			if(num==7)
				System.out.println("SEVEN");
			if(num==8)
				System.out.println("EIGHT");
			if(num==9)
				System.out.println("NINE");	
		}		
		else
			System.out.println("OTHER");
	}

	}
*/

