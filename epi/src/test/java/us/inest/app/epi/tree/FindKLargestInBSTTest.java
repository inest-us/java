package us.inest.app.epi.tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import us.inest.app.epi.common.TreeNode;
import us.inest.app.epi.common.TreeUtils;

public class FindKLargestInBSTTest {
    @Test
    public void testFindKLargestInBST() {
        TreeNode root = null;
        root = TreeUtils.init(root, new int[] { 19, 7, 43, 3, 11, 23, 47, 2, 5, 17, 37, 53, 13, 29, 41, 31 });
        List<Integer> kLargestElements = FindKLargestInBST.findKLargestInBST(root, 4);
        assertNotNull(kLargestElements);
        assertEquals(4, kLargestElements.size());
    }
}
