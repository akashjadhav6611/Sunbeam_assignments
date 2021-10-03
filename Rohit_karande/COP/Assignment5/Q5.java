import java.util.Arrays;

//5. Write a Java program to check if two arrays are equal.


public class Q5 {

	public static void main(String[] args) {
		
		   int arr[]= new int[] {1,2,3,4,5,6,7,8};
			System.out.println("Array elements");
			System.out.println(Arrays.toString(arr));
			
			   int arr2[]= new int[] {1,2,3,4,5,6,7};
			   System.out.println(Arrays.toString(arr2));
			   
		  
		 

		  if(Arrays.equals(arr, arr2)) {
			  System.out.println("Array elements are equal");
		  }else {
			  System.out.println("Array elements are not equal");

		  }
			   
			   
			   
			   
			   
	}

}
