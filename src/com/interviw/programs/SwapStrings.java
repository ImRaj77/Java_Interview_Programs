package com.interviw.programs;

public class SwapStrings {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";
		System.out.println("Before Swapping: a= "+a+" and b= "+b);
		System.out.println("Hello: "+a.length());
		// apend a and b and store into a
		
		a = a+b; // a = helloworld
		// Store initial string a in string b
		b = a.substring(0, a.length()-b.length());
		// Store initial b in string a
		a = a.substring(b.length());
		
		System.out.println("After Swapping: a= "+a+" and b= "+b);

		
	}
}
