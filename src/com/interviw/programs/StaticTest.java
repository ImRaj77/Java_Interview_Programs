package com.interviw.programs;

public class StaticTest {

	public static void main(String[] args) {
		System.out.println(Main.x); // if x is final then Main.x is replaced by 100
		// System.out.println(100);
	}
}

class Main{
	public static final int x = 100 ; // if final then output would be only 100 else the normal flow
	
	static {
		System.out.println("main class static block");
	}
}
