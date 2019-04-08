package inest.us.epi.test.c12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import us.inest.epi.main.c12.CanFormPalindrome;

class CanFormPalindromeTest {
	CanFormPalindrome obj = new CanFormPalindrome();
	
	@Test
	void validInputShouldReturnTrue() {
		String s = "edified";
		boolean result = obj.canFormPalindrome(s);
		assertTrue(result);
	}

	@Test
	void invalidInputShouldReturnFalse() {
		String s = "12345";
		boolean result = obj.canFormPalindrome(s);
		assertFalse(result);
	}
}
