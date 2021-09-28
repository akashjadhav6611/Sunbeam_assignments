package assignment3;

class Employee{
	String name;
	int yearOfJoining;
	int salary;
	String address;
	
	
	Employee(String name, int yearOfJoining, String address){
		this.name=name;
		this.yearOfJoining=yearOfJoining;
		this.address=address;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", yearOfJoining=" + yearOfJoining + ", address=" + address + "]";
	}
	
	void display() {
		System.out.println(name+ "  "+ yearOfJoining+ "   "+ address);
	}
	
	
}


public class Que2 {

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee(" EMP1 ", 2000	, "      Pune ");
		Employee e2 = new Employee(" EMP2 ", 2000	, "      Pune ");
		Employee e3 = new Employee(" EMP3 ", 2000	, "      Mumbai ");
		
//		System.out.println(e1);
//		System.out.println(e2);
//		System.out.println(e3);
		
		System.out.println("Name "+ "Year of Joining "+"Address ");
		
		e1.display();
		e2.display();
		e3.display();
		

	}

}
