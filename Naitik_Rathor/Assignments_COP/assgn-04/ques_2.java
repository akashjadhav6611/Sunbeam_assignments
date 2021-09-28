class Employee{
	String name;
	int id;
	static String nameof_company="Sunbeam";
	public Employee(String n, int i) {
		
		this.name = n;
		this.id = i;
	}
	public void display() {
		System.out.println("Name: "+this.name+" Id: "+id+" Comapany: "+Employee.nameof_company);
	}
	
}
public class ques_2 {

	public static void main(String[] args) {
		Employee e=new Employee("Naitik",12);
		e.display();
		Employee e1=new Employee("Aman",11);
		e1.display();
	}

}
