package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.app.core.Student;

import static utils.CollectionUtils.*;

public interface SerDeSerUtils 
{
	
	static void storeDetails(Map<String,Student> students , String fileName) 
			throws IOException
	{
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(fileName)))
		{
			out.writeObject(students);
		}
	}

	static HashMap<String, Student> restoreDetails(String fileName) 
			throws FileNotFoundException, IOException, ClassNotFoundException
	{
		File f = new File(fileName);
		
		if(f.exists() && f.isFile() && f.canRead())
		{
			try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName)))
			{
				return (HashMap<String, Student>)in.readObject();
			}
		}
		
		return sampleMapData(sampleData());
	}
}
