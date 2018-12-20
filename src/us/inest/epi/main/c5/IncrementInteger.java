package us.inest.epi.main.c5;

import java.util.List;

public class IncrementInteger {
	/*
	 * time complexity is O(n) where n is the length of A
	 */
	public static List<Integer> plusOne(List<Integer> A) {
		int n = A.size() - 1;
		A.set(n, A.get(n) + 1);
		for (int i = n; i > 0 && A.get(i) == 10; i--) {
			A.set(i, 0);
			A.set(i - 1, A.get(i - 1) + 1);
		}
		if (A.get(0) == 10) {
			//999 + 1 = 1000
			A.set(0, 1); //set the first element to 1
			A.add(0); //add a 0 at the end
		}
		return A;
	}
}
