package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.core.Student;
import com.app.core.Subject;

public interface CollectionUtils {
	static List<Student> populateData() {
		ArrayList<Student> products = new ArrayList<>();
		products.add(new Student("1","Kushal",LocalDate.parse("1998-09-14"),Subject.valueOf("JAVA"),7.52));
		products.add(new Student("2","Amit",LocalDate.parse("1996-07-08"),Subject.valueOf("REACT"),6.20));
		products.add(new Student("3","Kapil",LocalDate.parse("1997-01-21"),Subject.valueOf("ANGULAR"),9.52));
		products.add(new Student("5","Neha",LocalDate.parse("1997-04-15"),Subject.valueOf("DBT"),4.52));
		products.add(new Student("4","Sunil",LocalDate.parse("1994-03-20"),Subject.valueOf("SE"),3.52));
		products.add(new Student("6","Deepak",LocalDate.parse("1995-03-20"),Subject.valueOf("SE"),8.52));
return products;

}
	
	 static Map<String,Student> populateMapFromList(List<Student> list)
	 {
		 Map<String,Student> productMap=new HashMap<>();
		 for(Student s : list)
			 productMap.put(s.getRollNo(),s);
		 return productMap;
	 }
	 
	 
	 static void storeStudentDetails( Map<String,Student> studentMap,String fileName) throws IOException
	 {
		 try(ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream(fileName)))
		 {
			 out.writeObject(studentMap);
		 }
	 }
	 
	 static Map<String, Student> restoreStudentDetails(String fileName) throws IOException, ClassNotFoundException
	 {
		 File f1= new File(fileName);
		 if(f1.exists()&&f1.isFile()&&f1.canRead())
		 {
			 try(ObjectInputStream in =new ObjectInputStream(new FileInputStream(f1)))
			 {
				 return (Map<String, Student>) in.readObject();
			 }
		 }
		 return populateMapFromList(populateData());
	 }
	 
	 
//	 static Student getStudent(List<Student> students,String rollNo)
//	 {
//		 Student s1=new Student(rollNo);
//		 int idx= students.indexOf(s1);
//		 if(idx==-1)
//			 System.out.println("not Found");
//		 return students.get(idx);
//	 }
}
