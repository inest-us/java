package us.inest.epi.main.c5;

import java.util.List;

public class CanReachEnd {
	public static boolean canReachEnd(List<Integer> arr) {
		int furthestReachSofar = 0;
		int lastIndex = arr.size() - 1;
		//visit each element in the array and compute the maximum reach from each element
		for (int i = 0; i <= furthestReachSofar && furthestReachSofar < lastIndex; i++) {
			furthestReachSofar = Math.max(furthestReachSofar, i + arr.get(i));
		}
		return furthestReachSofar >= lastIndex;
	}
}
