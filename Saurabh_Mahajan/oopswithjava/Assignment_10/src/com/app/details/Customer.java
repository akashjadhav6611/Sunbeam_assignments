package com.app.details;

import java.text.SimpleDateFormat;
import java.util.Date;

//Customer : name(string),email(string),password(string),registrationAmount(double),dob(Date),plan(enum : SILVER ,GOLD,DIAMOND,PLATUNUM)
//Unique id : customer email
//Create a composition between Customer & AdharCard
//Adhar Card details : card number, location.
//Only after  successful customer registration , adhar card details can be linked to the customer.

public class Customer 
{
	private String name;
	private String email;
	private String password;
	private double registrationAmount;
	private Date dob;
	private Plan plan;
	private Adhaar adhaar;
	
	
	public static SimpleDateFormat sdf;
	
	static
	{
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}
	
		class Adhaar
		{
			private String cardNo;
			private String location;
			
			public Adhaar(String cardNo, String location) 
			{
				this.cardNo = cardNo;
				this.location = location;
			}
	
			@Override
			public String toString() {
				return "Adhaar [cardNo=" + cardNo + ", location=" + location + "]";
			}
			
			
			
		}

	public Customer(String name, String email, String password, double registrationAmount, Date dob, Plan plan) 
	{
		this.name = name;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.plan = plan;
	}
	
	public Customer() 
	{
		this.name = null;
		this.email = null;
		this.password = null;
		this.registrationAmount = 0.0;
		this.dob = null;
		this.plan = null;
	}
	
	public Customer(String email)
	{
		this.email = email;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Customer)
			return this.email.equals(((Customer)o).email);
		return false;
	}

	@Override
	public String toString() 
	{
		String temp = adhaar == null ? "Adhaar card not linked yet" : adhaar.toString();
		return "Customer [name=" + name + ", email=" + email + ", password=" + password + ", registrationAmount="
				+ registrationAmount + ", dob=" + dob + ", plan=" + plan + ", adhaar=" + temp + "]";
	}

	public Adhaar getAdhaar() 
	{
		return adhaar;
	}

	public void linkAdhaar(String cardNo, String location) {
		this.adhaar = new Adhaar(cardNo, location);
	}
	
}
