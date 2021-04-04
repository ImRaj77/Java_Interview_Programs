package com.main.method;

public class Test {

	// JVM will search the main method with String[] args parameter and that will be called only ..
	// Other main methods can be called inside this main method
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is main method");
		main("Testing");
		main(1);
		main(5, 10);
	}
	
	public static void main(int a) {
		// TODO Auto-generated method stub
		System.out.println("This is main method -- int a");
	}

	public static void main(String a) {
		// TODO Auto-generated method stub
		System.out.println("This is main method -- String a");
	}
	
	public static void main(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("This is main method -- int a, int b");
	}
}
