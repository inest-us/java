package us.inest.epi.sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class AddIntervalTest {

	@Test
	void testAddInterval() {
		List<Interval> disjointIntervals = new ArrayList<>(Arrays.asList(
				new Interval(-4, -1),
				new Interval(0, 2),
				new Interval(3, 6),
				new Interval(7, 9),
				new Interval(11, 12),
				new Interval(14, 17)
				));
		Interval newInterval = new Interval(1, 8);
		List<Interval> expected = new ArrayList<>(Arrays.asList(
				new Interval(-4, -1),
				new Interval(0, 9),
				new Interval(11, 12),
				new Interval(14, 17)
				));
		List<Interval> actual = AddInterval.addInterval(disjointIntervals, newInterval);
		verifyIntervals(expected, actual);
	}

	private void verifyIntervals(List<Interval> expected, List<Interval> actual) {
		assertEquals(expected.size(), actual.size());
	}
}
