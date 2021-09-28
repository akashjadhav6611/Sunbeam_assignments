import java.util.Scanner;

public class ques_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		student st[]=new student[10];
		for(int i=0;i<st.length;i++) {
			st[i]=new student();
			System.out.println("Enter your name: ");
			String name=sc.nextLine();
			System.out.println("Age: ");
			int age=sc.nextInt();
			
			System.out.println("Do you want to enter address (Y/N):");
			char n=sc.next().charAt(0);
			sc.nextLine();
			if(n=='Y' || n=='y') {
				System.out.println("Enter Address: ");
				String address = sc.nextLine();
				st[i].setInfo(name,age,address);
			}
			else if(n=='N' || n=='n') {
				st[i].setInfo(name, age);
			}
			else
				System.out.println("wrong choice!!!");
			
		}
		System.out.println("Student Data:");
		for(int i=0;i<st.length;i++) {
			st[i].display();
		}
		sc.close();
		
	}

}

class student{
	private String name;
	private int age;
	private String address;
	
	public student() {
		this.name = "unknown";
		this.age = 0;
		this.address ="not available";
	}
	
	public void setInfo(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void setInfo(String name,int age,String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	void display() {
		System.out.println("Name: "+name+" Age: "+age+" address: "+address);
	}
}