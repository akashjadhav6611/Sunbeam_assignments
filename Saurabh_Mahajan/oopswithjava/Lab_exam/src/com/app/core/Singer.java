package com.app.core;

//Write a class Singer[name,gender,age,email_id,contact,rating]
public class Singer implements Comparable<Singer>//for sorting by name
{
	private String name;
	private Gender gender;//choices cannot be random so used enum
	private int age;
	private String email_id;
	private String contact;
	private int rating;
	
	//parameterized constructor
	public Singer(String name, Gender gender, int age, String email_id, String contact, int rating) 
	{
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.email_id = email_id;
		this.contact = contact;
		this.rating = rating;
	}
	
	//parameterless constructor
	public Singer()
	{
		this(null,null,0,null,null,0);
	}
	
	//to make temporary instance to check primary key functionality
	public Singer(String email)
	{
		this.email_id=email;
	}

	//displaying singer record
	@Override
	public String toString() {
		return "Singer [name=" + name + ", gender=" + gender + ", age=" + age + ", email_id=" + email_id + ", contact="
				+ contact + ", rating=" + rating + "]";
	}
	
	//overrided Object classes equals method to implement primary key
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Singer)
			return this.email_id.equals(((Singer)o).email_id);
		return false;
	}
	
	//overriding Comparable method
	@Override
	public int compareTo(Singer anotherSinger)
	{
		//for sorting by name
		return this.name.compareTo(anotherSinger.name);
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

}
