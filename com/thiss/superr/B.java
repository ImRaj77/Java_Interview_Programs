package com.thiss.superr;

public class B extends A {
	
	public B() {
		// super()
		System.out.println("Constructor B -- without parameters");
	}
	
	public B(int x) {
		// super()
		System.out.println("Constructor B -- with int parameter");
	}
	
	public B(String x) {
		this(3);
		System.out.println("Constructor B -- with String parameter");
	}
}
