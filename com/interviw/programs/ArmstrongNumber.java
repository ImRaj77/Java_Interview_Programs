package com.interviw.programs;

public class ArmstrongNumber {

	public static void isArmstrongNumber(int number) {
		int cube = 0 ;
		int remainder ;
		int temp;
		temp = number ;
		while(number > 0) {
			remainder = number % 10 ;
			cube = cube + (remainder * remainder * remainder);
			number = number / 10 ;
		}
		if (temp == cube) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}
	}
	public static void main(String[] args) {
		isArmstrongNumber(153);
	}
}
