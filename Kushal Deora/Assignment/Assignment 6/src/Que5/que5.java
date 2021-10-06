package Que5;

import java.util.Scanner;

public class que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
String str=sc.next();
System.out.println("Enter the Special Sequence to find");
String seq=sc.next();
if(str.contains(seq))
System.out.println("Found");	
else
	System.out.println("Not Found");
sc.close();

	}

}
