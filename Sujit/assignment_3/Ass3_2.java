package Assign32;
import java.util.*;

class Employee {
	private String name , address;
	private int salary,yjoin;
	Scanner sc = new Scanner(System.in);
	void get_data() {
		
		System.out.print("Enter Employee Name :  ");
		this.name = sc.next();
		System.out.print("Enter Year Of Joining :  ");
		this.yjoin = sc.nextInt();
		System.out.print("Enter Employee Salary :  ");
		this.salary = sc.nextInt();
		System.out.print("Enter Employee Address :  ");
		this.address = sc.next();
		
	}
	void print_data() {
	
		
		System.out.printf("%-10s%-10d%-10s/n",this.name,this.yjoin,this.address);
		
	}
}


public class Ass3_2 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.get_data();
		e2.get_data();
		e3.get_data();
		System.out.println("Name      Year      Address");
		e1.print_data();
		e2.print_data();
		e3.print_data();

	
	}

}
