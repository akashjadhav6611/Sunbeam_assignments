import java.util.Scanner;

public class Assi6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		
		int value=Math.abs(number);
		System.out.println("The absolute value of number: "+value);

	}

}