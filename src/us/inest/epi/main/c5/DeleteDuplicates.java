package us.inest.epi.main.c5;

import java.util.List;

public class DeleteDuplicates {
	public static int deleteDuplicates(List<Integer> arr) {
		if (arr == null || arr.isEmpty()) {
			return 0; //there are no elements in null or empty array
		}
		
		int writeIndex = 1;
		for (int i = 1; i < arr.size(); i++) {
			if (!arr.get(writeIndex - 1).equals(arr.get(i))) {
				arr.set(writeIndex++, arr.get(i));
			}
		}
		return writeIndex; //number of unique elements
	}
}
