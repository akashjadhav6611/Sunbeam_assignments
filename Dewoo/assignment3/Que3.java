package assignment3;

import java.util.Scanner;

class Employee12{
	String name;
	int salary;
	int dateOfJoining;
	
	Employee12(String name,int salary,int dateOfJoining){
		this.name=name;
		this.salary=salary;
		this.dateOfJoining=dateOfJoining;
		
	}
	
	void display() {
		System.out.println(name+" "+salary+" "+dateOfJoining);
	}

	@Override
	public String toString() {
		return "Employee12 [name=" + name + ", salary=" + salary + ", dateOfJoining=" + dateOfJoining + "]";
	}
	
	
}

public class Que3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Employee12[] arr= new Employee12[10];
		
		for(int i=0;i<10;i++) {
			
			System.out.println("Enter name , salary , Date of joining: ");
			
	
			String name=sc.next();
			int salary=sc.nextInt();
			int dateOfJoining=sc.nextInt();
			
			Employee12 emp = new Employee12(name, salary, dateOfJoining);
			
			arr[i]=emp;
			
			
		}
		
for(int j=0;j<10;j++) {
			
			System.out.println(arr[j]);
			
		}
			
		
	}

}
