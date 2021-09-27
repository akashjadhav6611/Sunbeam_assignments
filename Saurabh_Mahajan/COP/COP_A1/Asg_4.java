import java.util.Scanner;

public class Asg_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a five digit number : ");
		int number = sc.nextInt();
		
		int n5 = number %10;
		number = number/10;
		int n4 = number %10;
		number = number/10;
		int n3 = number %10;
		number = number/10;
		int n2 = number %10;
		number = number/10;
		int n1 = number %10;

		System.out.println("Sum of first and fourth digit is : "+(n1+n4));
	}

}
