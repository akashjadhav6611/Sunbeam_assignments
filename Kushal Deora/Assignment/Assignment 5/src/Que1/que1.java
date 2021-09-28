package Que1;

import java.util.Scanner;

public class que1 {

	static Scanner sc =new Scanner(System.in);
	
	static void accept(int a[])
	{System.out.println("Enter elements");
		for(int i=0;i<11;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	static void disp(int a[])
	{System.out.println("Elements:");
		for(int i=0;i<11;i++)
		{
			System.out.println(a[i]);
			
		}
	}
	static void sub(int a[],int s, int e)
	{
		int sze= e-s+1;
		
		int subarr[]=new int[sze];
		for(int i=0;i<sze;i++,s++)
		{
			
			subarr[i]=a[s];
		}
		System.out.println("Elements of Sub Array::");
		for(int i=0;i<sze;i++)
		{
			System.out.print(subarr[i]+", ");
			
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[11];
accept(arr);

sub(arr,3,8);
	}

}





