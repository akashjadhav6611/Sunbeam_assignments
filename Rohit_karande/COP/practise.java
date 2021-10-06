//Write a menu driven program for addition, subtraction, multiplication and division of two
//numbers. Accept input from User. You need write separate function for each operation also
//test all functionality in Testclass.

package practise;

import java.util.Scanner;

class test {

	static double add(double n1, double n2) {

		return n1 + n2;
	}

	static double sub(double n1, double n2) {

		return n1 - n2;
	}

	static double mult(double n1, double n2) {

		return n1 * n2;
	}

	static double div(double n1, double n2) {

		return n1 / n2;
	}

}

class practise {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		double n1, n2;

		n1 = sc.nextInt();
		n2 = sc.nextInt();

		System.out.println("Enter choice");
		System.out.println("Enter 1 for add, 2 for sub, 3 for mult, 4 for div, 0 for Exit");
		int ch;

		do {
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("add=" + test.add(n1, n2));
				break;

			case 2:
				System.out.println("substraction=" + test.sub(n1, n2));
				break;

			case 3:
				System.out.println("multiplication=" + test.mult(n1, n2));
				break;

			case 4:
				if (n2 == 0) {
					System.out.println("n2 should not be 0");

				} else {
					System.out.println("div=" + test.div(n1, n2));

				}
				break;

			case 0:
				System.out.println("exit");
				break;
			 default:
				System.out.println("Enter valid choice");
				break;
				
			}

		} while (ch != 0);

	}
}

