/*
 * Write a program that would print the information 
 * (name, year of joining, salary, address) of three 
 * employees by creating a class named 'Employee'. 
 * The output should be as follows:
	Name Year of joining Address
	EMP1 2000 Pune
	EMP2 2002 Pune
	EMP3 2008 Mumbai
 * */
   
import java.util.Scanner;

class Employee3{
	String name;
	int yoj;
	int salary;
	String address;
	Scanner sc = new Scanner(System.in);
	void in_data() {
		
		System.out.print("Enter Your Name:  ");
		this.name=sc.next();
		System.out.print("Enter Your Year of Joining:  ");
		this.yoj=sc.nextInt();
		System.out.print("Enter Your Sallary:  ");
		this.salary=sc.nextInt();
		System.out.print("Enter Your Address:  ");
		this.address=sc.next();
		
	}
	void out_data() {
		
		System.out.println("Name      Year      Salary   Address   ");
		System.out.printf("%-10s%-10d%-10d%-10s\n",this.name,this.yoj,this.salary,this.address);

	}	
}
public class Que_2 {

	public static void main(String[] args) {
		
		Employee3 e1 = new Employee3();
		Employee3 e2 = new Employee3();
		Employee3 e3 = new Employee3();
		
		e1.in_data();
		e2.in_data();
		e3.in_data();
		
		e1.out_data();
		e2.out_data();
		e3.out_data();
		
		
	}

}
