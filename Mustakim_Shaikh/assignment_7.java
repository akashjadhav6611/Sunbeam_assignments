package assignment_1;
import java.util.Scanner;

public class assignment_7 {

	public static void main(String[] args) {
		int qty,mrp=100;
		double fp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantity :");
		qty=sc.nextInt();
		
		if(qty>1000) {
			fp=(qty*mrp)*0.9;
			System.out.println("Discount applied and final price is : " +fp);
		}
		
		else
			System.out.println("Discount not applied and final price is : " +(qty*mrp));
			
	}

}
