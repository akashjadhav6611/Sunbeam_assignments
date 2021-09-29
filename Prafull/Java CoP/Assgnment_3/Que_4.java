/*
 * Create a class 'Student' with three data members which are name, 
 * age and address. The constructor of the class assigns default 
 * values name as "unknown", age as '0' and address as "not available". 
 * It has two members with the same name 'setInfo'. First method has 
 * two parameters for name and age and assigns the same whereas 
 * the second method takes has three parameters which are assigned to name, 
 * age and address respectively. 
 * Print the name, age and address of 10 students.
 * */


import java.util.Scanner;

class Student{
	
	private String name; // DATA MEMBER
	private String age; // DATA MEMBER 
	private String address;// DATA MEMBER 
	
	
	Student()
	{
		this.age = "0";
		this.name = "Unknown";
		this.address = "Not available";
	}
	
	public void setInfo(String name, String age) // MEMBER FUNCTION
	{
		
		this.name = name;
		this.age = age;
	}
	
	public void setInfo(String name, String age, String address) // MEMBER FUNCTION
	{
		
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void disp() // MEMBER FUNCTION
	{
		System.out.println("Name: " + name + " Age:" + age + " Address:" + address);
	}
	
}


public class Que_4 {

	public static void main(String[] args)
	{
		Student[] arr;
		arr = new Student[4];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = new Student();
			
			System.out.println("Enter Student type 0:No address; 1:Address : ");
			int x = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Name : ");
			String name = sc.nextLine();
			
			System.out.println("Enter Age : ");
			String age = sc.nextLine();
			
			if(x == 0) {	
				arr[i].setInfo(name, age);
			}
			
			else if(x == 1){
						
			System.out.println("Enter Address : ");
			String address = sc.nextLine();
			
			arr[i].setInfo(name, age, address);

			}
			else {
				System.out.println("Select Vaild Address Mode.");
			}
			
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i].disp();
		}
	}

}

