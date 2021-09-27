package sunbeam;

class Employee
{
	String name;
	int year;
	String address;
	
	Employee(String name, int year, String address)
	{
		this.name = name;
		this.year = year;
		this.address = address;
	}
	
	void display()
	{
		System.out.println(name+"        "+year+"         "+address+"\n");
	}
}

public class Asg_2 
{

	public static void main(String[] args) 
	{
		Employee E1 = new Employee("EMP1",2000,"Pune");
		Employee E2 = new Employee("EMP2",2002,"Pune");
		Employee E3 = new Employee("EMP3",2008,"Mumbai");
		
		System.out.println("Name"+"   "+"Year of joining"+"   "+"Address\n");

		E1.display();
		E2.display();
		E3.display();
	}

}
