import java.util.Scanner;


public class Ass6_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of array elements");
		int n = sc.nextInt();
		int arr[] = new int[n];
		// int length = sizeof(arr[n])/sizeof(arr[0]);
		 
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			System.out.println("arr["+i+"] : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Duplicate elements");
		int k = 0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
					k++;
				}
			}
		}
		System.out.println("number of duplicates : "+k);
		sc.close();
	}
		
}
