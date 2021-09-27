package Que2;
class Employee
{
	private int id;
	private static String name="Sunbeam";
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println("ID:"+this.id+" Name:"+this.name);
		
	}
}
public class que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1=new Employee(1,"Kushal");
e1.display();
System.out.println("");
Employee e2=new Employee(2,"Deora");
e1.display();
e2.display();
System.out.println("");
Employee e3=new Employee(3,"Sunbeam");
e1.display();
e2.display();
e3.display();
	}

}
