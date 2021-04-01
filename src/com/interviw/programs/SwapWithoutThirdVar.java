package com.interviw.programs;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		int y = 10;
		// Output : x=10, y=5
		
//		int temp;
//		temp = x;
//		x = y ;
//		y = temp;
//		System.out.println("X= "+x+" and Y= "+y);
		
		// Without third variable with +, - operators
		
//		x = x + y ;  // 15
//		y = x - y ;  // 5
//		x = x - y ;  // 10
		
//		System.out.println("X= "+x+" and Y= "+y);
		
		// Without third variable with *, / operators
//		x = x * y ;
//		y = x / y ;
//		x = x / y ;
//		
//		System.out.println("X= "+x+" and Y= "+y);

		// Using XOR operator binary conversion
		x = x ^ y ;    
		y = x ^ y ;    
		x = x ^ y ;    
		System.out.println("X= "+x+" and Y= "+y);

		
	}

}
