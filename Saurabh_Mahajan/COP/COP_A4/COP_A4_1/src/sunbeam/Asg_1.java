package sunbeam;

class Date
{
	int day;
	int month;
	int year;
	
	public Date()
	{
		this(1,1,2000);
	}
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void displayDate()
	{
		System.out.println(day+"/"+month+"/"+year);
	}
}

class DateTest
{
	Date date = new Date(4,9,1998);
	public void method()
	{
		date.displayDate();
		date.setDay(19);
		date.setMonth(11);
		date.setYear(1992);
		date.displayDate();
	}
	
	public void dispay()
	{
		System.out.println(date.getDay()+"/"+date.getMonth()+"/"+date.getYear());
	}
}

public class Asg_1 {

	public static void main(String[] args) {
		DateTest date = new DateTest();
		date.method();
		date.dispay();
	}

}
