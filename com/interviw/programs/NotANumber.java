package com.interviw.programs;

public class NotANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// NAN - Not A Number
		System.out.println(0.0/0.0);   					// NaN
		System.out.println(Math.sqrt(-1));  			// NaN
		System.out.println(Float.NaN);  				// NaN
		System.out.println(Float.NaN == Float.NaN);     // False
		System.out.println(Float.NaN != Float.NaN);     // True
		System.out.println(1.2/0.0);
		
	}

}
