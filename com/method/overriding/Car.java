package com.method.overriding;

public class Car {
	
	int a=100;
	
	public Car start() {
		System.out.println("Car - - Start");
		return new Car();
	}
	
	public void stop() {
		System.out.println("Car - - Stop");
	}
	
	public void refuel() {
		System.out.println("Car - - Refuel");
	}
	
}
