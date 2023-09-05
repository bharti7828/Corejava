package in.com.rays.oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		String str = "11/11/2023";
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		Person p = new Person();
		
		p.setId(10);
		p.setName("mahi");
		
		p.setDOb(sdf.parse(str));
		
		System.out.println(p.getId());
		
		System.out.println(p.getName());
		
	System.out.println(p.getDob());	
	}

}
