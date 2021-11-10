package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public interface DeSerUtils {
		// file validation
		static Object restoreProducts(String fileName) throws IOException, ClassNotFoundException {
			File f1 = new File(fileName);
			// validate file
			if (f1.exists() && f1.isFile() && f1.canRead()) {
				// chain of streams to de serialize
				try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(f1))) {
					return in.readObject();
				}
			}
			return null;
		}

}
