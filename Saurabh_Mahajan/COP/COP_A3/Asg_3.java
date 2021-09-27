package sunbeam;

import java.util.Scanner;

class Employee
{
	private String name;
	private int salary;
	private String doj;
	
	Scanner sc = new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter Name : ");
		name = sc.next();
		System.out.println("Enter Salary : ");
		salary = sc.nextInt();
		System.out.println("Enter Date of Joining : ");
		doj = sc.next();
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println("Date of joining : "+doj);
	}
}

public class Asg_3 
{

	public static void main(String[] args) 
	{
		Employee emp[];
		emp = new Employee[3];
		
		System.out.println("Enter Employee Data :- ");
		for(int i = 0 ; i < 3 ; i++)
		{
			emp[i] = new Employee();
			emp[i].accept();
		}
		
		System.out.println("------------------------------------");
		System.out.println("Employee Data :- ");
		for(int i = 0 ; i < 3 ; i++)
			emp[i].display();
		System.out.println("------------------------------------");
	}
}
