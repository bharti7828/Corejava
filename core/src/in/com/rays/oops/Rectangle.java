package in.com.rays.oops;

public class Rectangle  extends Shape{
	private int length = 0;
	private int Width = 0;
	
	public void setlength(int length) {
		this.length = length;
		
	}
	public int getLength() {
		return length;
	}
	public void setWidth(int Width) {
		this.Width = Width;
	}
	public int getWidth() {
		return Width;
	}
	
	public void area() {
		int area = getLength()*getWidth();
		System.out.println("rectangle area = "+area);
	}

}
