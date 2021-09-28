package Que2_1;

import java.util.Scanner;
class sort
{
	void sort_array(int arry[])
	{
		for(int i=0;i<8;i++)
		{
			int s=arry[i];
			for(int j=i+1;j<8;j++) {
				if(arry[i]>arry[j])
				{
					int temp=arry[j];
					arry[j]=arry[i];
					arry[i]=temp;
					
				}
			}
		}
		for(int i=0;i<8;i++)
		{
			System.out.print(arry[i]+", ");
		}
		
		
	}
}
public class que2_1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[]=new int[8];
sort s1 =new sort();
Scanner sc=new Scanner(System.in);
System.out.println("Enter elements");
for(int i=0;i<8;i++)
{
	array[i]=sc.nextInt();
}
s1.sort_array(array);
	}

}