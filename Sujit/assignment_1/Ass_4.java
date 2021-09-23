package ass_1;
import java.util.Scanner;
public class Ass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1, s2,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 digit number");
		int num = sc.nextInt();
		
		System.out.println("User Input is  "+num);
		s1=num/10000;
		temp=num%10;
		s2=((num-s1)%100)/10;
		
		System.out.println("First digit is "+s1);
		System.out.println("last second digit is "+s2);
		System.out.println("Addition of First and last second digit is  "+(s1+s2));
	}

}
