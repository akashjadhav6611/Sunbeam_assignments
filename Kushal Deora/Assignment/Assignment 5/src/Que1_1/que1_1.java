package Que1_1;

import java.util.Arrays;
import java.util.Scanner;

class Sub
{Scanner sc =new Scanner(System.in);

	void sub(int a[],int st,int ed)
	{
		System.out.println("Enter elements");
		for(int i=0;i<11;i++)
		{
			a[i]=sc.nextInt();
		}
		int subarr[]= Arrays.copyOfRange(a, st, ed+1);
		System.out.println("Elements of Sub Array::");
		for(int i=0;i<(ed-st+1);i++)
		{
			System.out.print(subarr[i]+", ");
			
			
		}
	}
}
public class que1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[11];
		Sub s =new Sub();
		s.sub(arr,3,8);
	}

}
