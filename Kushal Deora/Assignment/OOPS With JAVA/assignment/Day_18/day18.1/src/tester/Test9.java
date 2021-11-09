package tester;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.app.core.Student;
import com.app.core.Subject;

import static utils.CollectionUtils.*;
public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try(Scanner sc = new Scanner(System.in))
		{
			Map<String,Student> map=populateMapFromList(populateData());
			//map.forEach(p->);
			TreeMap<String, Student> tm=new TreeMap<String, Student>(map);
		tm.forEach((v,p)->System.out.println(p));

		
		}
	}

}
