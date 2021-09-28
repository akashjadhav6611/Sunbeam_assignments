import java.util.Scanner;

class Date{
	private int day;
	private int month;
	private int year;
	
	Scanner sc =new Scanner(System.in);
	
	public Date(){
		this(0,0,0);
	}
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay() {
		System.out.println("Enter Day:");
		this.day=sc.nextInt();
		if(day<=0 || day>31) {
			System.out.println("Wrong Day!");
			setDay();
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth() {
		System.out.println("Enter Month:");
		this.month = sc.nextInt();
		if(month<=0 || month>12) {
			System.out.println("Wrong Month!");
			setMonth();
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear() {
		System.out.println("Enter Year Between 1900 - 2100:");
		this.year = sc.nextInt();
		if(year<=1900 || year>=2100) {
			System.out.println("Wrong Year!");
			setYear();
		}
	}
	void displayDate() {
		System.out.println("Date: "+this.day+"/"+this.month+"/"+this.year);
	}
	
}
public class ques_1 {

	public static void main(String[] args) {
		DateTest();
	}
	public static void DateTest(){
		Date d = new Date();
		d.setDay();
		d.setMonth();
		d.setYear();
		
		System.out.println("Day:"+d.getDay());
		System.out.println("Month:"+d.getMonth());
		System.out.println("year:"+d.getYear());
		d.displayDate();
	}

}

