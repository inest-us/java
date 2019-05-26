package us.inest.epi.sorting;

import java.util.Collections;
import java.util.List;

public class SmallestNonconstructibleValue {
	public static int smallestNonconstructibleValue(List<Integer> arr) {
		Collections.sort(arr);
		int maxConstructibleValue = 0;
		for (int a : arr) {
			if (a > maxConstructibleValue + 1) {
				break;
			}
			maxConstructibleValue += a;
		}
		return maxConstructibleValue + 1;
	}
}
