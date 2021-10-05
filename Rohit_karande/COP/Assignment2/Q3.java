//A school has following rules for grading system:
//a. Below 25 - F
//b. 25 to 45 - E
//c. 45 to 50 - D
//d. 50 to 60 - C
//e. 60 to 80 - B
//f. Above 80 - A
//Ask user to enter marks and print the corresponding grade.

import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
	 
	do {	
		System.out.println("Enter choice: 1 for below25, 2 for 25 to 45, 3 for 45 to 50, 4 for 50 to 60,5 for 60 to 80 ,6 for above 80,0 for exit ");
      ch=sc.nextInt();
		switch (ch) {
		
		case 1:
			System.out.println("you have earn grade 'F' ");
			break;
		case 2:
			System.out.println("you have earn grade 'E' ");
			break;
		case 3:
			System.out.println("you have earn grade 'D' ");
			break;
		case 4:
			System.out.println("you have earn grade 'c' ");
			break;
		case 5:
			System.out.println("you have earn grade 'B' ");
			break;
		case 6:
			System.out.println("you have earn grade 'A' ");
			break;
			default :
				System.out.println("Enter valid choice ");

		}
		}while(ch!=0);
		
	sc.close();
		
		

	}

}
