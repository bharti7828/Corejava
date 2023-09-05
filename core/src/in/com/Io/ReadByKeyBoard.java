package in.com.Io;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadByKeyBoard {
	public static void main(String[] args) throws IOException {
		System.out.println("plz enter here");
		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader in  =  new BufferedReader(isReader);
		FileWriter write = new FileWriter("C:\\Users\\hp\\Desktop\\Rays\\rays.txt",true); 
		PrintWriter out = new PrintWriter(write);
		String line = in.readLine();
		while (!(line.equals("bey"))) {
				out.println(line);
				line = in.readLine();
			
		}
		
		System.out.println("This compiler is stopped...!!");
		out.close();
		write.close();
		in.close();
		isReader.close();
		
		
	}

}
