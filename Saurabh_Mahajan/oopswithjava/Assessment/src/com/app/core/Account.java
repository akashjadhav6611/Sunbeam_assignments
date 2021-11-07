package com.app.core;


public class Account 
{
	private String accountNumber;
	private String name;
	private String email;
	private String phone;
	private double balance;
	
	//Account [accNumber,name,email, phone,balance] class.
	public Account(String accountNumber, String name, String email, String phone, double balance) 
	{
		this.accountNumber = accountNumber;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.balance = balance;
	}
	
	//parameterless ctor
	public Account() 
	{
		this.accountNumber = null;
		this.name = null;
		this.email = null;
		this.phone = null;
		this.balance = 0.0;
	}

	public Account(String accNo) {
		this.accountNumber = accNo;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", balance=" + balance + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Account)
			return this.accountNumber.equals(((Account)obj).accountNumber);
		return false;
	}
	
	public String getEmail()
	{
		return this.email;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

}
