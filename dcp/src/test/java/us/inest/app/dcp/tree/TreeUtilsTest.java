package us.inest.app.dcp.tree;

import static org.junit.Assert.*;
import org.junit.Test;

public class TreeUtilsTest {
	@Test
	public void testInitBST() {
		TreeNode root = TreeUtils.initBST(new int[] {2, 1, 3});
		assertEquals(2, root.val);
		assertEquals(1, root.left.val);
		assertEquals(3, root.right.val);
	}
}
