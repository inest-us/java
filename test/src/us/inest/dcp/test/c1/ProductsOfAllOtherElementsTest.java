package us.inest.dcp.test.c1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import us.inest.dcp.c1.ProductsOfAllOtherElements;

class ProductsOfAllOtherElementsTest {

	@Test
	void findProductsOfAllOtherElementsTest() {
		List<Long> arr = new ArrayList<Long>(Arrays.asList(1L, 2L, 3L, 4L, 5L));
		List<Long> result = ProductsOfAllOtherElements.findProductsOfAllOtherElements(arr);
		List<Long> expected = new ArrayList<Long>(Arrays.asList(120L, 60L, 40L, 30L, 24L));
		assertEquals(expected, result);
	}
}
