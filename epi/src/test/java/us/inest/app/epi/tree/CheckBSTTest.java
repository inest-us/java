package us.inest.app.epi.tree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import us.inest.app.epi.common.TreeNode;
import us.inest.app.epi.common.TreeUtils;

public class CheckBSTTest {
    @Test
    public void validBSTShouldReturnTrue() {
        TreeNode root = null;
        root = TreeUtils.init(root, new int[] { 19, 7, 43, 3, 11, 23, 47, 2, 5, 17, 37, 53, 13, 29, 41, 31 });
        boolean result = CheckBST.isBinaryTreeBST(root);
        assertTrue(result);
    }
    
    @Test
    public void inValidBSTShouldReturnFalse() {
        TreeNode root = null;
        root = TreeUtils.init01();
        boolean result = CheckBST.isBinaryTreeBST(root);
        assertFalse(result);
    }
}
