import java.util.Scanner;

class Employee{
	private String name;
	private int id;
	private static String name_of_company;
	public Employee(String n, int i) {
		super();
		this.name = n;
		this.id = i;
	}
	static {
		name_of_company = "Sumbeam";
	}
	void disp() {
		
		System.out.printf("%-10s%-10d%-10s\n",this.name,this.id,name_of_company);
	}
	
}
public class Ass4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name for employee");
		String n = sc.next();
		System.out.println("enter id for employee");
		int i = sc.nextInt();
		Employee e1 = new Employee(n,i);
		
		System.out.println("enter name for employee");
		 n = sc.next();
		System.out.println("enter id for employee");
		 i = sc.nextInt();
		Employee e2 = new Employee(n,i);
		System.out.println("Employee details");
		System.out.println("Name      ID      Company name");
		e1.disp();
		e2.disp();
		sc.close();
		
	}

}
