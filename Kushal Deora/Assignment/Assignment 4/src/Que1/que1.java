package Que1;

import java.util.Scanner;

class Date
{Scanner sc =new Scanner(System.in);
	private int day;
	private int month;
	private int year;
	Date()
	{
		this.day=27;
		this.month=9;
		this.year=2021;
		
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
	void displayDate()
	{
		System.out.println(this.day+"/"+this.month+"/"+this.year);
	}
	void DateTest()
	{
		System.out.println("Enter the day");
		this.day=sc.nextInt();
		System.out.println("Enter the Month");
		this.month=sc.nextInt();
		System.out.println("Enter the Year");
		this.year=sc.nextInt();
	}
}
public class que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
       Date d =new Date();
       Date d1 =new Date();
d.displayDate();
d.DateTest();
d.displayDate();
d1.DateTest();
d1.displayDate();
	}

}
