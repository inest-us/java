package us.inest.epi.tree;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import us.inest.epi.common.TreeNode;
import us.inest.epi.common.TreeUtils;

class FindKLargestInBSTTest {

    @Test
    void testFindKLargestInBST() {
        TreeNode root = null;
        root = TreeUtils.init(root, new int[] { 19, 7, 43, 3, 11, 23, 47, 2, 5, 17, 37, 53, 13, 29, 41, 31 });
        List<Integer> kLargestElements = FindKLargestInBST.findKLargestInBST(root, 4);
        assertNotNull(kLargestElements);
    }

}
