package sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class Asg_3 {

	public static void main(String[] args) 
	{
		int[] arr = new int[] {85,95,25,45,5,35,15,75,65,55};

		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		boolean temp = false;
		
		for(int i = 0 ; i < 10 ; i++)
		{
			if(arr[i] == key)
			{
				temp = true;
				break;
			}
		}

		System.out.println("Is the array element present in the given array ?");
		System.out.println(temp);
	}
		
}
