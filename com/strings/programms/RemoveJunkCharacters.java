package com.strings.programms;

public class RemoveJunkCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "!@# Special 101234 characters $%^&";
		String s1 = "!@# Hello !@# Java $%^& World $%^&! ";
		String s3 = "!@# Special 101234 characters $%^&";

		// Regular Expression : [^a-zA-Z0-9]
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		
		s3 = s3.replaceAll("[^0-9]", "");
		System.out.println(s3);
		
		String count = "Mail pending in Outbox (1)";
		
		System.out.println(count.replaceAll("[^0-9]", ""));
		
		String[] a = {"a", "b"};
		System.out.println(a.length);
		System.out.println(a[0]);
	}
}
