package com.method.overriding;

public class Audi extends Car{

	int a = 300;
	
	@Override
	public BMW start() {
		System.out.println("Audi - - Start");
		return new BMW();
	}

	@Override
	public void stop() {
		System.out.println("Audi - - Stop");
	}

	@Override
	public void refuel() {
		System.out.println("Audi - - refuel");
	}
	
}
