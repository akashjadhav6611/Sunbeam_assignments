package Que3;

import java.util.Scanner;

public class que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Marks");
		int marks= sc.nextInt();
		if(marks>80)
			System.out.println("Grade is A");
		else if(marks>=60)
			System.out.println("Grade is B");
		else if(marks>=50)
			System.out.println("Grade is C");
		else if(marks>=45)
			System.out.println("Grade is D");
		else if(marks>=25)
			System.out.println("Grade is E");
		else 
			System.out.println("Fail");
	}

}
