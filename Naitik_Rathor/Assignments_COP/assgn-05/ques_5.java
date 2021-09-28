package array_equals;
import java.util.Arrays;
import java.util.Scanner;

public class ques_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int arr1[]=new int[5];
		int arr2[]=new int[5];
		boolean flag=true;
		
		System.out.println("Enter array 1:");
		for(int i =0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter array 2:");
		for(int i =0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		
		if(arr1.length==arr2.length) {
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]!=arr2[i])
					flag=false;
			}
		}
		else
			flag=false;
		
		System.out.println("Array1 :"+Arrays.toString(arr1));
		System.out.println("Array2 :"+Arrays.toString(arr2));
		if(flag==true)
			System.out.println("arrays are equal.");
		else
			System.out.println("arrays are not equal.");
		
		sc.close();
	}

}
