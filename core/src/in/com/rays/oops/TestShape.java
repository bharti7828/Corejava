package in.com.rays.oops;

public class TestShape {
	public static void main(String[] args) {
		Shape[] s = new Shape [3];
		
		s[0] = new Rectangle();
		s[1] = new Circle(10);
		s[2] = new Triangle();
		
		for (int i = 0; i < s.length; i++) {
			
			s[i].area();
		}
		
			
		
		}
	}

