
import java.util.Arrays;
import java.util.Scanner;

//4. Create a Java code to copy an Array into another array.



public class Q4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
       int arr[]= new int[8];
		System.out.println("Enter Array elements");
       for(int i=0;i<8;i++) {
       arr[i]=sc.nextInt();
       }
       
       
       
		System.out.println("Array elements");
		System.out.println("arr= "+Arrays.toString(arr));
		
		System.out.println("Copy of Array elements");
		int arr2[]= Arrays.copyOf(arr, 8);
		System.out.println("arr2= "+Arrays.toString(arr2));

sc.close();

	}

}
