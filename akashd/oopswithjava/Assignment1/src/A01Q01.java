import java.util.Scanner;

class Q01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextDouble()) {
			double d1 = sc.nextDouble();
			if(sc.hasNextDouble()) {
				double d2 = sc.nextDouble();
				System.out.println("The average of the two values is " + (d1+d2) / 2);
			}
			else {
				System.out.println("2nd number is not a float!");
			}
		}
		else {
			System.out.println("1st number is not a float!");
		}
	}

}