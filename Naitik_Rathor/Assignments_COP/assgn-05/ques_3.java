package specific_value;
import java.util.Arrays;
import java.util.Scanner;

public class ques_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		boolean flag=false;
		int index=0;
		System.out.println("Enter Array Elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array: "+Arrays.toString(arr));
		System.out.println("Enter number to find:");
		int key=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				flag=true;
				index=i;
				continue;
			}
			
		}
		
		if(flag==true)
			System.out.println("Your number "+key+" is available at index "+index);
		else
			System.out.println("Number not available.");
			
		

		sc.close();
	}

}
