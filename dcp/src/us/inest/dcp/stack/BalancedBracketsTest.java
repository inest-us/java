package us.inest.dcp.stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BalancedBracketsTest {

	@Test
	void balancedBracketsShouldReturnTrue() {
		String str = "([])[]({})";
		boolean isBalanced = BalancedBrackets.checkBalanced(str);
		assertTrue(isBalanced);
	}

	@Test
	void unBalancedBracketsShouldReturnFalse() {
		String str = "((()";
		boolean isBalanced = BalancedBrackets.checkBalanced(str);
		assertFalse(isBalanced);
	}
}
