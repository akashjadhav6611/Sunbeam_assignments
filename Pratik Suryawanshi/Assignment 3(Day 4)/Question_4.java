//Create a class 'Student' with three data members which are name, age and address.
//The constructor of the class assigns default values name as "unknown", age as '0' and address as "not available". 
//It has two members with the same name 'setInfo'.
//First method has two parameters for name and age and assigns the same
//whereas the second method takes has three parameters which are assigned to name, age and address respectively. 
//Print the name, age and address of 10 students.

package question_4;

import java.util.Scanner;

class Student{
	private String name;
	private int age;
	private String address;
	Student() {
		this.name="unknown";
		this.age=0;
		this.address="not available";
	}
	public void setInfo(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void setInfo(String name,int age,String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public void Disp() {
		System.out.println("name= " + name + " age=" + age + " address= " + address );
	}	
}


public class Main {

	public static void main(String[] args) {
		String name;
		int age;
		String address;

		Scanner sc=new Scanner(System.in);
		Student s1[]=new Student[10];
		
		for(int i=0;i<10;i++) {
			s1[i]=new Student();
			System.out.println("Enter Name");
			name=sc.next();
			System.out.println("Enter Age");
			age=sc.nextInt();
			System.out.println("Enter Address");
			address=sc.next();
			s1[i].setInfo(name, age, address);
			System.out.print("\n");
		}
		System.out.print("\n\n\n\n");
		for(int i=0;i<10;i++) {
			s1[i].Disp();
		}
	}
}


