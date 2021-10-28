package com.app.vehicles;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Vehicle's  state(attributes) --chasisNo : String , color : String ,
 * category:string, price : double , manufactureDate(Date)
 */
public class Vehicle {
	private String chasisNo;
	private Color color;
	private double price;
	private Date manufactureDate;
	private Category category;
	private DeliveryAddress address;

	// SDF : for parsing + formatting
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("yyyy-MM-dd");
	}

	public DeliveryAddress getAddress() {
		return address;
	}

	public void setAddress(DeliveryAddress address) {
		this.address = address;
	}

	public Vehicle(String chasisNo, Color color2, double price, Date manufactureDate, Category category) {
		super();
		this.chasisNo = chasisNo;
		this.color = color2;
		this.price = price;
		this.manufactureDate = manufactureDate;
		this.category = category;
	}

	// add overloaded constr to init chasis no of a vehicle
	public Vehicle(String chasisNo) {
		this.chasisNo = chasisNo;
	}

	@Override
	public String toString() {
		String adr = address == null ? " Address not yet assigned" : address.toString(); // toString because address
																							// type to string type
		// We are doing this because if no add, we can display this
		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + " manufactured on "
				+ sdf.format(manufactureDate) + " category " + category + "" + adr;
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("in vehicle's equals method");
		if (o instanceof Vehicle)
			return this.chasisNo.equals(((Vehicle) o).chasisNo);// String's equals method for : checking content
																// equality
		return false;// => incompatible types !!!!!
	}

	// add a non static method to assign delivery address to the vehicle
	public void assignDeliveryAddress(String city, String state, String country, String zipCode) { // cannot use
																									// DeliveryAddress
																									// address =new
																									// DeliveryAddress
																									// as this will
																									// assign a value
																									// only when this
																									// method is invoked
		this.address = new DeliveryAddress(city, state, country, zipCode);
	}

	// non static nested class : inner class
	public class DeliveryAddress {
		private String city, state, country, zipCode;

		public DeliveryAddress(String city, String state, String country, String zipCode) {
			super();
			this.city = city;
			this.state = state;
			this.country = country;
			this.zipCode = zipCode;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		@Override
		public String toString() {
			return " DeliveryAddress [city=" + city + ", state=" + state + ", country=" + country + ", zipCode="
					+ zipCode + "]";
		}

	} // inner class over
	
}
