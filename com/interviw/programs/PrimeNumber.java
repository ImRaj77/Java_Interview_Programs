package com.interviw.programs;

import java.io.ObjectInputStream.GetField;

public class PrimeNumber {
	// 2 is the lowest prime number
	public static boolean isPrimeNumber(int number) {
		if(number<=1) {
			return false;
		}
		
		for(int i=2; i<number; i++) {
			if(number%i == 0) {
				return false;
			} 
		}
		
		return true;
	}
	
	public static void getPrimeNumbers(int number) {
		for(int i=2; i<=number; i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i+", ");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(isPrimeNumber(20));
		getPrimeNumbers(100);
	}
}
