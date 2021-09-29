//If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60], 
//your program should be able to find that the subarray lies between the indexes 3 and 8.

import java.util.Scanner;

public class question_1 {

	public static void main(String[] args) {
		int arr[]=new int[] {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
		int subarr[]=new int[6];
		int j=0;
		Scanner sc=new Scanner(System.in);
		for(int i=3;i<8;i++) {
			
			subarr[j]=arr[i];
			j++;
		}
		for(int i=0;i<subarr.length;i++) {
			System.out.println(subarr[i]);
		}
		

	}

}


