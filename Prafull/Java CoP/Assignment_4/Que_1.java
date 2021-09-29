/*
 Create a class called Date that includes three instance variables—a month 
 (type int), a day (type int) and a year (type int). Provide a constructor 
 that initializes the three instance variables and assumes that the values 
 provided are correct. Provide a set and a get method for each instance 
 variable. Provide a method displayDate that displays the month, day and 
 year separated by forward slashes (/).Write a test application named 
 DateTest that demonstrates class Date’s capabilities.
 * */
   
import java.util.Scanner;

class Date{

	int month;
	int day;
	int year;
	
	Date(int a, int b, int c){
		this.month = a;
		this.day = b;
		this.year = c;
	}
	
	
	void accept() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Day:  ");
		this.day = sc.nextInt();
		System.out.print("Enter The Month:  ");
		this.month = sc.nextInt();
		System.out.print("Enter Your Year:  ");
		this.year = sc.nextInt();
		
	}
	
	void displayDate() {
		
		System.out.println(this.day+"/"+this.month+"/"+this.year);
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}	
	
}
public class Que_1 {

	public static void main(String[] args) {
		
		
		DateTest();
		
		
	}
	
	public static void DateTest(){
		Date d1 = new Date(1, 1, 2021);
		Date d2 = new Date(1, 2, 2021);
		d1.displayDate();
		d2.displayDate();
		d1.accept();
		d2.accept();
		d1.displayDate();
		d2.displayDate();
		
	}

}


