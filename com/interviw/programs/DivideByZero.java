package com.interviw.programs;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(9.0/0);   	// infinity
		System.out.println(9.11f/0); 	// infinity
		System.out.println(10/0.0);		// infinity
		System.out.println(0/0.0);		// NaN
		System.out.println(0.0/0);		// NaN
		System.out.println(12.33/0.0);	// infinity
		
		
	}

}
