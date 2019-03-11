package us.inest.dcp.c1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmallestWindow {
	public  Integer left;
	public  Integer right;
	
	public SmallestWindow() {
		this.left = null;
		this.right = null;
	}
	
	public  void findSmallestWindow(List<Integer> arr) {
		List<Integer> sorted = new ArrayList<>(arr);
		Collections.sort(sorted);
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) != sorted.get(i) && left == null) {
				left = i;
			} else if (arr.get(i) != sorted.get(i)) {
				right = i;
			}
		}
	}
	
	public  void findSmallestWindowV2(List<Integer> arr) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		//find the index of last element (from left to right) that is less than the running maximum => right bound
		for (int i = 0; i < arr.size(); i++) {
			max = Math.max(max, arr.get(i));
			if (arr.get(i) < max) {
				right = i;
			}
		}
		
		//find the index of the last element (from right to left) that is greater than the running minimum => left bound 
		for (int i = arr.size() - 1; i >= 0; i--) {
			min = Math.min(min, arr.get(i));
			if (arr.get(i) > min) {
				left = i;
			}
		}
	}
}
