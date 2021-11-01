package com.app.customer;

public enum Device {

	IPHONE(60000), MACBOOK(100000), WATCH(30000), IPAD(50000);

	private int price;
	Device(int price) { // call above enum prices
		//super(name(),ordinal());
		System.out.println("");
		this.price=price;
	}
	@Override
	public String toString()
	{
		return name()+" @ "+price;
	}
	public int getPrice() { // private hai price so getter setter 
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
