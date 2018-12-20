package us.inest.epi.main.c5;

import java.util.ArrayList;
import java.util.List;

public class AddNumbers {
	public static List<Integer> add(List<Integer> a, List<Integer> b) {
		List<Integer> result = new ArrayList<> ();
		int sum = 0;
		int carry = 0;
		int i = 0;
		while (i < a.size() || i < b.size()) {
			sum = (i < a.size() ? a.get(i) : 0) 
				+ (i < b.size() ? b.get(i) : 0) + carry;
			result.add(sum % 10);
			carry = sum / 10;
			i++;
		}
		if (carry > 0) {
			result.add(carry);
		}
		return result;
	}
}
