import java.util.Scanner;

public class Assi4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five digit number: ");
		int num = sc.nextInt();
		int a,b,sum;
		
		a=num/10000;
		num=num/10;
		b=num%10;
		
		sum=a+b;
		
		System.out.println(sum);
		

	}

}
