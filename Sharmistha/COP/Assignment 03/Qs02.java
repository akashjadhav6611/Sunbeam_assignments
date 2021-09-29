package Assignment03;



	
	 import java.util.*;
	 
	 class Employee 
	{
		private String name,address;
		private int yoj, salary;
	Scanner sc=new Scanner(System.in);
		
		//getter
		int getyoj()
		{
			return yoj;
		}
		
		int getSalary() 
		{
			return salary;
		}
		
		String getName()
		{
			return name;
		}
		String getAddress()
		{
			return address;
		}
		void accept()
		{
			System.out.println("Enter Name :");
			name=sc.next();
			System.out.println("Enter Year of joining  :");
			yoj=sc.nextInt();
			System.out.println("Enter Salary:");
			salary=sc.nextInt();
			
			System.out.println("Enter Address :");
		address=sc.next();
			
		}
		void disp()
		{System.out.println("Name  ="+name);
			
			System.out.println(" ="+yoj);
			System.out.println("Salary ="+salary);
			
			System.out.println("Grade ="+address);
			
			
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", address=" + address + ", yoj=" + yoj + ", salary=" + salary + "]";
		}
		
		
		void setSalary(int salary)
		{
			this.salary=salary;
		}
		

		
		void setYoj(int yoj)
		{
			this.yoj=yoj;
		}
		
		void setName(String name)
		{
			this.name=name;
		}
		void setAddress(String address)
		{
			this.address=address;
		}
		
		
		
	}

		
		

	public class Qs02 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Employee e1=new Employee();
			Employee e2=new Employee();
			Employee e3=new Employee();
			
		
			e1.accept();
			System.out.println("Name="+e1.getName());
			System.out.println("Salary="+e1.getAddress());
			System.out.println("Year of Joining ="+e1.getyoj());
			System.out.println("Salary="+e1.getSalary());
			
		
			e2.accept();
			System.out.println("Name="+e2.getName());
			System.out.println("Salary="+e2.getAddress());
			System.out.println("Year of Joining ="+e2.getyoj());
			System.out.println("Salary="+e2.getSalary());
			
			e3.accept();
			System.out.println("Name="+e3.getName());
			System.out.println("Salary="+e3.getAddress());
			System.out.println("Year of Joining ="+e3.getyoj());
			System.out.println("Salary="+e3.getSalary());
		
		

		}

	}

	

