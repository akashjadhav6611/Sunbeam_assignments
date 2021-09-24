// Write a program to print the name, salary 
// and date of joining of 10 employees in a company. Use array of objects

class Que_3 {

	public static void main(String args[])
	{

		// Declaring an array of student
		Employee[] arr;

		// Allocating memory for 2 objects
		// of type student
		arr = new Employee[6];

		// Initializing the first element
		// of the array
		arr[0] = new Employee("Rachel", 10, "1 Jan");
		arr[1] = new Employee("Ross", 10, "1 Jan");
		arr[2] = new Employee("Monica", 10, "1 Jan");
		arr[3] = new Employee("Chandler", 10, "1 Jan");
		arr[4] = new Employee("Joey", 10, "1 Jan");
		arr[5] = new Employee("Phoebe", 10, "1 Jan");
		

		// Displaying the employee data
		for(int i=0; i<arr.length; i++) {
			System.out.println("For "+i+"th Element in array:");
			arr[i].display();
		}
		
		
	}
}


class Employee {

	
	public String name;
	public int salary;
	public String date;

	// Student class constructor
	Employee(String name, int salary, String date)
	{
		this.salary = salary;
		this.name = name;
		this.date = date;
	}

	// display() method to display
	// the student data
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
