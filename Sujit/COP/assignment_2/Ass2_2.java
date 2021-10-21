package assignment2_1;

import java.util.Scanner;

public class Ass2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower bound element");
		int low = sc.nextInt();
		System.out.println("Enter upper bound element");
		int up = sc.nextInt();
		int Ecount = 0, Ocount = 0;
		sc.close();
		while(low<=up) {
			if(low%2==0){
				Ecount= Ecount + low;
			}
			else {
				Ocount = Ocount + low;
				
			}low++;
			
		}
		System.out.println("sum of even numbers is = "+Ecount);
		System.out.println("sum of odd numbers is = "+Ocount);
	}

}
