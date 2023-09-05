package in.com.Serializable;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {
	public static void main(String[] args) throws Exception {
		Marksheet m = new Marksheet();
		m.id = 1;
		m.name = "Bharti";
		m.Physics = 75;
		m.Chemistry = 88;
		m.Maths = 99;
		m.Total = m.Physics +m.Chemistry +m.Maths;
		
		FileOutputStream file = new FileOutputStream ("C:\\Users\\hp\\Desktop\\object\\IO.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(m);
		out.close();
		file.close();
		
		System.out.println("Object write successfully.....!!!!?");
	}

}
