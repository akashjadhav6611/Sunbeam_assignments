




import java.util.Scanner;




public class Assi1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer between 0 and 1000: ");
		int num = sc.nextInt();
		
		int a,b,c,d ,sum;
		
		a=num%10;
		b=num/10;
		c=b%10;
		d=b/10;
		
		sum=a+c+d;
		
		System.out.println("Sum of all digits in integer= "+sum);
		
		
		

	}

}
