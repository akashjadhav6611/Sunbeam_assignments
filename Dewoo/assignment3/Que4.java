package assignment3;

import java.util.Scanner;

class Student{
	String name;
	int age;
	String address;
	
	
	Student(String name,int age,String address){
		this.name=name;
		this.age=age;
		this.address=address;
		
	}
	
	void setInfo(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	void setInfo(String name,int age,String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
	
}

public class Que4 {

	public static void main(String[] args) {
		
		Student arr[]= new Student[10];
		
		Student s = new Student("Unknown", 0, " Not available ");
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			
			System.out.println("Enter name , age and address: ");
			
			String name=sc.next();
			int age = sc.nextInt();
			String address=sc.next();
			
			s.setInfo(name, age, address);
			arr[i]=s;
			
			
			
		}
		
for(int i=0;i<10;i++) {
			
			System.out.println(arr[i]);
			
			
			
		}

	
	
	}

}
