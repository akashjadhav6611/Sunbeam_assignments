import java.util.Scanner;

public class ques_3 {

	public static void main(String[] args) {
		System.out.print("Enter Your Marks to get Grades:  ");
		Scanner sc = new Scanner(System.in);
		short marks= sc.nextShort();
		sc.close();
		if(marks>=80 && marks<=100)
			System.out.println("Your Grade is A");
		if(marks>=60 && marks<80)
			System.out.println("Your Grade Is B");
		if(marks>=50 && marks<60)
			System.out.println("Your Grade Is C");
		if(marks>=45 && marks<50)
			System.out.println("Your Grade Is D");
		if(marks>=25 && marks <45)
			System.out.println("Your Grade Is E");
		else
			System.out.print("Your Grade Is F");
	}

}
