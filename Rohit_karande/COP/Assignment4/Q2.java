// Create a class Employee having name and id as fields. Declare static 
//variable with data type string as name of company assign name as 
//“Sunbeam” for all objects. Declare a two-parameter constructor with 
//parameters named n and i. Declare an instance method display and 
//print the output on the console. Create the first object of the class and 
//pass the two arguments with type string and int. all the display 
//method using reference variable e. Similarly create one more object 
//with different name and id and call display method.

class employee{
	
	private String name;
	private int Id;
   private static String company_name ;
	
   static {
	   
	   company_name="SUNBEAM";
   }
	
	employee(String n ,int i){
		
		this.name=n;
		this.Id=i;
		
	}
	
	void display() {
		
		System.out.println("name= "+name+"  Id= "+Id+"  company name= "+company_name);
	}
	
}
public class Q2 {

	public static void main(String[] args) {
		employee obj = new employee("Rohit" ,12);
		
		employee obj2 = new employee("Aniket", 15);
		obj.display();
		obj2.display();
		

	}

}
