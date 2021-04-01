package com.interviw.programs;

public class reverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12345;
		int reverse = 0;
		
		while(num != 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse number is: "+reverse);
		
		// Reverse Using String Buffer
		int num1 = 1234;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}
}
