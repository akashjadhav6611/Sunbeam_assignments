import java.util.Scanner;

public class ques_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The LowerBound Number:");
		int lbound=sc.nextInt();
		System.out.println("Enter The UpperBound Number:");
		int ubound=sc.nextInt();
		sc.close();
		int temp=0;
		while(temp<=ubound) {
			temp= temp + lbound;
			lbound++;
		}
			System.out.println("The Addition of Numbers Between Lower and Upper Bound: "+temp);
	}

}
