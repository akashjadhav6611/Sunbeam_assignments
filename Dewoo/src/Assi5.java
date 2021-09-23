import java.util.Scanner;

public class Assi5 {

	public static void main(String[] args) {
		
		// Menu driven program to perform Arithmetic Operation.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the value of num2: ");
		int num2 = sc.nextInt();
		
		int choice;
		
		do {
			System.out.println("Choice: 0:EXIT, 1:ADD, 2:SUB, 3:MUL 4:DIV 5:MOD.");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Addition: "+(num1+num2));
				break;
			case 2:
				System.out.println("Substraction: "+(num1-num2));
				break;
			case 3:
				System.out.println("Multiplication: "+(num1*num2));
				break;
			case 4:
				System.out.println("Division: "+(num1/num2));
				break;
			case 5:
				System.out.println("MOD: "+(num1%num2));
				break;
			default:
				System.out.println("Invalid Entry");
				break;
			
			}
		}while(choice!=0);

	}

}
