import java.util.Scanner;

class Employee2
{
	private String empid; // DATA MEMBER
	private String salary; // DATA MEMBER 
	private String name;// DATA MEMBER 
	Scanner sc=new Scanner(System.in);
	public void accept() // MEMBER FUNCTION
	{
		System.out.println("Enter Emp ID :");
		empid=sc.nextLine();
		System.out.println("Enter Salary : ");
		salary=sc.nextLine();
		System.out.println("Enter Name : ");
		name=sc.nextLine();
		
	}
	public void disp() // MEMBER FUNCTION
	{
		System.out.println("EmpID = "+empid+" Salary ="+salary+" Name = "+name);
	}
	
}


public class Que_3a {

	public static void main(String[] args)
	{
		Employee2[] arr;
		arr = new Employee2[2];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = new Employee2();
			arr[i].accept();
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i].disp();
		}
	}

}
