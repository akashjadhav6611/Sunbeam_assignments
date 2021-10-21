import java.util.Scanner;

public class Ass6_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str1 = sc.nextLine();
		System.out.println("Enter sequence");
		String str2 = sc.nextLine();
		
		System.out.println("original string : "+str1+"\nspecified sequence of char value : "+str2);
		System.out.println(str1.contains(str2));
		sc.close();

	}

}
