package sunbeam;

import java.util.Scanner;

class Student
{
	private String name;
	private int age;
	private String address;
	
	Student()
	{
		name = "unknown";
		age = 0;
		address = "not available";
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
	
	void getInfo()
	{
		System.out.println("Name:"+name+"\tAge:"+age+"\tAddress:"+address); 
	}
}
public class Assign3_4 {

	public static void main(String[] args)
	{
		Student s[] = new Student[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++)
		{
			s[i] = new Student();
			
			System.out.print("Enter Name:");
			String name = sc.next();
			
			System.out.print("Enter Age:");
			int age = sc.nextInt();
			
			System.out.print("Enter Address:");
			String address = sc.next();
			
			s[i].setInfo(name, age, address);
		}
		
		for(int i=0; i<10; i++)
		{
			s[i].getInfo();
		}
		
		sc.close();
	}
	
}
