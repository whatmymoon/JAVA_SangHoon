package days17;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IO16 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		File dir = new File("D:\\JAVA01\\java_se\\temp");
		if( !dir.exists() ) dir.mkdirs();
		File file = new File(dir, "MyClass.dat");
		
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
		
		MyClass obj = (MyClass) ois.readObject();
		
		System.out.println(obj.name);
		ois.close();
		
	}

}
