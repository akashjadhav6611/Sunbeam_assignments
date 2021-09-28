package sort_array;
import java.util.Arrays;
import java.util.Scanner;


public class ques_2 {

	public static void main(String[] args) {
		
		int arr[]=new int[5];
		int temp;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter elements of array:");
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array before sorting: "+Arrays.toString(arr));
	
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Array after sorting: "+Arrays.toString(arr));
		sc.close();
	}

}
