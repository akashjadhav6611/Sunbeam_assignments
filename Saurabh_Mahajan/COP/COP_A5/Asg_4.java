package sunbeam;

import java.util.Arrays;

public class Asg_4 {

	public static void main(String[] args) {
		int[] arr = new int[] {2,4,6,8,10};
		int[] brr = new int[arr.length];
		
		for(int i = 0 ; i < brr.length ; i++)
		{
			brr[i] = arr[i];
		}
		brr[2] = 25;
		System.out.println("Array arr : "+Arrays.toString(arr));
		System.out.println("Array brr : "+Arrays.toString(brr));

		int[] crr = new int[arr.length];
		crr = arr.clone();
		crr[2] = 30;
		System.out.println("Array arr : "+Arrays.toString(arr));
		System.out.println("Array crr : "+Arrays.toString(crr));

	}

}
