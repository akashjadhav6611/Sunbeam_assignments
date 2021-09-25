//Write a program to perform arithmetic operations, by accepting numbers from user and the choice from user. 
//Write a menu driven program to perform operations.

package question_5;

import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		int n1,n2,ch;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter The choice: ");
			System.out.printf("1.Addition \n2.Subtraction \n3.Mutiplication \n4.Division \n5.Modulus \n");
			ch=sc.nextInt();
			System.out.println("Enter First Number: ");
			n1=sc.nextInt();
			System.out.println("Enter Second Number: ");
			n2=sc.nextInt();
			switch(ch) {
		
				case 1:
					System.out.println("Addition: "+(n1+n2));
					break;
					
				case 2:
					System.out.println("Subtraction: "+(n1-n2));
					break;
			
				case 3:
					System.out.println("Multiplication: "+(n1*n2));
					break;

				case 4:
					System.out.println("Division: "+(n1/n2));
					break;

				case 5:
					System.out.println("Modulus: "+(n1%n2));
					break;
			
			}	
			System.out.println("\nPress 0 To Exit...");
		}while(ch!=0);


	}

	}
