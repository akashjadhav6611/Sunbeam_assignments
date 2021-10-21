package assignment2_1;

import java.util.Scanner;

public class Assign2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower bound element");
		int low = sc.nextInt();
		System.out.println("Enter upper bound element");
		int up = sc.nextInt();
		int count = 0;
		
		while(low<=up) {count=count+low;
								low++;
			
		}
		System.out.println("print total "+count);
		
		
	}

}
