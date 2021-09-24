package sunbeam;

import java.util.Scanner;

public class Assignment1_P2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int r;
		System.out.println("Enter radius = ");
		r= sc.nextInt();
		System.out.printf("AREA OF CIRCLE =%.3f\n", Math.PI*r*r);		
		System.out.printf("CIRCUMFERENCE OF CIRCLE = %.4f" , Math.PI*r*2);
		sc.close();
		
		
		// TODO Auto-generated method stub

	}

}
