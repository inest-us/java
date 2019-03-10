package us.inest.epi.main.c5;

import java.util.Collections;
import java.util.List;

public class Rearrange {
	public static void rearrange(List<Integer> arr) {
		for (int i = 1; i < arr.size(); i++) {
			if (((i % 2 == 0) && arr.get(i -1) < arr.get(i)) || 
				((i % 2 != 0) && arr.get(i - 1) > arr.get(i))) {
				Collections.swap(arr, i - 1, i);
			}
		}
	}
}
