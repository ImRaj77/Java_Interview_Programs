package com.interviw.programs;

public class StringManupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The Rain has started here";
		String str1 = "The rain has started here";

		
		System.out.println("Length of the string: "+str.length());
		System.out.println("Character at 5th Index: "+str.charAt(5));
		System.out.println("first Index os S: "+str.indexOf('s'));
		System.out.println("2nd Index of S: "+str.indexOf('s', str.indexOf('s')+1));
		
		System.out.println("Index of has: "+str.indexOf("has"));
		System.out.println("Index of Hello: "+str.indexOf("Hello"));  // -1
		
		// String comparison
		System.out.println(str.equals(str1));		
		System.out.println(str.equalsIgnoreCase(str1));
		
		// SubString
		System.out.println(str.substring(4, 8));
		
		// Trim
		String s = "     Hello Java     ";
		System.out.println(s.trim());
		System.out.println(s.replace(" ", ""));
		
		String date = "01-01-2021";
		System.out.println(date.replace("-", "/"));
		
		// split()
		String test = "Hello_World_Test_Selenium";
		String[] testValues = test.split("_");
		for(int i=0; i<testValues.length; i++) {
			System.out.print(testValues[i]);
			System.out.print(" ");
		}
		
		System.out.println();
		String str2 = "Cares";
		System.out.println(str2.concat("xx"));
		
		
		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		
		
		
		
	}

}
