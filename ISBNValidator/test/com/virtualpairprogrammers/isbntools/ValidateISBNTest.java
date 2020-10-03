package com.virtualpairprogrammers.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateISBNTest {

	@Test
	public void checkAValidISBN() {
		ValidateISBN validator= new ValidateISBN();
		boolean result = validator.checkAValidISBN(140449116);
		assertTrue(result);
	}

	
	@Test
	public void checkInValidISBN() {
		ValidateISBN validator= new ValidateISBN();
		boolean result = validator.checkAValidISBN(140449117);
		assertFalse(result);
	}


}
