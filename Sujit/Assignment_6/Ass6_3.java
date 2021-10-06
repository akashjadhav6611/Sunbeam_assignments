import java.util.Scanner;

public class Ass6_3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter string input");
		String str = sc.nextLine();
		System.out.println("Enter index");
		int n = sc.nextInt();
		char index = str.charAt(n);
		System.out.println("character at index "+n+" is : "+index);
		sc.close();

	}

}
