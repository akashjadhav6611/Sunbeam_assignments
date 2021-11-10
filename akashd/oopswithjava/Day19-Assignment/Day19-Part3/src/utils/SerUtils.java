package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.core.Student;

public interface SerUtils {
	static void storeStudentDetails(Map<String, Student> students, String filename) throws IOException {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
			out.writeObject(students);
		}
	}
}
