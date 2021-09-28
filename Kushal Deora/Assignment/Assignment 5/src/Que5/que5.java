package Que5;

import java.util.Scanner;


public class que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a1[]=new int[5];
int a2[]=new int[5];
int flag=0;
Scanner sc =new Scanner(System.in);
System.out.println("Elements of First Array:");
for(int i=0;i<5;i++)
{
	a1[i]=sc.nextInt();
}
System.out.println("Elements of Second Array:");
for(int i=0;i<5;i++)
{
	a2[i]=sc.nextInt();
}

for(int i=0;i<5;i++)
{
	if(a1[i]!=a2[i]) 
	{
		flag=1;
		break;
	}
}
if(flag==1)
System.out.println("Not Equal");
else
	System.out.println("Equal");
	}

}
