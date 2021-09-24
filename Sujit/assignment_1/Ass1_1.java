package ass1_3;
import java.util.Scanner;

public class Ass1_3 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		int sum = 0;
		
		for(int i =0 ; i <1000 ; i++) {
				sum = sum + num%10 ;
				num = num/10;
			}
		System.out.println("Sum of digits is = "+sum);
	}

}
