package tester;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.app.core.Student;
import com.app.core.Subject;

import static utils.CollectionUtils.*;
public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try(Scanner sc = new Scanner(System.in))
		{
			Map<String,Student> map=populateMapFromList(populateData());
			//map.forEach(p->);
			Collection<Student> studentCollection = map.values();
		
		Comparator<Student> dobComp = Comparator.comparing(Student :: getDob);
			
			studentCollection.stream().//Collection to stream
			sorted(dobComp).//sorting by custom comparator
			forEach(System.out::println);//termination function
//			Subject s= Subject.valueOf(sc.next().toUpperCase());
//	long count=	list.stream().filter(p->p.getSubject()==s).filter(p->p.getGpa()>7.5).count();
//			System.out.println(count);
		//	list.stream().sorted(s).forEach(p->System.out.println(p));
		
		}
	}

}
