import java.util.Scanner;

public class Ass5_2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of array elements ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		int temp = 0;
		System.out.println("Enter array elements ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr[i] : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter array elements are :");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"\t");
		}
		System.out.println("enter array sorting choice 1:descending  2:ascending");
		int choice = sc.nextInt();
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
				switch(choice) {
				
				
				case 1:	if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				case 2: if(arr[i]<arr[j]) {
					temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				}
				}
		}
		System.out.println("Sorted array : ");
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]+"\t");
		}
		sc.close();
	}

}
