package us.inest.epi.sorting;

import java.util.List;

public class MergeTwoSortedArrays {
	public static void mergeTwoSortedArrays(List<Integer> a, int m, List<Integer> b, int n) {
		int i = m - 1;
		int j = n - 1;
		int index = m + n - 1;
		while (i >= 0 && j >= 0) {
			if (a.get(i) > b.get(j)) {
				a.set(index--, a.get(i--));
			} else {
				a.set(index--, b.get(j--));
			}
		}
		while (j >= 0) {
			a.set(index--, b.get(j--));
		}
	}
}
