package com.interviw.programs;

public class StaticBlocks {

	static {
		System.out.println("This is -- static block");
	}
	
	public StaticBlocks() {
		System.out.println("This is -- default constructor");
	}
	
	{
		System.out.println("This is -- Non Static block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is -- main method");
		StaticBlocks st = new StaticBlocks();
	}

}
