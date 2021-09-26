import java.util.Scanner;

class Student{
	private String name , address;
	private int age;
	
	public Student() {
		
		this.name = "UNKNOWN";
		this.address = "Not Available";
		this.age = 0;
	}
	void set_info(String name, int age) {
		this.name=name;
		this.age=age;
	}
	void set_info(String name, int age , String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	void disp() {
		System.out.println("Name : "+name+"\tAge : "+age+"\tAddress : "+address);
	}
	
}
public class Ass3_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students");
		int n = sc.nextInt();
		Student[] arr;
		arr = new Student[n];
		
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= new Student();
			
			
			System.out.println("Enter name:");
			String name = sc.next();
			System.out.println("Enter age:");
			int age = sc.nextInt();
			
			System.out.println("enter choice  0:Address available  1:Address not available");
			int choice= sc.nextInt();
			switch(choice){
			case 0: System.out.println("Enter Address:");
					String address = sc.next();
					arr[i].set_info(name,age,address);
					break;
			case 1: arr[i].set_info(name, age);
					break;
			default:System.out.println("Invalid Input");
			
			}
		}
		for(int i=0;i<arr.length;i++) {
		
			arr[i].disp();
		}
		sc.close();
	}

}
