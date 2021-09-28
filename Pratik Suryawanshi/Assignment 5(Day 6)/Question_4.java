//Create a Java code to copy an Array into another array.

import java.util.Scanner;

public class question_4 {
	
	static Scanner sc=new Scanner(System.in);
	
//	Accept Array Elements
	static void accept(int a[],int size) {
		System.out.println("Enter Array element: ");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
	}
	
//	Display Array Elements
	static void Disp(int arr[],int len) {
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
//	Copy one array to other
	static void arrayCopy(int a[],int b[],int len) {
		for(int i=0;i<len;i++) {
			b[i]=a[i];
		}
	}
	
	public static void main(String[] args) {
		
		int m;
		System.out.println("Enter number of element in Original Array");
		m=sc.nextInt();
		int arr[]=new int[m] ;
		int arr2[]=new int[m];
		
		accept(arr,m); //Accept Array Elements
		
		System.out.print("Array element in Original Array: ");
		Disp(arr,m);  //Display Array Elements
		
		arrayCopy(arr,arr2,m); 
		
		
		System.out.print("Array element in Copied Array: ");
	
		Disp(arr2,m);  //Display Array Elements
		

	}

}
