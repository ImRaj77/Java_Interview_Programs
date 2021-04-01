package com.interviw.programs;

public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test01();
//		test02();
		divison();
	}
	
	public static void test01() {
		try {
			System.out.println("In test01");
			throw new RuntimeException("test");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Inside catch block");
		}
		finally {
			System.out.println("Inside finally block");
		}
	}
	
	public static void test02() {
		try {
			System.out.println("Inside test02");
		} finally {
			System.out.println("Inside finally -- test02");
		}
	}
	
	public static void divison() {
		int i=10;
		try {
			System.out.println("Inside try start-- division");
			int k = i/0;
			System.out.println("Inside try end-- division");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Inside catch - - division");
			System.out.println("Divide by zero error ");
		} finally {
			System.out.println("finally block --- divison");
		}
	}
}
