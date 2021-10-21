import java.util.Scanner;

class Date{
	int month;
	int date;
	int year;
	
	
	
	public Date(int month, int date, int year) {
	
		this.month = month;
		this.date = date;
		this.year = year;
	}
	
	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter month");
		month = sc.nextInt();
		System.out.println("enter date");
		date = sc.nextInt();
		System.out.println("enter year");
		year = sc.nextInt();
		
	}
	void disp() {
		System.out.println("date : "+this.month+"/"+this.date+"/"+this.year);
	}
	public int getMonth() {
		
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
		
	}
	public int getDate() {
		
		return date;
	}
	public void setDate(int date) {
		this.date = date;
		
	}
	public int getYear() {
		
		return year;
	}
	public void setYear(int year) {
		
		this.year = year;
		
	}
	
	
	
}
public class Ass4_1 {

	public static void main(String[] args) {
		
		
		DateTest();
		
	}
	
	public static void DateTest() {
		Date d1 = new Date(4,21,2020);
		Date d2 = new Date(3,17,2015);
		System.out.println("original dates");
		d1.disp();
		d2.disp();
		d1.accept();
		d2.accept();
		d1.getMonth();
		d1.getDate();
		d1.getYear();
		
		d2.getMonth();
		d2.getDate();
		d2.getYear();
		
		d1.disp();
		d2.disp();
		
	}

}
