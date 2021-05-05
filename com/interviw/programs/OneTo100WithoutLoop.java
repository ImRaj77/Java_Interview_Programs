package com.interviw.programs;

public class OneTo100WithoutLoop {

	public static void printNumbers(int number) {
		if(number<=100) {
			System.out.println(number);
			 printNumbers(number+1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumbers(1);
	}
}
