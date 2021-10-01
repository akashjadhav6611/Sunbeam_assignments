package sunbeam;

import java.util.Arrays;

public class Asg_5 {

	public static void main(String[] args) {
		int[] arr = new int[] {2,4,6,8,10};
		int[] brr = new int[] {2,4,6,8,10};
		int[] crr = new int[] {5,10,15,20,25};
		boolean temp = true;
		
		if(arr.length == crr.length)
		{
			for(int i = 0 ; i < arr.length ; i++)
				if(arr[i] != crr[i])
					temp = false;
		}

		System.out.println("Array arr : "+Arrays.toString(arr));
		System.out.println("Array crr : "+Arrays.toString(crr));
		if(temp)
			System.out.println("Array arr and array crr are equal\n");
		else
			System.out.println("Array arr and array crr are not equal\n");

		System.out.println("Array arr : "+Arrays.toString(arr));
		System.out.println("Array brr : "+Arrays.toString(brr));
		if(Arrays.equals(arr, brr))
			System.out.println("Array arr and array brr are equal");
		else
			System.out.println("Array arr and array brr are not equal");
		
	}

}
