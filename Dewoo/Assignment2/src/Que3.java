/*

3. A school has following rules for grading system: 
a. Below 25 - F 
b. 25 to 45 - E 
c. 45 to 50 - D 
d. 50 to 60 - C 
e. 60 to 80 - B 
f. Above 80 - A

*/


import java.util.Scanner;

public class Que3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks: ");
		int marks = sc.nextInt();
		
		if(marks<25)
			System.out.println("Your grade is F.");
		else if(marks>=25 && marks<45)
			System.out.println("Your grade is E.");
		else if(marks>=45 && marks<50)
			System.out.println("Your grade is D.");
		else if(marks>=50 && marks<60)
			System.out.println("Your grade is C.");
		else if(marks>=60 && marks<80)
			System.out.println("Your grade is B.");
		else if(marks>=80 && marks<=100)
			System.out.println("Your grade is A.");
		else
			System.out.println("Invalid Entry.");
		
		

	}

}
