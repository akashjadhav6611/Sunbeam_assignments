//Write a program to print the name, salary and date of joining of 10 employees in a company.
//Use array of objects.

package question_3;

import java.util.Scanner;


class Employee{
	private String name; 
	private int salary;
	private int date;
	public Employee(String name, int salary, int date) {
		this.name = name;
		this.salary = salary;
		this.date = date;
	}
	@Override
	public String toString() {
		return  " name=" + name + ", salary=" + salary + ", date=" + date ;
	}
}

public class Main {

	public static void main(String[] args) {
		String name;
		int salary;
		int Date;
		
		Scanner sc=new Scanner(System.in);
		Employee[] emp=new Employee[10];
		for(int i=0;i<emp.length;i++) {
			System.out.println("Enter Name: ");
			name=sc.next();
			System.out.println("Enter Salary: ");
			salary=sc.nextInt();
			System.out.println("Enter Date: ");
			Date=sc.nextInt();
			emp[i]=new Employee(name,salary,Date);
			
			
		
			System.out.print("\n");
		}
		System.out.print("\n\n\n\n");
		for(int i=0;i<emp.length;i++) {
			System.out.println("Employee "+(i+1)+" :"+emp[i]);
		}
	}

}
