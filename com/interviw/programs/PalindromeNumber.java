package com.interviw.programs;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 151, 454, 34543, 161, 78987,  Palindrome Numbers
		isPalindromeNumber(1001);
	}

	public static void isPalindromeNumber(int number) {
		int reverse = 0;
		int sum = 0;
		int temp;
		
		temp = number;
		
		while(number>0) {
			reverse = number % 10 ; // get remainder
			sum = sum * 10 + reverse;
			number = number / 10;
		}
		
		if(temp == sum) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("Not palindrome number");
		}
	}
}
