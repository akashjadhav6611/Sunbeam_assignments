import java.util.Scanner;

public class Ass5_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number of elements");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter array elements");
		for(int i =0;i<arr.length;i++) {
			System.out.printf("arr["+i+"] :");
			arr[i] = sc.nextInt();
			
		}
		System.out.println("enter element you want to find");
		int num = sc.nextInt();
		for(int j = 0;j<arr.length;j++) {
			if(arr[j]==num) {
				System.out.println("Entered element found : "+num+"  at arr["+j+"]");
			}
			
			
		}
		sc.close();
	}

}
