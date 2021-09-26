package Arrobj;

import java.util.Scanner;

class Employee{
	private String name ;
	private int salary,djoin ;
	
	 Employee(String name,int salary,int yjoin){
		this.name = name;
		this.salary = salary;
		this.djoin = yjoin;
	}
	void disp() {
		System.out.printf("%-10s%-10d%-10d\n",this.name,this.salary,this.djoin);
	}
}
public class Ass3_3 {

	public static void main(String[] args) {
		Employee[] arr;
		 arr = new Employee[10];
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0; i<10;i++){
			System.out.print("Enter Your Name: ");
			String name = sc.next();
			System.out.print("Enter Your Salary: ");
			int salary = sc.nextInt();
			System.out.print("Enter Your Date Of Joining: ");
			int yjoin = sc.nextInt();
			arr[i] = new Employee(name,salary,yjoin);
			
		}
		System.out.println("   Name      Salary      Year");
		for(int i =0;i<10;i++) {
			System.out.printf("%d   ",(i+1));
			arr[i].disp();
		}
	}

}
