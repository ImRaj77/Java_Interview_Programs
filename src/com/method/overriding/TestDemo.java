package com.method.overriding;

public class TestDemo {

	public static void main(String[] args) {
		
		Car car = new BMW();
		car.start();
		System.out.println(car.a);
		
		BMW b = new BMW();
		b.thredSafety();
		
		Car car1 = new Audi();
		car1.start();
		System.out.println(car1.a);

		Car car2 = new Car();
		car2.start();
		System.out.println(car2.a);

	}

}
