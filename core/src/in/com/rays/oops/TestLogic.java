package in.com.rays.oops;

public class TestLogic  extends Logic{
	public static void main(String[] args) {
	TestLogic l = new TestLogic();
	l . area();
	l . sum();

	
	}

	@Override
	public int area() {
		System.out.println("area method ..!!!!");
		return 0;
	}

	@Override
	public int sum() {
		System.out.println("sum method ...!!!!");
		return 0;
	}
}
	
