package sunbeam;

import java.util.Scanner;

class Student
{
	String name;
	int age;
	String address;
	
	Student()
	{
		this.name = "unknown";
		this.age = 0;
		this.address = "unavailable";
	}
	
	void setInfo(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	void setInfo(String name, int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Address : "+address);
	}
}

public class Asg_4 
{

	public static void main(String[] args) 
	{
		Student emp[];
		emp = new Student[3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Data :- ");
		for(int i = 0 ; i < 3 ; i++)
		{
			emp[i] = new Student();
			
			System.out.println("Enter Name : ");
			String name = sc.next();
			System.out.println("Enter Age : ");
			int age = sc.nextInt();
			
			System.out.println("If address is avialable - press 1");
			System.out.println("If address is unavialable - press 0");
			int temp = sc.nextInt();
			if(temp == 1)
			{
				System.out.println("Enter Address : ");
				String address = sc.next();
				emp[i].setInfo(name,age,address);
			}
			else
				emp[i].setInfo(name,age);
		}
		
		System.out.println("---------------------");
		System.out.println("Student Data :- ");
		for(int i = 0 ; i < 3 ; i++)
			emp[i].display();
		System.out.println("---------------------");
	}

}
