package Que1;

import java.util.Scanner;

public class que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int flag=0;
		System.out.println("Enter the String");
String name=sc.next();
System.out.println("Enter the character to Search");
char ch=sc.next().charAt(0);
for(int i=0;i<name.length();i++)
{
	if(name.charAt(i)==ch)
		flag=1;
}
if(flag==1)
	System.out.println("Found");
else
	System.out.println("Not Found");
sc.close();
	}

}
