package com.interviw.programs;

public class FinalizeConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeConcept f1= new FinalizeConcept();
		FinalizeConcept f2= new FinalizeConcept();
		
		f1=null;
		f2=null;
		
		// After these lines the objects are blank and they are not having any reference 
		// garbage collector will kill such kind of objects .. garbage collector will be automatically called or you can 
		// like System.gc()

		// If you write finalize() just before the garbage collector it will destroy null objects
		
	}
	
	public void finalize() {
		System.out.println("Finalize method");
	}

}
