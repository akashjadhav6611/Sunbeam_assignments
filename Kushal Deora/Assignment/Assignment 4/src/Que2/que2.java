package Que2;
class Employee
{
	private int id;
	private String name;
	private static String C_name;
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	static
	{
		C_name="Sunbeam";
	}
	void display()
	{
		System.out.println("ID:"+this.id+" Name:"+this.name+" Company:"+ Employee.C_name);
		
	}
}
public class que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1=new Employee(1,"Kushal");
e1.display();
System.out.println("");
Employee e2=new Employee(2,"Amit");
e1.display();
e2.display();

	}

}
