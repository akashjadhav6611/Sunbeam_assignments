package discount;

import java.util.Scanner;

public class Ass1_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of units Bought");
		int units = sc.nextInt();
		int cost = 100*units;
		System.out.println("Actual cost is = "+cost);
		
		if(cost>1000) {
		double total = cost*0.9;
		System.out.println("Cost after discount is = "+total);
		}
		else{
			System.out.println("No Discount");
		}
	}
}


