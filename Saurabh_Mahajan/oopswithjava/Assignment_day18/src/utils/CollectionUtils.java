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
		
		//sample data
		//rollNo(String),name,dob(LocalDate),subject(enum),gpa(double)
		//Enum values : JAVA,DBT,ANGULAR,REACT,SE
		
		studentList.add(new Student("02", "dean", parse("1995-03-28"), REACT, 3.52));
		
		studentList.add(new Student("03", "crowley", parse("1975-10-18"), JAVA, 9.95));
		
		studentList.add(new Student("05", "eileen", parse("1999-08-09"), ANGULAR, 8.23));
		
		studentList.add(new Student("04", "mary", parse("1988-06-25"), SE, 4.76));
		
		studentList.add(new Student("14", "sam", parse("1998-01-01"), JAVA, 7.95));
		
		studentList.add(new Student("11", "john", parse("1984-06-21"), SE, 6.94));
		
		studentList.add(new Student("07", "castiel", parse("1976-09-13"), ANGULAR, 3.99));
		
		studentList.add(new Student("15", "abbadon", parse("1979-12-26"), SE, 7.22));
		
		studentList.add(new Student("06", "chuck", parse("1935-04-08"), REACT, 4.55));
		
		studentList.add(new Student("09", "gabriel", parse("1943-06-04"), JAVA, 4.48));
		
		studentList.add(new Student("13", "lucifer", parse("1936-02-17"), SE, 8.22));
		
		studentList.add(new Student("08", "rowena", parse("1968-03-13"), SE, 9.92));
		
		studentList.add(new Student("12", "charlie", parse("2000-07-02"), JAVA, 3.88));
		
		studentList.add(new Student("01", "jessica", parse("1999-11-19"), SE, 3.26));
		
		studentList.add(new Student("10", "jody", parse("1991-12-24"), JAVA, 4.90));
		
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
