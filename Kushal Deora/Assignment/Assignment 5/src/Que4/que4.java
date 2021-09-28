package Que4;

import java.util.Scanner;


public class que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a1[]=new int[5];
int a2[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter elements of First Array");
for(int i=0;i<5;i++)
{
	a1[i]=sc.nextInt();
}
System.out.println("Copying......");
for(int i=0;i<5;i++)
{
	a2[i]=a1[i];
}
System.out.println("Elements of Second Array:");
for(int i=0;i<5;i++)
{
	System.out.print(a2[i]+", ");
}
	}

}
