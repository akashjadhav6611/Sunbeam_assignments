//
//A school has following rules for grading system:
//	a. Below 25 - F 
//	b. 25 to 45 - E 
//	c. 45 to 50 - D 
//	d. 50 to 60 - C 
//	e. 60 to 80 - B 
//	f. Above 80 - A 
//Ask user to enter marks and print the corresponding grade.

package question_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Marks;
		System.out.print("Enter Marks: ");
		Marks=sc.nextInt();
		
		
		if(Marks>80 && Marks<=100) {
			System.out.print("Grade: A");
			
		}
		else if(Marks>60 && Marks<=80) {
			System.out.print("Grade: B");
			
		}
		else if(Marks>50 && Marks<=60) {
			System.out.print("Grade: C");
			
		}
		else if(Marks>45 && Marks<=50) {
			System.out.print("Grade: D");
			
		}
		else if(Marks>25 && Marks<=45) {
			System.out.print("Grade: E");
			
		}
		else if(Marks<=25 && Marks>0) {
			System.out.print("Grade: F");
			
		}
		else {
			System.out.print("Enter Valid Marks...");
			
		}

	}

}
