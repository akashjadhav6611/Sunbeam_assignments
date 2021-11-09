package com.app.customer;

import  java.text.SimpleDateFormat;
import java.util.Date;


//Customer : name(string),email(string),password(string),productname(string),
//dateofpurchasing(Date),device(enum : IPHONE, MACBOOK, WATCH, IPAD) along with prices

//Unique id : customer email
//Create a composition between Customer & Order ID
//OrderID  : int ID, int no. of units
//Only after  successful customer registration , Order ID can be linked to the customer.
public class Customer {
	
	private String name,email,password,productName;
	private Date dateOfPurchasing;
	private Device devices;
	private OrderID oD;

	
	public static SimpleDateFormat sdf; // date ke liye chahiye hi hota hai
	
	static {
		 sdf = new SimpleDateFormat("dd-MMM-yyyy");
	}
	
	//inner class (n-s) //Create a composition between Customer & Order ID
	public class OrderID
	{//OrderID  : int ID, int no. of units
		public int ID;
		public int unitnum;
		
		
		public OrderID(int iD, int unitnum) {

			ID = iD;
			this.unitnum = unitnum;
		}

		@Override
		public String toString() {
			return "OrderID [ID=" + ID + ", unitnum=" + unitnum + "]";
		}


		
		//getter setter for inner class
		
		public int getID() {
			return ID;
		}


		public void setID(int ID) {
			this.ID = ID;
		}

	//inner class end	
	}

	public Customer(String name, String email, String password, String productName, Date dop,
			Device dev) {
	
		this.name = name;
		this.email = email;
		this.password = password;
		this.productName = productName;
		this.dateOfPurchasing = dop;
		this.devices = dev;
	}
	

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", password=" + password + ", productName=" + productName
				+ ", dateOfPurchasing=" + sdf.format(dateOfPurchasing) + ", devices=" + devices + "]";
	}
	
	public Customer(String email)
	{
		this.email = email;	//creates only email instance // Unique ID :PK
	}

	
	
	//non stat method for OrderID
	public void OrderDetails(int ID, int unitnum) { 
		
	this.oD = new OrderID(ID,unitnum);
	}


	public OrderID getoD() {
		return oD;
	}


	public void setoD(OrderID oD) {
		this.oD = oD;
	}
	
	@Override
	public boolean equals (Object o) {
		System.out.println(" in customer's equals method");
		if (o instanceof Customer) // bheja huya object customer me hai ki nahi
				return this.email.equals(((Customer)o).email);
		return false;
		
	}
	


	
	
}
