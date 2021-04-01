package com.interviw.programs;

public class DuplicateCharacters {

	public static void duplicateCharacters(String str) {
		int count;
		char[] a = str.toLowerCase().toCharArray();
		System.out.println("Duplicate characters in given String = "+str+" are : ");

		for(int i=0; i<a.length; i++) {
			count = 1 ;
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					count++;
					// set a[j] to 0 to avoid printing visited character  
					a[j]='0';
				}
			}
			//A character is considered as duplicate if count is greater than 1  
			if(count>1 && a[i]!='0') {
				System.out.println(" "+a[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicateCharacters("Rrjabhau");
	}

}
