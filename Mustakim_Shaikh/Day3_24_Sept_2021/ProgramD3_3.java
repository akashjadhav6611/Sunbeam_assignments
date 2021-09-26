//Print 10 Employees Data using Array's Object:
/*Note: Enter Data in following Manner for 10 Employees:
Ramesh
20000
22_Sept_2000
Suresh
30000
21_Aug_1998
Kamlesh
4000
20_May_2010
*/



package SunbeamAssignments;
import java.util.*;

// Creating class of Employees:
class Employee{
	
	//Declaring 3 Arrays for each data: 
	String[] name = new String[10];
	int[] salary = new int[10];
	String[] DOJ = new String[10];
	
	Scanner sm = new Scanner(System.in);

	//Taking input form user:
	void accept() {
		
		System.out.println("Enter Employee name , salary , Date_of_joining: ");
		for(int i = 0 ; i <= 9 ; i++) {
			
			name[i] = sm.next();
			salary[i] = sm.nextInt();
			DOJ[i] = sm.next();
		}
	}
//To display Employees Data:	
	void display() {
		
		System.out.println(" ");
		System.out.println("Employee details are: ");
		
		for(int i = 0 ; i <= 9 ; i++) {
			
			System.out.println(name[i] + " " +salary[i] + " "+DOJ[i]);
		
		}
	}
	
}

public class ProgramD3_3{
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.accept();
		e1.display();
	}
}
