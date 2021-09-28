package Question_2;

class Employee{
	private int id;
	private String name;
	private static String company_name;
	
	static {
		Employee.company_name="Sunbeam";
	}
	
	public Employee(int i, String n ){
		this.id = i;
		this.name = n;
	}
	public void Display() {
		System.out.println("ID: "+id+" Name: "+name+" Company Name:"+company_name);	
	}
	
}


public class question_2 {

	public static void main(String[] args) {
		Employee e=new Employee(1,"Pratik");
		e.Display();
		
		Employee e1=new Employee(2,"User");
		e1.Display();
		
	}

}
