import java.util.Scanner;

public class ques_4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int average;
		int	count=0,add=0;
		int product=1;
		char choice,n=1;
		do{
			
			System.out.print("Enter A Number: ");
			
			int num=sc.nextInt();
			if(num>=1) {
				count++;
				add+=num;
				
				product*=num;
			
				System.out.println("To finish enter <0>");
				choice=sc.next().charAt(0);
				if(choice=='q') {
					average=add/count;
					System.out.println("Your Average is : "+average);
					System.out.println("Your Product is : "+product);
					n=0;
				}
			}
			else
				System.out.println("Number Must Be Greater Than 0");
			
			
		}while(n!=0);
		sc.close();
	}

}
