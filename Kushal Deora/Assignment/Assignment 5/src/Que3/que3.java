package Que3;

import java.util.Scanner;


public class que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[5];
Scanner sc = new Scanner(System.in);
int flag=0;
System.out.println("Enter the Elements of Array:");
for(int i=0;i<5;i++)
{
	arr[i]=sc.nextInt();
}
System.out.println("Enter the Element to find");
int ele=sc.nextInt();
for(int i=0;i<5;i++)
{
	if(arr[i]==ele)
		flag=1;
}
if(flag==1)
	System.out.println("Found");
else
	System.out.println("Not Found");
	}

}
