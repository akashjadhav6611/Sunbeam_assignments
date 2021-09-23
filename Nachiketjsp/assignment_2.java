package assignment_1;
import java.util.Scanner;

public class assignment_2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a radius	:");
		float radius = sc.nextFloat();
		int ch;

		do {
			System.out.println("0.exit\n1.area\n2.circumference");
			System.out.println("Enter a choice	:");
			ch=sc.nextInt();
			
			switch(ch) {
		
			case 1:
				double area= Math.PI*radius*radius;
				System.out.println("Area of circle is 	:"+area);
			break;
			
			case 2:
				double circum= 2*Math.PI*radius;
				System.out.println("circumference of circle is 	:"+circum);
			break;
			}
			
		}while(ch!=0);
		
	}

}
