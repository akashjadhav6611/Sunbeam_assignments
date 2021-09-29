package sunbeam;

import java.util.Scanner;

class Employee
{
	private String name;
	private int yoj;
	private int salary;
	private String address;
	Scanner sc = new Scanner(System.in);
	
	void accept()
	{
		name = sc.next();
		yoj = sc.nextInt();
		address = sc.next();
		salary = sc.nextInt();
	}
	
	void disp()
	{
		System.out.println(name+"\t    "+yoj+"  \t    "+address);
	}
}

public class Assign3_2 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.accept();
		e2.accept();
		e3.accept();
		
		System.out.println("Name\tYear of joining\t  Address");
		e1.disp();
		e2.disp();
		e3.disp();
	}

}
