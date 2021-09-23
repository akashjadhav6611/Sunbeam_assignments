//5. Accept 20 integer inputs from user and print the following:
//number of positive numbers , number of negative numbers
//number of odd numbers , number of even numbers
//number of 0s.

package Assignment2;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment2_5 {

	public static void main(String[] args) {
		
//		char ch = args[0].charAt(0);
//		System.out.println(ch);
		Scanner sc=new Scanner(System.in);
		int arr[] = new int[20]; 
		int p,n,o,e;
		p=n=o=e=0;
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf("Enter int for %d th position	:",i);
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=0)
				p++;
			else 
				n++;
			if(arr[i]%2==0)
				e++;
			else
				o++;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Total Positive numbers	:  "+p);
		System.out.println("Total Negative numbers	:  "+n);
		System.out.println("Total Even numbers	:  "+e);
		System.out.println("Total Odd numbers	:  "+o);
	}

}
