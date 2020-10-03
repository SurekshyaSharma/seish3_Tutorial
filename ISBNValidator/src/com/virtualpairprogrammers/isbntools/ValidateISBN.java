package com.virtualpairprogrammers.isbntools;

public class ValidateISBN {

	public boolean checkAValidISBN(String isbn) {
		if(isbn.length()!=10) throw new NumberFormatException("ISBN umber hould be 10digit");
			
		
		int total=0;
		
		for(int i=0;i<10;i++) {
			total+= isbn.charAt(i)*(10-i);
		}
		if (total%11 ==0) {
			return true;
			
		}else {
			return false;
		}
	}
}


