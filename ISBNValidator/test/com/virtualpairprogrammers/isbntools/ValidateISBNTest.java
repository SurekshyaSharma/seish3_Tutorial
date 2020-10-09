package com.virtualpairprogrammers.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateISBNTest {

	@Test
	public void checkAValidISBN() {
		ValidateISBN validator= new ValidateISBN();
		boolean result = validator.checkAValidISBN("0140449116");
		assertTrue("1st",result);
// 		Checking the second number
		result=validator.checkAValidISBN("0140177396");
		assertTrue("2nd",result);
	}

	
	@Test
	public void checkInValidISBN() {
		ValidateISBN validator= new ValidateISBN();
		boolean result = validator.checkAValidISBN("0140449117");
		assertFalse(result);
	}
	
	@Test(expected =NumberFormatException.class)
	public void nineDigitISBN() {
		ValidateISBN validator= new ValidateISBN();
		boolean result = validator.checkAValidISBN("123456789");
		assertFalse(result);
	}

}
