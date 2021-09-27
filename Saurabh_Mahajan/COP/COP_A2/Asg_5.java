package sunbeam;

import java.util.Scanner;

public class Asg_5 
{

	public static void main(String[] args)
	{
		int arr[] = new int[20];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Numbers : ");
		for(int i = 0 ; i < 20 ; i++)
		{
			System.out.println("arr at "+i+" : ");
			arr[i] = sc.nextInt();
		}
		
		int p=0,n=0,o=0,e=0,z=0;
		
		System.out.println("Numbers are : ");
		for(int i = 0 ; i < 20 ; i++)
		{
			if(arr[i] < 0)
				n++;
			if(arr[i] > 0)
				p++;
			if(arr[i] == 0)
				z++;
			if(arr[i] % 2 == 0 && arr[i] != 0)
				e++;
			else if(arr[i] % 2 != 0 && arr[i] != 0)
				o++;
			
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("----------------------------------------------");
		System.out.println("\nNumber of Negative Integers : "+n);
		System.out.println("Number of Postive Integers : "+p);
		System.out.println("Number of Zero : "+z);
		System.out.println("Number of Even Integers : "+e);
		System.out.println("Number of Odd Integers : "+o);
		System.out.println("----------------------------------------------");
	}

}
