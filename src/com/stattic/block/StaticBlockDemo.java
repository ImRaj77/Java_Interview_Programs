package com.stattic.block;

public class StaticBlockDemo {

	static {
		System.out.println("This is -- static block");
	}
	
	public StaticBlockDemo() {
		System.out.println("This is -- default constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is -- main method");
	}

}
