package Que4;

import java.util.Scanner;

public class que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First String");
String str1=sc.next();
System.out.println("Enter the Second String");
String str2=sc.next();

if((str1.compareToIgnoreCase(str2))==0)
{
	System.out.println("Strings are Equal");
}
else
{
	System.out.println("Strings are Not Equal");
}
sc.close();
	}

}
