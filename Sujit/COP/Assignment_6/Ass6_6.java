import java.util.Scanner;

public class Ass6_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str1= sc.nextLine();
		System.out.println("Enter starting position :");
		int n =sc.nextInt();
		System.out.println("Enter ending position");
		int e = sc.nextInt();
		String str2 = str1.substring(n,e);
		
		System.out.println("String : "+str1);
		System.out.println("Sub-string : "+str2);
		sc.close();

	}

}
