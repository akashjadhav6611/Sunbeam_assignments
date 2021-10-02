package Que3;

import java.util.Scanner;

public class que3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
String name=sc.next();
System.out.println("Enter the index number");
int index=sc.nextInt();
System.out.println("Character at index: "+index+" is "+name.charAt(index));
sc.close();
}
}