package com.method.overriding;

public class BMW extends Car{

	int a = 200;
	
	@Override
	public Car start() {
		System.out.println("BMW - - Start");
		return new Car();
	}

	@Override
	public void stop() {
		System.out.println("BMW - - Stop");
	}

	@Override
	public void refuel() {
		System.out.println("BMW - - refuel");
	}
	
	public void thredSafety() {
		System.out.println("BMW - - Thread Safety");
	}
	
}
