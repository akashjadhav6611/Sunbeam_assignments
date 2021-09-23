import java.util.Scanner;

public class Qs04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner S=new Scanner(System.in);
System.out.println("Enter 5 digit Number : ");

int num=S.nextInt();
System.out.println("User input number is: " + num);

int count = 0;
int digit = 0;

for (int i = 0; i<5; i++) {
	 digit = num%10;
	 num = num/10;
	 if(i==1||i==4) {
		 count= count+digit;
	 }

}
	    System.out.println("First and Fifth Digit sum is: " + count);
	}

}
