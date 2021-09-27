package A2;

import java.util.Scanner;

/*************************************************************
 * Q3. A school has following rules for grading system: 
 *  a. Below 25 - F
 *  b. 25 to 45 - E 
 *  c. 45 to 50 - D 
 *  d. 50 to 60 - C 
 *  e. 60 to 80 - B 
 *  f. Above 80 - A 
 *  Ask user to enter marks and print the corresponding grade.
 ***************************************************************/
public class Q3 
{

	public static void main(String[] args) 
	{
		int mark;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter marks : ");
		mark = sc.nextInt();
		
		if(mark<=25)
			System.out.println("Grade(Below 25) = F");
		else if(25<mark && mark<=45)
			System.out.println("Grade(Between 25 to 45 ) = E");
		else if(45<mark && mark<=50)
			System.out.println("Grade(Between 45 to 50 ) = D");
		else if(50<mark && mark<=60)
			System.out.println("Grade(Between 50 to 60 ) = C");
		else if(60<mark && mark<=80)
			System.out.println("Grade(Between 60 to 80 ) = B");
		else if(mark>80)
			System.out.println("Grade(above 80 ) = A");
	}

}
