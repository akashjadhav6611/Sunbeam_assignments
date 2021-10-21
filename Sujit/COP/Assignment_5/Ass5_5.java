import java.util.Scanner;
import java.util.Arrays;
public class Ass5_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of array elements for first array :");
		int n1 = sc.nextInt();
		int arr1[] = new int[n1];
		System.out.println("Input number of array elements for second array :");
		int n2 = sc.nextInt();
		int arr2[] = new int[n2];
		
		System.out.println("Enter arr1 elements");
		for(int i=0; i<arr1.length;i++) {
			System.out.printf("arr1["+i+"] : ");
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter arr2 elements");
		for(int i=0; i<arr2.length;i++) {
			System.out.printf("arr2["+i+"] : ");
			arr2[i] = sc.nextInt();
		}
		boolean result = Arrays.equals(arr1,arr2);
		
		if(result==true) {
		System.out.println("Array arr1 Elements are :");
		for(int i=0;i<arr1.length;i++) {
			System.out.println("arr1["+i+"] : "+arr1[i]);
		}
		System.out.println("Array arr2 Elements are :");
		for(int i=0;i<arr2.length;i++) {
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}
		System.out.println("\nArray are Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		sc.close();
	}

}
