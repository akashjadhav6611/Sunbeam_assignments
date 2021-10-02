package Que6;

import java.util.Scanner;

public class que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
String str=sc.next();
System.out.println("Enter Start index");
int start=sc.nextInt();
System.out.println("Enter End index");
int end=sc.nextInt();
String substring=str.substring(start, end+1);
System.out.println("SubString: "+substring);
sc.close();
	}

}
