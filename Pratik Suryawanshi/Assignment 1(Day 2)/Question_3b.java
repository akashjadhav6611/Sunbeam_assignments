
//Write a program which prints "ONE", "TWO",... , "NINE", "OTHER" if the int variable
//"number" is 1, 2,... , 9, or other, respectively.
//Use a "switch-case-default" statement.

package Switch_case;
import java.util.*;

public class index {

	public static void main(String[] args) {
		int num;
		char ch;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter the Number: ");
			num=sc.nextInt();
			
			switch(num) {
				case 1:
					System.out.println("ONE");
					break;
				case 2:
					System.out.println("TWO");
					break;
				case 3:
					System.out.println("THREE");
					break;
				case 4:
					System.out.println("FOUR");
					break;
				case 5:
					System.out.println("FIVE");
					break;
				case 6:
					System.out.println("SIX");
					break;
				case 7:
					System.out.println("SEVEN");
					break;
				case 8:
					System.out.println("EIGHT");
					break;
				case 9:
					System.out.println("NINE");
					break;
				default:
					System.out.println("OTHER");
					break;
			}
			
			
			System.out.println("ENTER Y to continue N to Exit");
			ch=sc.next().charAt(0);
		}while(ch!='N');
		
		

	}

}
