package com.abstarction.concepts;

public abstract class Bank {
	// Through abstract class we achieve partial abstraction
	// there should be one abstract method : only prototype 
	// i.e. method declaration -- no body 
	// Abstraction means hiding the implementation logic and showing/giving functionality only 
	// It can have abstract and concrete methods
	// We can't create object of abstract class 
	// When to use 
	
	int amount = 100;
	final int rate =10;
	static int loanRate =5;
	public abstract void loan();  // Abstract method
	
	public void credit() {        // Concrete method
		System.out.println("Bank credit ");
	}
	
	public void debit() {         // Concrete method
		System.out.println("Bank debit ");
	}
	
}
