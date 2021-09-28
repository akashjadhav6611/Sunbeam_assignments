//Write a Java Program to check if see if Array contains a specific value

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		int arr[]=new int[] {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
		int key,t=0,i=0;;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The number want to find: ");
		key=sc.nextInt();
		for( i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				t=1;
				break;
			}
		}
		if(t==1) {
			System.out.println("The given number found at position: "+(i+1));
			
		}
		else {
			
			System.out.println("The given number is not present in array");
		}
		
	}

}
