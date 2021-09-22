import java.util.Scanner;

public class Assi7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cost_of_1unit=100;
		System.out.println("Enter the quantity to purchase: ");
		int qty = sc.nextInt();
		
		int cost_without_disc=cost_of_1unit*qty;
		
		if(qty>10) {
			double discounted_price=cost_without_disc-(0.1*cost_without_disc);
			System.out.println("The total cost for the user after 10% discount: "+discounted_price);
		}
		else {
			System.out.println("The total cost for user without discount: "+cost_without_disc);
		}
	}

}
