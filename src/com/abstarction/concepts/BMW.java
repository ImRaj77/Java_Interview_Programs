package src.com.abstarction.concepts;

public class BMW implements Car {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("BMW Start");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("BMW Stop");
	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println("BMW Refuel");
	}

	public void theftSafety() {
		System.out.println("Theft safety");
	}
}
