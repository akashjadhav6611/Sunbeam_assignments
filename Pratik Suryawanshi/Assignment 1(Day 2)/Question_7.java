//A shop will give discount of 10% if the cost of purchased
//quantity is more than 1000.
//Ask user for quantity and suppose, 
//one unit will cost 100.
//Calculate and print total cost for user.

package question_7;


import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		float cost,finalCost,discount;
		int unit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Unit Purchased: ");
		unit=sc.nextInt();
		cost=unit*100;
		if(cost>=1000) {
			discount=(cost*10)/100;
			finalCost=cost-discount;
			System.out.println("Final Price(after 10% discount): "+finalCost);			
		}
		else {
			System.out.println("Final Price: "+cost);			
			
		}
		

	}

}
