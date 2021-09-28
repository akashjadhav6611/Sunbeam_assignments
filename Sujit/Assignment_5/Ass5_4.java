import java.util.Scanner;

public class Ass5_4 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Input number of array elements :");
			int n = sc.nextInt();
			int arr1[] = new int[n];
			int arr2[] = new int[arr1.length];
			
			System.out.println("Enter arr1 elements");
			for(int i=0; i<arr1.length;i++) {
				System.out.printf("arr["+i+"] : ");
				arr1[i] = sc.nextInt();
			}
			System.out.println("Array Elements are :");
			for(int i=0;i<arr1.length;i++) {
				System.out.println("arr["+i+"] : "+arr1[i]);
			}
			for(int j=0;j<arr1.length;j++) {
				arr2[j] = arr1[j];
			}
			
			System.out.println("arr2 after copying elements from arr1");
			for(int i=0; i<arr2.length;i++) {
				System.out.println("arr2["+i+"] : "+arr2[i]);
				
			}
			sc.close();
	}

}
