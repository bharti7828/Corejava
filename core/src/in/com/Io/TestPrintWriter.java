package in.com.Io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestPrintWriter {
	public static void main(String[] args) throws Exception {
		FileWriter file = new FileWriter("C:\\\\Users\\\\hp\\\\Desktop\\\\Rays\\\\rays.txt");
		PrintWriter out = new PrintWriter(file);
		out.println("Hello how are you??");
		out.close();
		file.close();
	}

}
