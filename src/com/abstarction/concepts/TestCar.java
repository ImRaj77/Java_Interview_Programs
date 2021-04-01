package com.abstarction.concepts;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		
		System.out.println("********");
		
		Car c = new BMW();
		c.start();
		c.stop();
		c.refuel();
	}

}
