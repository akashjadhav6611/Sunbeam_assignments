package Que4;

import java.util.Scanner;

public class que4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String name;
		int age;
		String address; 
		Student s[]=new Student[10];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++) {
			s[i]= new Student();

			System.out.println("Name:");
			name=sc.next();
			System.out.println("Age");
			age=sc.nextInt();
			System.out.println("Address");
			address=sc.next();
		
			s[i].setInfo(name,age,address);
		
	}

		
		for(int i=0;i<10;i++) {
			s[i].getInfo();
		}
}
}

class Student
{
	private String name;
	private int age;
	private String address; 
	Student()
	{
		name="Unknown";
		age=0;
		address="not available";
	}
	void setInfo(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void setInfo(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	void getInfo() {
		System.out.println("Name: "+name+" Age: "+age+" Address: "+address);
	}
}
