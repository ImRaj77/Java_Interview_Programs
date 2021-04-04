package com.interviw.programs;

public class ReverseString {
	
	public static StringBuffer way2(){
		String s = "Selenium";
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse();
	}
	
	public static void main(String[] args) {
		String s = "Selenium";
		int len = s.length();
		String rev = "";
		// Using for loop
		for(int i=len-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		
		System.out.println(rev);
		
		System.out.println("Using StringBuffer: "+ way2());
	}
}
