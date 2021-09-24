
package Que2;

import java.util.Scanner;

public class que2 {

	public static void main(String args[])
	{

		Employee e[] =new Employee[3];//array
		
		for(int i=0;i<3;i++)
		{
			e[i]=new Employee();//object is created
			e[i].get_Data();
		}
		
		System.out.println("Name  Year   Address");
		for(int i=0;i<3;i++)
		{
			e[i].put_Data();
		}
		
		
	
}
}

class Employee {
private String name;
private int year;
private int salary;
private String address;
Scanner sc = new Scanner(System.in);
public void get_Data()
{
	System.out.println("Name");
	name=sc.next();
	System.out.print("Year of Joining");
	year=sc.nextInt();
	System.out.println("Salary");
	salary=sc.nextInt();
	System.out.println("Address");
	address=sc.next();
}
public void put_Data()
{
	System.out.println(name+" "+year+" "+address);
}
}
