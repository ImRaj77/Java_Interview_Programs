package com.interviw.programs;

public class FactorialNumber {

	public static void factorial(int number) {
		int fact = 1;

		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is = " + fact);
	}

	// With recursive function
	public static int recursiveFact(int number) {
		if(number == 0 )
			return 1;
		else
			return (number * recursiveFact(number - 1));
	}

	public static void main(String[] args) {
//		factorial(4);
		System.out.println(recursiveFact(3));
		
	}

}
