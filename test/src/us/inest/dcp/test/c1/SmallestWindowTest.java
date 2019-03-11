package us.inest.dcp.test.c1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import us.inest.dcp.c1.SmallestWindow;

class SmallestWindowTest {

	@Test
	void findSmallestWindowTest() {
		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 9));
		SmallestWindow obj = new SmallestWindow();
		obj.findSmallestWindow(arr);
		assertEquals(1, (int) obj.left);
		assertEquals(3, (int) obj.right);
	}
	
	@Test
	void findSmallestWindowV2Test() {
		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 9));
		SmallestWindow obj = new SmallestWindow();
		obj.findSmallestWindowV2(arr);
		assertEquals(1, (int) obj.left);
		assertEquals(3, (int) obj.right);
	}
	
	@Test
	void findSmallestWindowV2Test_NeedToSortAllArray() {
		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(9, 7, 5, 6, 3));
		SmallestWindow obj = new SmallestWindow();
		obj.findSmallestWindowV2(arr);
		assertEquals(0, (int) obj.left);
		assertEquals(4, (int) obj.right);
	}
}
