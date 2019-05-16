package us.inest.epi.searching;

import java.util.List;

public class SearchFirst {
	public static int searchFirstOfK(List<Integer> arr, int value) {
		int left = 0;
		int right = arr.size() - 1;
		int result = -1;
		while (left <= right) {
			int mid = left + ((right - left) / 2);
			if (arr.get(mid) > value) {
				right = mid - 1;
			} else if (arr.get(mid) == value) {
				result = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return result;
	}
}
