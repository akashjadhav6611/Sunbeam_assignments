//Write a program to print the name, salary and date of joining of 10 
//employees in a company. Use array of objects

import java.util.Scanner;

 class emp{
	 
		private String name;
		private int joining ;
		private int salary ;
		
		Scanner sc = new Scanner(System.in);
		
		public void accept() {
			System.out.println("Enter Employee name");
			name=sc.next();
			
			System.out.println("Enter Employee joining year");
			joining=sc.nextInt();
			
			System.out.println("Enter Employee salary");
			salary=sc.nextInt();
					
		
		}
		
		public void print() {
			System.out.println(" Employee name= "+name+ "     Employee joining year= "+joining +"     Employee salary= "+salary );

//			System.out.println(" Employee name= "+name);
//			System.out.println(" Employee joining year= "+joining);
//			System.out.println(" Employee salary= "+salary);
//		
		}
	
}
public class Q3 {

	public static void main(String[] args) {
		//emp e1=new emp();
		int i;
		emp e[]= new emp[10];
		for(i=0 ; i<10 ;i++)
		
		{
			e[i]= new emp();
			e[i].accept();
			
		}
		
		for(i=0 ; i<2 ;i++)			
		{
			e[i].print();
			}
		

	}

}
