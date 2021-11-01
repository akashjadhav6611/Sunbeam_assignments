/*
 4.1 Customer : name(string),email(string),password(string),registrationAmount(double),dob(Date),plan(enum : SILVER ,GOLD,DIAMOND,PLATUNUM)
Unique id : customer email
Create a composition between Customer & AdharCard
Adhar Card details : card number, location.
Only after  successful customer registration , adhar card details can be linked to the customer.

 */

package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
private String name;
private String email;
private String password;
private double registrationAmount;
private Date dob;
private Plan plan;
private AdharCard adhaar;


public Customer(String name, String email, String password, double registrationAmount, Date dob, Plan plan) {
	super();
	this.name = name;
	this.email = email;
	this.password = password;
	this.registrationAmount = registrationAmount;
	this.dob = dob;
	this.plan = plan;
}


public Customer(String email) {
	super();
	this.email = email;
}


public AdharCard getAdhaar() {
	return adhaar;
}


public static SimpleDateFormat sdf;
static
{
	sdf=new SimpleDateFormat("yyyy-MM-dd");
}



@Override
public boolean equals(Object o)
{
	if(o instanceof Customer)
		return this.email.equals(((Customer) o).email);
	return false;
}

class AdharCard
{
	private String cardno;
	private String location;
	public AdharCard(String cardno, String location) {
		super();
		this.cardno = cardno;
		this.location = location;
	}
	@Override
	public String toString() {
		return "AdharCard [cardno=" + cardno + ", location=" + location + "]";
	}
	
}

public void link(String cardno, String location)
{
	this.adhaar=new AdharCard(cardno, location);
}


@Override
public String toString() {
	return "Customer [name=" + name + ", email=" + email + ", password=" + password + ", registrationAmount="
			+ registrationAmount + ", dob=" + dob + ", plan=" + plan + ", adhaar=" + adhaar + "]";
}


//@Override
//public String toString() {
//	return "Customer [name=" + name + ", email=" + email + ", password=" + password + ", registrationAmount="
//			+ registrationAmount + ", dob=" + dob + ", plan=" + plan + ", adhaar=" + adhaar==null?"Not link":adhaar + "]";
//}

	
	
}
