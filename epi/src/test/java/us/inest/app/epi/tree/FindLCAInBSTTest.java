package us.inest.app.epi.tree;

import org.junit.Test;

import us.inest.app.epi.common.TreeNode;
import us.inest.app.epi.common.TreeUtils;

import static org.junit.Assert.*;

public class FindLCAInBSTTest {
    @Test
    public void testFindLCA() {
        TreeNode root = null;
        root = TreeUtils.init(root, new int[] { 19, 7, 43, 3, 11, 23, 47, 2, 5, 17, 37, 53, 13, 29, 41, 31 });
        TreeNode s = new TreeNode(3);
        TreeNode b = new TreeNode(13);
        TreeNode lca = FindLCAInBST.findLCA(root, s, b);
        assertEquals(7, lca.data);
    }
}
