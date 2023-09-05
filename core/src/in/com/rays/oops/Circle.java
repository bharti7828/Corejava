package in.com.rays.oops;

public class Circle  extends Shape{
	
	private int radius = 0;
	Circle (int radius){
		this.radius = radius;
	}
	
	
	public int getRadius() {
		return radius;
	}
	
	public void area () {
		double area =  3.14* radius;
		System.out.println("circle area = "+area);
	}

}
