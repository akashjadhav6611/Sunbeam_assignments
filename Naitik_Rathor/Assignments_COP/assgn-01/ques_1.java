import java.util.Scanner;
public class ques_1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number between 0 & 1000 0nly: ");
		int num = sc.nextInt();
		int sum=0;
		if(num>0 && num<1000) {
			sum=num%10;
			num/=10;
			sum+=num%10;
			num/=10;
			sum+=num;
			System.out.println("Sum of digits of "+sum);
		}
		else 
			System.out.println("wrong Choice!!");
		sc.close();
		
	}

}
