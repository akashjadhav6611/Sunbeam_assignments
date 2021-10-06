// Create a class called Date that includes three instance variables—a 
//month (type int), a day (type int) and a year (type int). Provide a 
//constructor that initializes the three instance variables and assumes 
//that the values provided are correct. Provide a set and a get method 
//for each instance variable. Provide a method displayDate that displays 
//the month, day and year separated by forward slashes (/).Write a test 
//application named DateTest that demonstrates class Date’s 
//capabilities

class date{
private	int month;
private	int day;
private	int year;

    date(){
    	this(1,1,2000);
    }
	
	date(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
		
				
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}
	
	void displayDate(){
		
		System.out.println("Display Date= "+day+"/"+month+"/"+year );

	}
	
}

class DateTest{
	date test = new date(27,9,2021);
	
	void method() {
	test.displayDate();
	test.setDay(15);
	test.setMonth(3);
	test.setYear(2000);
	test.displayDate();
	}
	
	
}
public class Q1 {

	public static void main(String[] args) {
		DateTest obj = new DateTest();
		
		obj.method() ;


	}

}
