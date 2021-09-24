import java.util.Scanner;

class Employee{
	String name;
	int yoj;
	int sallary;
	String address;
	Scanner sc = new Scanner(System.in);
	void in_data() {
		
		System.out.print("Enter Your Name:  ");
		this.name=sc.next();
		System.out.print("Enter Your Year of Joining:  ");
		this.yoj=sc.nextInt();
		System.out.print("Enter Your Sallary:  ");
		this.sallary=sc.nextInt();
		System.out.print("Enter Your Address:  ");
		this.address=sc.next();
		
	}
	void out_data() {
		
		System.out.println("Name      Year      Sallary   Address   ");
		System.out.printf("%-10s%-10d%-10d%-10s\n",this.name,this.yoj,this.sallary,this.address);

	}	
}
public class ques_2 {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		e1.in_data();
		e2.in_data();
		e3.in_data();
		
		e1.out_data();
		e2.out_data();
		e3.out_data();
		
		
	}

}
