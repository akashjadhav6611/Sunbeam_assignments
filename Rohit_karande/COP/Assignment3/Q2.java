
// Write a program that would print the information (name, year of 
//joining, salary, address) of three employees by creating a class named 
//'Employee'. The output should be as follows:
//Name Year of joining Address
//EMP1 2000 Pune
//EMP2 2002 Pune
//EMP3 2008 Mumbai

import java.util.Scanner;

class employee{
	
	private String name;
	private int joining ;
	private int salary ;
	private String location;
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.println("Enter Employee name");
		name=sc.next();
		
		System.out.println("Enter Employee joining year");
		joining=sc.nextInt();
		
		System.out.println("Enter Employee salary");
		salary=sc.nextInt();
		
		System.out.println("Enter Employee adress");
		location=sc.next();
	
	}
	
	public void print() {
		
		System.out.println(" Employee name= "+name);
		System.out.println(" Employee joining year= "+joining);
		System.out.println(" Employee salary= "+salary);
		System.out.println(" Employee adress= "+location);
	
	}

	public String getName() {
		return name;
	}

	public int getJoining() {
		return joining;
	}

	public int getSalary() {
		return salary;
	}

	public String getLocation() {
		return location;
	}

	public Scanner getSc() {
		return sc;
	}

	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setJoining(int joining) {
		this.joining = joining;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "employee [name=" + name + ", joining=" + joining + ", location=" + location + "]";
	}
	
}

public class Q2 {

	public static void main(String[] args) {
		employee e1= new employee();
		employee e2= new employee();
		employee e3= new employee();

		
     	e1.accept();
     	e2.accept();
    	e3.accept();
     	e1.setSalary(90000);


     	
		//e1.print();
		System.out.println(" employee details= "+e1);
		System.out.println(" employee details= "+e2);
		System.out.println(" employee details= "+e3);

		



	}

}
