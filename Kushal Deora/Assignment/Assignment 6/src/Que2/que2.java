package Que2;

import java.util.Scanner;

public class que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
String name[]=new String[5];
int flag=0;
for(int i=0;i<5;i++)
{
	System.out.println("Enter the Strings");
	name[i]=sc.next();
}


for(int i=0;i<5;i++)
{
	
	for(int j=i+1;j<5;j++)
	{
	
		if(name[i].equalsIgnoreCase(name[j]))
		{
			System.out.println("Duplicate element found is "+name[j]+" at index:"+i+", "+j);
			flag=1;
	
		}
	}
}
if(flag==0)
	System.out.println("No Duplicate element found");
sc.close();

	}
	//if(name[i]==name[j])
//	{
//		
	//}
}
