package Asm;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Ask user for quantity");
		int q;
		double cost, disc;
		q=sc.nextInt();
		System.out.println("quantity= "+q);

		cost=q*100;
		
		if(cost>1000) {
			System.out.println("cost is > 1000");
			disc=cost*0.1;
			cost=cost-disc;
			System.out.println("cost after disc= "+cost);
				
		}
		else {
			
			System.out.println("cost without disc="+cost);

		}
		
       sc.close();
		
	}

}
