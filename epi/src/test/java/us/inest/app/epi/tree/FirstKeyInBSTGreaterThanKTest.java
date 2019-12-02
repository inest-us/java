package us.inest.app.epi.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import us.inest.app.epi.common.TreeNode;
import us.inest.app.epi.common.TreeUtils;

public class FirstKeyInBSTGreaterThanKTest {
    @Test
    public void testFindFirstKeyInBSTGreaterThanK() {
        TreeNode root = null;
        root = TreeUtils.init(root, new int[] { 19, 7, 43, 3, 11, 23, 47, 2, 5, 17, 37, 53, 13, 29, 41, 31 });
        TreeNode result = FirstKeyInBSTGreaterThanK.findFirstKeyInBSTGreaterThanK(root, 23);
        assertEquals(29, result.data);
    }
}
