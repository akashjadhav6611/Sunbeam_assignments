package Que1_1;

import java.util.Scanner;

public class que1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
String name=sc.next();
System.out.println("Enter the character to Search");
char ch=sc.next().charAt(0);
if(name.indexOf(ch)>-1)
	System.out.println("Found at "+name.indexOf(ch));
else
	System.out.println("Not Found");
sc.close();
	}
}
