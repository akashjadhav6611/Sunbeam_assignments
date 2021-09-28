//Write a program that would print the information (name, year of joining, salary, address) 
//of three employees by creating a class named 'Employee'. The output should be as follows:
//Name Year of joining  Address
//EMP1 2000  				Pune
//EMP2 2002 				Pune
//EMP3 2008 				Mumbai

package question_2;

import java.util.Scanner;

class Employee{
	Scanner sc=new Scanner(System.in);
	private String name;
	private int year_join;
	private int salary;
	private String address;
	public void accept() {
		System.out.println("Enter The Name: ");
		name=sc.next();
		System.out.println("Enter The Year of Join: ");
		year_join=sc.nextInt();
		System.out.println("Enter The Salary: ");
		salary=sc.nextInt();
		System.out.println("Enter The Address: ");
		address=sc.next();
		
		System.out.print("\n\n");
	}
	public void disp() {
		System.out.println(name+" \t "+year_join+" \t\t\t "+salary+" \t\t "+address);
	}
	
}

public class Main {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		emp1.accept();
		emp2.accept();
		emp3.accept();
		System.out.print("\n\n");
		System.out.println("Name\tYear Of Joining\t\tsalary\t\tAddress");
		emp1.disp();
		emp2.disp();
		emp3.disp();

	}

}
