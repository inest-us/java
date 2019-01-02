package us.inest.epi.test.c5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import us.inest.epi.main.c5.CanReachEnd;

class CanReachEndTest {

	@Test
	void cannotReachEndInputShouldReturnFalse() {
		boolean result = CanReachEnd.canReachEnd(Arrays.asList(1, 1, 0, 0, 0, 2));
		assertFalse(result);
	}

	@Test
	void canReachEndInputShouldReturnFalse() {
		boolean result = CanReachEnd.canReachEnd(Arrays.asList(3, 3, 1, 0, 2, 0, 1));
		assertTrue(result);
	}
}
