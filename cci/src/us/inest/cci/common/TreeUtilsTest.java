package us.inest.cci.common;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class TreeUtilsTest {

	@Test
	void testInsert() {
		TreeNode root = null;
		root = TreeUtils.init(root, new int[] {3, 2, 1, 4, 5});
		List<Integer> result = TreeUtils.inOrder(root);
		assertNotNull(result);
	}

}
