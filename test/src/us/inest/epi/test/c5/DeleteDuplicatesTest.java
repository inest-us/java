package us.inest.epi.test.c5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import us.inest.epi.main.c5.DeleteDuplicates;

class DeleteDuplicatesTest {
	
	@Test
	void noDuplicateTest() {
		int count = DeleteDuplicates.deleteDuplicates(Arrays.asList(1, 2, 3, 4));
		assertEquals(4, count);
	}

	@Test
	void emptyArrayTest() {
		int count = DeleteDuplicates.deleteDuplicates(Arrays.asList());
		assertEquals(0, count);
	}
	
	@Test
	void duplicatesTest() {
		int count = DeleteDuplicates.deleteDuplicates(Arrays.asList(2, 3, 5, 5, 7, 11, 11, 13));
		assertEquals(6, count);
	}

}
