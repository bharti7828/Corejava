package in.com.Io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class  TestReadlinebyline  {
	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("C:\\Users\\hp\\Desktop\\Rays\\rays.txt");
		BufferedReader in = new BufferedReader(file);
		String line = in.readLine();
		while(line !=null) {
			System.out.println(line);
			line  = in.readLine();
		}
		in.close();
		file.close();
		
	}

}
