package in.com.rays.oops;

public class Businessman implements Richman,SocialWorker  {

		
	

	@Override
	public void helptoothers() {
		System.out.println("helptoother");
		
	}

	@Override
	public void earnmoney() {
		System.out.println("earnmoney");
		
	}

	@Override
	public void donation() {
		System.out.println("party");
		
	}

	@Override
	public void party() {
		System.out.println("donation");
		
	}

}

