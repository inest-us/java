package us.inest.epi.test.c5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import us.inest.epi.main.c5.Rearrange;

class RearrangeTest {

	@Test
	void rearrangeTest() {
		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5));
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(0, 2, 1, 4, 3, 5));
		Rearrange.rearrange(arr);
		assertEquals(expected, arr);
	}

}
