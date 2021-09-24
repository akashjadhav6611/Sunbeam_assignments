import java.util.Scanner;

public class ques_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Lower Boound:");
		int lbound=sc.nextInt();
		System.out.println("Enter Upper Bound:");
		int ubound=sc.nextInt();
		sc.close();
		int even=0,odd=0;
		while(lbound<=ubound) {
			if(lbound%2==0) {
				even=even+lbound;
			}
			else {
				odd=odd+lbound;
			}
			lbound++;
		}
		System.out.println("The Sum Of Even Numbers : "+even);
		System.out.println("the Sum Of Odd Numbers : "+odd);
	}

}
