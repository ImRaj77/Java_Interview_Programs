package com.interviw.programs;

public class PrintHelloWorld {

	public static void main(String[] args) {
		// Print hello world without using semicolon
		// 1st Way
		if(System.out.printf("Hello World" + "\n") == null) {
			
		}
		
		// 2nd Way
		if(System.out.append("Hello World" + "\n") == null) {
			
		}
		
		// 3rd Way
		if(System.out.append("Hello World" + "\n").equals(null)) {
			
		}
		
		//4th Way
		for(int i=0; i<1; System.out.println("Hello World")) {
			i++;
		}
	}

}
