import java.util.Arrays;

//If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60], your 
//program should be able to find that the subarray lies between the 
//indexes 3 and 8.

//import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
		int arr[]=new int[] {10,12,20,30,25,40,32,31,35,50,60};
		
		int Subarray[]= Arrays.copyOfRange(arr , 3, 8);
		
		System.out.println("Elements of an array : ");
		System.out.println("array length="+arr.length);
		System.out.println(Arrays.toString(arr));
		System.out.println("Range of sub array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(Subarray[i]);
		}
		

	}

}
