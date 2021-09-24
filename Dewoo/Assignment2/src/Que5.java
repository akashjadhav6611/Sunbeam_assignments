/*

5. Accept 20 integer inputs from user and print the following: 
	number of positive numbers , number of negative numbers number of odd numbers , number of even numbers number of 0s.
*/


import java.util.Iterator;
import java.util.Scanner;

public class Que5 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int arr[]= new int[20];
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Enter the Integer: " );
			arr[i]=sc.nextInt();
		}
		
		int zero=0,positive=0,negative=0,odd=0,even=0;
		
		
		for(int j=0;j<20;j++) {
			if(arr[j]==0) {
				zero++;
				
			}
				
				
			if(arr[j]>0) {
				positive++;
				
			}
				
			if(arr[j]<0) {
				negative++;
				
			}
				
			if(arr[j]%2==1) {
				odd++;
				
			}
				
			if(arr[j]%2==0)
			{
				even++;
				
			}
			
		}

		
		System.out.println("Number of zero is: " + zero);
		System.out.println("Number of positive is: " + positive);
		System.out.println("Number of negative is: " + negative);
		System.out.println("Number of odd is: " + odd);
		System.out.println("Number of even is: " + even);
		
	}

}
