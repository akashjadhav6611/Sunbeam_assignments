// Write a program to print the name, salary 
// and date of joining of 10 employees in a company. Use array of objects
import java.util.Scanner;

class Que_3 {

	public static void main(String args[])
	{

		// Declaring an array of student
		Employee[] arr;

		// Allocating memory for many objects
		// of type Employee
		arr = new Employee[10];

		// Initializing the elements
		// of the array without for and without user input
		/*
		arr[0] = new Employee("Rachel", 10, "1 Jan");
		arr[1] = new Employee("Ross", 10, "1 Jan");
		arr[2] = new Employee("Monica", 10, "1 Jan");
		arr[3] = new Employee("Chandler", 10, "1 Jan");
		arr[4] = new Employee("Joey", 10, "1 Jan");
		arr[5] = new Employee("Phoebe", 10, "1 Jan");
		*/
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter Name: ");
		    String nameIn = scan.nextLine();
		    System.out.print("Enter Salary: ");
		    String salaryIn = scan.nextLine();
		    System.out.print("Enter DoJ: ");
		    String dateIn = scan.nextLine();
		    
		    arr[i] = new Employee(nameIn, salaryIn, dateIn);
		}

		// Displaying the employee data
		for(int i=0; i<arr.length; i++) {
			System.out.println("For "+i+" Element in array:");
			arr[i].display();
		}
		
		
	}
}


class Employee {

	
	public String name;
	public String salary;
	public String date;

	// Employee class constructor
	
	Employee(String name, String salary, String date)
	{
		this.salary = salary;
		this.name = name;
		this.date = date;
	}
	
	//public void accept() {
		
	//}

	// display() method to display
	// the Employee data
	public void display()
	{
		System.out.println("Employee name: " + name + " "
						+ "Salary: "
						+ salary +" LPA "
						+ " DoJ:"
						+ date);
		System.out.println();
	}
}
