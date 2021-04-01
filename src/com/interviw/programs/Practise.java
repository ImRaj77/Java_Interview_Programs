package com.interviw.programs;

import java.util.HashSet;
import java.util.Set;

public class Practise {

	public static void reverseString() {
		String str = "HellO";
		String reverse = "";
		for(int i=str.length()-1; i>=0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reverse of "+ str +" is : "+reverse);
	}
	
	public static void reverseInteger() {
		int num = 1234;
		int reverse = 0;
		System.out.print("Reverse of "+num+" is : ");
		while(num>0) {
			reverse = reverse * 10 + num % 10 ;
			num = num / 10 ;
		}
		System.out.print(reverse);
		System.out.println();
	}
	
	public static void removeJunk() {
		String s = "!@# Special 101234 characters $%^&";
		System.out.println("Remove all junk:  "+s.replaceAll("[^a-zA-Z0-9]", " ").trim());
	}
	
	public static void missingNumber() {
		int a[] = {1,2,3,4,5,6,8,9,10};
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];	
		}
		int newSum = 0;
		for(int i=1; i<=10; i++) {
			newSum = newSum + i ;
		}
		System.out.println("Missing number in an array is : "+(newSum-sum));
	}
	
	public static void duplicateElement() {
		String names[] = {"Java", "JavaScript", "Ruby", "C", "Java"};
		Set<String> store = new HashSet<String>();
		
		for(String ele : names) {
			if(!store.add(ele)) {
				System.out.println(ele+" : is duplicate element");
			}
		}
		
		for(int i=0; i<names.length; i++) {
			for(int j= i+1; j<names.length; j++) {
				if(names[i].equals(names[j])) {
					System.out.println("duplicate element is : "+names[i]);
				}
			}
		}
	}
	
	public static void swapNumbers() {
		int x = 10;
		int y = 20;
		int temp;
		
//		temp = x ;
//		x = y ;
//		y = temp;
//		System.out.println("X= "+x+" , Y= "+y);
		
//		x = x + y ;
//		y = x - y ;
//		x = x - y ;
//		System.out.println("X= "+x+" , Y= "+y);
		
		x = x * y ;
		y = x / y ;
		x = x / y ;
		System.out.println("X= "+x+" , Y= "+y);
		
	}
	
	public static void swapStrings() {
		String a = "Hello";
		String b = "World";
		
		a = a + b ;    // HelloWorld
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		
		System.out.println("a= "+a+" , b= "+b);
	}
	
	public static boolean isPrimeNumber(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void rangePrimeNumbers(int num) {
		for(int i=2; i<=num; i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i+", ");
			}
		}
	}
	
	public static void palindromeNumber(int num) {
		int reverse = 0;
		int sum = 0;
		int temp;
		
		temp = num ;
		
		while(num>0) {
			reverse = num % 10 ; // get remainder
			sum = sum * 10 + reverse;
			num = num / 10;
		}
		
		System.out.println();
		if(sum == temp) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString();
		reverseInteger();
		removeJunk();
		missingNumber();
		duplicateElement();
		swapNumbers();
		swapStrings();
		System.out.println(isPrimeNumber(11));
		rangePrimeNumbers(20);
		palindromeNumber(151);
	}
	
	

}
