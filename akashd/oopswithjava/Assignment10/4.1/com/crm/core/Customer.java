package com.crm.core;

import java.util.Date;

public class Customer {
	private String name;
	private String email;
	private String password;
	private double registrationAmount;
	private Date dob;
	private Plans plan;
	private AadharCard aadharcard;
	
	public Customer(String name, String email, String password, double registrationAmount, Date dob, Plans plan) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.plan = plan;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", password=" + password + ", registrationAmount="
				+ registrationAmount + ", dob=" + dob + ", plan=" + plan + "]";
	}
	
	
	public void assignAadharCard(double cardNumber, String location) {
		this.aadharcard = new AadharCard(cardNumber, location);
	}
	
	public AadharCard getAadharDetails() {
		return aadharcard;
	}
	
	// non static nested inner class
	public class AadharCard {
		private double cardNumber;
		private String location;
		
		public AadharCard(double cardNumber, String location) {
			this.cardNumber = cardNumber;
			this.location = location;
		}

		@Override
		public String toString() {
			return "AadharCard [cardNumber=" + cardNumber + ", location=" + location + "]";
		}
		
		
	}
	
}
