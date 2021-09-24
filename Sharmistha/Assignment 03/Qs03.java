package Assignment03;
import java.util.*;
public class Qs03 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaring an array of student
				Employee1[] arr;

				// Allocating memory for many objects
				// of type Employee
				arr = new Employee1[10];

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
				    
				    arr[i] = new Employee1(nameIn, salaryIn, dateIn);
				}

				// Displaying the employee data
				for(int i=0; i<arr.length; i++) {
					System.out.println("For "+i+" Element in array:");
					arr[i].display();
				}
				
				
			}
		}


		class Employee1 {

			
			public String name;
			public String salary;
			public String date;

			// Employee class constructor
			
			Employee1(String name, String salary, String date)
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


