package us.inest.dcp.c1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductsOfAllOtherElements {
	
	public static List<Long> findProductsOfAllOtherElements(List<Long> arr) {
		List<Long> result = new ArrayList<>();
		
		//Generate prefix_product
		List<Long> prefix_product = new ArrayList<>();
		long prefix = 1;
		for (int i = 0; i < arr.size(); i++) {
			prefix *= arr.get(i);
			prefix_product.add(prefix);
		}
		
		//Generate suffix_product
		List<Long> suffix_product = new ArrayList<>();
		long suffix = 1;
		List<Long> reversed = new ArrayList<>(arr);
		Collections.reverse(reversed);
		for (int i = 0; i < reversed.size(); i++) {
			suffix *= reversed.get(i);
			suffix_product.add(suffix);
		}
		Collections.reverse(suffix_product);
		
		//Generate result
		for (int i = 0; i < arr.size(); i++) {
			if (i == 0) {
				result.add(suffix_product.get(i + 1));
			} else if (i == arr.size() - 1) {
				result.add(prefix_product.get(i - 1));
			} else {
				result.add(prefix_product.get(i - 1) * suffix_product.get(i + 1));
			}
		}
		return result;
	}
}
