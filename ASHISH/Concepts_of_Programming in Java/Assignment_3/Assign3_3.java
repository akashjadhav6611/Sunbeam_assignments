package sunbeam;

import java.util.Scanner;

class Employees
{
	private String name;
	private int salary;
	private int doj;
	Scanner sc = new Scanner(System.in);
	
	void accept()
	{
		name = sc.next();
		salary = sc.nextInt();
		doj = sc.nextInt();
	}
	
	void disp()
	{
		System.out.println("Name:"+name+"\tSalary:"+salary+"\tDoJ:"+doj);
	}
}

public class Assign3_3 {
	
	public static void main(String args[])
	{
		Employees arr[] = new Employees[10];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = new Employees();
			arr[i].accept();
		}
		
		System.out.println("\nEmployees and their details:");
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i].disp();
		}
	}
}
