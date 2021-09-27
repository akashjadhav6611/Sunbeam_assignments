package question_1;

import java.util.Scanner;

class Date{
		private int month;
		private int day;
		private int year;
		
		public Date() {
			this(1,1,1);
		}
		public Date(int month, int day, int year) {
			this.month = month;
			this.day = day;
			this.year = year;
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
		
		public void displayDate() {
			System.out.println("Date: "+month+"/"+day+"/"+year);
		}
		
}

public class DateTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int month,day,year;
		
		Date d=new Date(9,27,2021);
		d.displayDate();
		
//		Using Getter

		month=d.getMonth();
		day=d.getDay();
		year=d.getYear();
		d=new Date(month,day,year);
		d.displayDate();
		
//		Using setter
		Date d2=new Date();
		System.out.println("Enter Month: ");
		month=sc.nextInt();
		d2.setMonth(month);
		
		System.out.println("Enter Day: ");
		day=sc.nextInt();
		d2.setDay(day);
		
		System.out.println("Enter Year: ");
		year=sc.nextInt();
		d2.setYear(year);
		
		d2.displayDate();
		
		
		

	}

}
