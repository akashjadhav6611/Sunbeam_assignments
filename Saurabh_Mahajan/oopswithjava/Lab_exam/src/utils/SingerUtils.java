package utils;

import java.util.ArrayList;

import com.app.core.Gender;
import com.app.core.Singer;

import custom_exceptions.SingerHandlingException;

public class SingerUtils 
{
	private static StringBuilder sb;//for collecting valid gender values
	private static int MIN_RATING,MAX_RATING;//rating verification
	
	static
	{
		sb = new StringBuilder();
		sb.append("Valid genders are : /n");
		for(Gender g : Gender.values())//appending valid values of genders
			sb.append(" "+g);
		
		MIN_RATING = 0;
		MAX_RATING = 5;
	}
	//[name,gender,age,email_id,contact,rating]
	//will accept values from tester and return validated Singer instance
	public static Singer acceptRecord(String name, String gender, int age, String email_id, String contact, int rating) 
			throws SingerHandlingException,IllegalArgumentException
	{
		verifyRating(rating);
		Gender tempGender = parseGender(gender);//String to Gender
		return new Singer(name, tempGender, age, email_id, contact, rating);//instance of Singer returns to caller
	}
	
	public static Singer findByEmail(String email, ArrayList<Singer> singers) throws SingerHandlingException
	{
		Singer temp = new Singer(email);
		
		if(singers.contains(temp))
		{
			int i = singers.indexOf(temp);
			return singers.get(i);
		}
		
		throw new SingerHandlingException(email +" : No singer found by this email");
	}
	
	public static Gender parseGender(String gender) throws IllegalArgumentException
	{
		try
		{
			return Gender.valueOf(gender.toUpperCase());//returns Gender type to caller
		}
		catch(IllegalArgumentException iae)
		{
			throw new IllegalArgumentException(sb.toString());//if wrong input
		}
	}
	
	public static void verifyRating(int rating) throws SingerHandlingException
	{
		if(rating < MIN_RATING)//check if rating is 0 or greater
			throw new SingerHandlingException("Underrated !!!");
		else if (rating > MAX_RATING)//check if rating is 5 or lower
			throw new SingerHandlingException("Overrated !!!");
	}
}
