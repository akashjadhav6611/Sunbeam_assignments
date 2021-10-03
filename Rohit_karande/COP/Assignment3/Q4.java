
//Create a class 'Student' with three data members which are name, age 
//and address. The constructor of the class assigns default values name 
//as "unknown", age as '0' and address as "not available". It has two 
//members with the same name 'setInfo'. First method has two 
//parameters for name and age and assigns the same whereas the 
//second method takes has three parameters which are assigned to 
//name, age and address respectively. Print the name, age and address 
//of 10 students.

import java.util.Scanner;

class student {
	private String name;
	private int age ;
	private String adress;
	
	 student() {
		this.name="unknown";
		this.age=0;
		this.adress= "not available";
		
	}
	 
	void setInfo( String s,int a){
		this.name=s;
		this.age=a;
		 
	 }
	void setInfo(String s, int a ,String d){
		this.name=s;
		this.age=a;
		this.adress=d;
		 
	 }
	void print() {
		System.out.println("Name= "+name +"    Age= "+age +"    Adress= "+adress);
	}
	
	
}
public class Q4 {

	public static void main(String[] args) { 
		int i;

		Scanner sc=new Scanner(System.in);
		student arr[]= new student[3];
		
		for(i=0; i<3; i++) {
			arr[i]=new student();
			System.out.println("Enter name");
		    String	name= sc.next();
			System.out.println("Enter age");
			int age = sc.nextInt();
			
			System.out.println("Enter 1 if adress is known");
			System.out.println("Enter 0 if adress is unknown");
			int test = sc.nextInt();
		     

			if(test==1) {
				System.out.println("Enter adress");
				String adress= sc.next();
			arr[i].setInfo(name,age,adress);
			}
			else {
				arr[i].setInfo(name,age);
			}
			
			
		}

		System.out.println("Students info:----------------------------------------");
		for(i=0;i<3;i++)  {
			
            arr[i].print();
		}    
				
	
	}

}
