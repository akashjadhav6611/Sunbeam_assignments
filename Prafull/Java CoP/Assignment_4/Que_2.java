/*
 * Create a class Employee having name and id as fields. 
 * Declare static variable with data type string as name 
 * of company assign name as “Sunbeam” for all objects. 
 * Declare a two-parameter constructor with parameters 
 * named n and i. Declare an instance method display and 
 * print the output on the console. Create the first 
 * object of the class and pass the two arguments with 
 * type string and int. all the display method using 
 * reference variable e. Similarly create one more object 
 * with different name and id and call display method.
 * */

class Employee {
	private String name;
	private int id;
	private static String nameOfCompany;
	
	Employee(String n, int i) {
		name = n;
		id = i;
	}
	static {
		nameOfCompany = "Sunbeam";
	}
	public void display() {
		System.out.println(name + " has id " + id + " is in " + nameOfCompany);
	}
}

public class Que_2 {

	public static void main(String[] args) {
		Employee e = new Employee("Rohan", 10);
		e.display();
		
		Employee e1 = new Employee("Rakesh", 20);
		e1.display();
	}

}

