package us.inest.epi.test.c5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import us.inest.epi.main.c5.AddNumbers;

class AddNumbersTest {

	@Test
	void test() {
		List<Integer> sum = AddNumbers.add(new ArrayList<>(Arrays.asList(3, 2, 1)), 
				new ArrayList<>(Arrays.asList(4, 3, 2)));
		assertEquals(Arrays.asList(7, 5, 3), sum);
	}
	
	@Test
	void test2() {
		List<Integer> sum = AddNumbers.add(new ArrayList<>(Arrays.asList(3, 2, 1)), 
				new ArrayList<>(Arrays.asList(4, 3)));
		assertEquals(Arrays.asList(7, 5, 1), sum);
	}
	
	@Test
	void test3() {
		List<Integer> sum = AddNumbers.add(new ArrayList<>(Arrays.asList(3, 2)), 
				new ArrayList<>(Arrays.asList(4, 3, 2)));
		assertEquals(Arrays.asList(7, 5, 2), sum);
	}
	
	@Test
	void test4() {
		List<Integer> sum = AddNumbers.add(new ArrayList<>(Arrays.asList(3, 2, 1)), 
				new ArrayList<>(Arrays.asList(7, 3, 9)));
		assertEquals(Arrays.asList(0, 6, 0, 1), sum);
	}
}
