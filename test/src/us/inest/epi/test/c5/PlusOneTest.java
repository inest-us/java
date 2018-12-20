package us.inest.epi.test.c5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import us.inest.epi.main.c5.IncrementInteger;

class PlusOneTest {

	@Test
	void test() {
		List<Integer> result = IncrementInteger.plusOne(new ArrayList<>(Arrays.asList(1, 2, 3)));
		assertEquals(Arrays.asList(1, 2, 4), result);
	}

	@Test
	void test2() {
		List<Integer> result = IncrementInteger.plusOne(new ArrayList<>(Arrays.asList(9, 9, 9)));
		assertEquals(4, result.size());
		assertEquals(Arrays.asList(1, 0, 0, 0), result);
	}
}
