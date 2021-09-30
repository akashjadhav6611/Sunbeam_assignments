package sunbeam;

import java.util.Arrays;

public class Asg_1 {

	public static void main(String[] args) {
		int[] arr = new int[] {10,12,20,30,25,40,32,31,35,50,60};
		int[] sub = new int[] {30,25,40,32,31,35};
		boolean temp = true;
		
		for(int i = 0 ; i < sub.length ; i++)
			sub[i] = arr[i + 3];

		System.out.println("Array : "+Arrays.toString(arr));
		System.out.println("Subarray : "+Arrays.toString(sub));

	}

}
