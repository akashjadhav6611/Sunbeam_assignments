package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.time.LocalDate.parse;
import static com.app.core.Subject.*;

import com.app.core.Student;

public class CollectionUtils 
{
	public static List<Student> sampleData()
	{
		ArrayList<Student> studentList = new ArrayList<>();
		
		//rollNo(String),name,dob(LocalDate),subject(enum),gpa(double)
		//Enum values : JAVA,DBT,ANGULAR,REACT,SE
		
		studentList.add(new Student("2", "dean", parse("1995-03-28"), REACT, 3.52));
		
		studentList.add(new Student("3", "crowley", parse("1975-10-18"), JAVA, 9.95));
		
		studentList.add(new Student("5", "eileen", parse("1999-08-09"), ANGULAR, 8.23));
		
		studentList.add(new Student("4", "mary", parse("1988-06-25"), SE, 4.76));
		
		studentList.add(new Student("1", "sam", parse("1998-01-01"), JAVA, 7.95));
		
		return studentList;
	}
	
	public static Map<String,Student> sampleMapData(List<Student> list)
	{
		Map<String,Student> mapList = new HashMap<>();
		
		for(Student s : list)
			mapList.put(s.getRollNo(), s);
		
		return mapList;
	}
}
