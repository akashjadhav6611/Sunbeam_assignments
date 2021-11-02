package com.app.details;

import java.text.SimpleDateFormat;
import java.util.Date;

//Store book details in a library in hashing based data structure : HashSet
//Book details : isbn(string),category(enum),price(double),publishDate,authorName(string),quantity(int)
//Unique ID : isbn

public class Book 
{
	private String isbn;
	private Category category;
	private double price;
	private Date publishDate;
	private String authorName;
	private int quantity;
	
	public static SimpleDateFormat sdf;
	
	static
	{
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	public Book(String isbn, Category category, double price, Date publishDate, String authorName, int quantity) 
	{
		this.isbn = isbn;
		this.category = category;
		this.price = price;
		this.publishDate = publishDate;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	
	public Book() 
	{
		this.isbn = null;
		this.category = null;
		this.price = 0.0;
		this.publishDate = null;
		this.authorName = null;
		this.quantity = 0;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", category=" + category + ", price=" + price + ", publishDate=" + sdf.format(publishDate)
				+ ", authorName=" + authorName + ", quantity=" + quantity + "]";
	}
	
	@Override
	public boolean equals(Object o)
	{
		System.out.println("In Book Equals...");
		if(o instanceof Book)
			return this.isbn.equals(((Book)o).isbn);
		
		return false;
	}
	
	@Override
	public int hashCode()
	{
		System.out.println("In Book HashCode...");
		return isbn.hashCode();
	}
	
	public Date getDate()
	{
		return this.publishDate;
	}
	

}
