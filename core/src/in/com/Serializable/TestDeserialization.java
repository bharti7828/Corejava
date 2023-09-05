package in.com.Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class TestDeserialization {
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\Desktop\\object\\IO.txt");
		ObjectInputStream in = new ObjectInputStream(file);
		
		Object o = in.readObject();
		Marksheet m= (Marksheet) o;
		System.out.println(m.id);
		
		System.out.println(m.name);
		System.out.println(m.Physics);
		System.out.println(m.Chemistry);
		System.out.println(m.Maths);
		System.out.println(m.Total);
		
		in.close();
		file.close();
		
	}
}
