//Create a Java Program to Sort an Array of Numeric Data.

import java.util.Arrays;
import java.util.Scanner;

class Sort_fun {
	Scanner sc=new Scanner(System.in);
	
//	Accept Array Elements
	void accept(int a[],int len) {
		System.out.println("Enter Array element: ");
		for(int i=0;i<len;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	
//	Display Array Elements
	 void Disp(int arr[],int len) {
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
//	Sort Array Elements
	 void sort_fun(int arr[],int len) {
		for(int i=0;i<len;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
	}
	
}	

public class question_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m;
		System.out.println("Enter number of element in Original Array");
		m=sc.nextInt();
		int arr[]=new int[m] ;
		
		Sort_fun  s1=new Sort_fun();
		s1.accept(arr, m); //Accept Array Elements
		System.out.print("UnSorted Array is: ");
		s1.Disp(arr,m);//Display Unsorted Array Elements
		
		s1.sort_fun(arr,m); // or   Use:  Arrays.sort(arr);[predefined function]   //Sort Given Array

		
		System.out.print("Sorted Array is: ");
		s1.Disp(arr,m);//Display sorted Array Elements
		

	}


	

}
