package sunbeam;

class Employee
{
	private int id;
	private String name;
	private static String noc = "Sunbeam";
	
	public Employee(int i, String n) 
	{
		this.id = i;
		this.name = n;
	}
	public void display()
	{
		System.out.println("Employe ID : "+this.id+"Name : "+this.name+"\nName of Company : "+noc);
	}
}

public class Asg_2 {

	public static void main(String[] args) {
		Employee e = new Employee(1,"Saurabh");
		e.display();
		
		Employee a = new Employee(2,"Kaustubh");
		a.display();
	}
}
