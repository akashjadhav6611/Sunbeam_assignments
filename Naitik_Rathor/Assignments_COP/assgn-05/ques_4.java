package array_copy;
import java.util.Scanner;
import java.util.Arrays;

public class ques_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr1[]=new int[5];
		int arr2[]= {0,0,0,0,0};
		System.out.println("Enter Array:");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Arrays before:");
		System.out.println("Array 1: "+Arrays.toString(arr1));
		System.out.println("Array 2: "+Arrays.toString(arr2));
		
		if(arr1.length==arr2.length) {
			for(int i=0;i<arr1.length;i++) {
				arr2[i]=arr1[i];
			}
		}
		else
			System.out.println("length are not equal");
		
		
		System.out.println("Arrays after:");
		System.out.println("Array 1: "+Arrays.toString(arr1));
		System.out.println("copied Array 2: "+Arrays.toString(arr2));
		sc.close();
	}

}
