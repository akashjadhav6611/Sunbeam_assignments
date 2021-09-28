package Que2;

import java.util.Arrays;
import java.util.Scanner;
class sort
{
	void sort_array(int arry[])
	{
		Arrays.sort(arry);
		System.out.println(Arrays.toString(arry));
		
	}
}
public class que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[]=new int[5];
sort s1 =new sort();

Scanner sc=new Scanner(System.in);
System.out.println("Enter elements");
for(int i=0;i<5;i++)
{
	array[i]=sc.nextInt();
	
}
s1.sort_array(array);
	}

}
