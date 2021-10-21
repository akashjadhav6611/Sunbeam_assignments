package assignment2_1;

import java.util.Scanner;

public class Ass2_5 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int array[] = new int[20];
		
		for(int i=0;i<20;i++) {
			System.out.println("Enter array elements : ");
			array[i] = sc.nextInt();
			
		}
		int pos = 0 ,neg = 0 ,zero = 0,odd = 0 , even = 0 ;
		
		for(int i = 0; i<20;i++) {
			if(array[i] == 0){
				zero++;
			}
			if(array[i]%2 == 0) {
				even++;
			}
			if(array[i]%2 ==1) {
				odd++;
			}
			if(array[i]>0) {
				pos++;
			}
			if(array[i]<0) {
				neg++;
			}
		}
		sc.close();
		System.out.println("Number of zero's = "+zero);
		System.out.println("Number of even numbers = "+even);
		System.out.println("Number of odd numbers = "+odd);
		System.out.println("Number of positive numbers = "+pos);
		System.out.println("Number of negative numbers = "+neg);
	}

}
