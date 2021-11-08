package utils;

import java.util.ArrayList;

import com.app.core.Gender;
import com.app.core.Singer;

public class CollectionUtils 
{
	//creating sample data for faster testing
	public static ArrayList<Singer> populateSampleData()
	{
		ArrayList<Singer> sampleList = new ArrayList<>();
		
		//[name,gender,age,email_id,contact,rating]
		sampleList.add(new Singer("john", Gender.valueOf("MALE"), 25, "john@gmail.com", "9872561340", 3));
		
		sampleList.add(new Singer("mark", Gender.valueOf("MALE"), 31, "mark@gmail.com", "9665764625", 2));
		
		sampleList.add(new Singer("monica", Gender.valueOf("FEMALE"), 28, "monica@gmail.com", "9405062345", 1));
		
		sampleList.add(new Singer("gian", Gender.valueOf("MALE"), 19, "gian@gmail.com", "7501811078", 5));
		
		sampleList.add(new Singer("rachel", Gender.valueOf("FEMALE"), 23, "rachel@gmail.com", "8007157279", 4));
		
		return sampleList;
	}
}
