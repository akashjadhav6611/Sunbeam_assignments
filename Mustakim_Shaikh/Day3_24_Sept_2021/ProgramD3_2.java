package SunbeamAssignments;

//Creating class Employee:
                              //Name Year of joining Address
                              //EMP1 2000 Pune
                              //EMP2 2002 Pune
                              //EMP3 2008 Mumbai

class Employee{
	
	String Name , Address ; 
	int Year;
	
	//Employee Constructor:
	
	Employee(String Name , int Year , String Address){
		
		this.Name = Name;
		this.Year = Year;
		this.Address = Address;
	}
	
	//Method to display data:
	
	void displayInfo() {
		
		System.out.println(Name+"    "+Year+"          " +Address);
	}
	
}


// Main class:
public class ProgramD3_2 {

	public static void main(String[] args) {
	
		System.out.println("Name " + " Year of joining " + " Address");	
		
		Employee e1 = new Employee("EMP1" , 2000 , "Pune");
		Employee e2 = new Employee("EMP2" , 2002 , "Pune");
		Employee e3 = new Employee("EMP3" , 2008 , "Mumbai");

		e1.displayInfo();
		e2.displayInfo();
		e3.displayInfo();
	}

}
