package in.com.Io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestReadImage {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("C:\\Users\\hp\\Desktop\\Rays\\bharti.jpg");
		FileOutputStream out= new FileOutputStream("C:\\Users\\hp\\Desktop\\Rays\\rays.jpg");
		int ch = in .read();
		while(ch!= -1) {
			out.write(ch);
			
			//
			
			System.out.println((char) ch);
			ch = in.read();
		}
		out.close();
		in.close();
		System.out.println("nice pic....!!!!");
		
	
		
		
		
	}

}
