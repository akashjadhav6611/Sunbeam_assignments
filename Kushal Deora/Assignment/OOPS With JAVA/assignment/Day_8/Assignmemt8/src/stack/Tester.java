package stack;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack ref = null;
		boolean flag = false;
		int choice;
		do {

			System.out.println("1. Choose Fixed Stack 2. Choose Growable Stack 3. Push data  4. Pop data 0.  Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (ref == null) {
					ref = new FixedStack();
					System.out.println("Stack Selected");
				} else
					System.out.println("Cannot change the stack choice !!!");
				break;

			case 2:
				if (ref == null) {
					ref = new GrowableStack();
					System.out.println("Stack Selected");
				} else
					System.out.println("Cannot change the stack choice !!!");
				break;

			case 3:
				if (ref != null) {
					System.out.println("Enter employee details : Name Salary");
					ref.push(new Employee(sc.next(), sc.nextDouble()));
				} else
					System.out.println("NO stack choosen !!!");
				break;

			case 4:
				if (ref != null) {
				Employee e1=ref.pop();
				if(e1==null)
					System.out.println("Stack is empty");
				else
				System.out.println(e1);
				} else
					System.out.println("NO stack choosen !!!");
				break;
			}

		} while (choice != 0);
	}

}
