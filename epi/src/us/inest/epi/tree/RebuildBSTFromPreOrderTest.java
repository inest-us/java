package us.inest.epi.tree;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import us.inest.epi.common.TreeNode;

class RebuildBSTFromPreOrderTest {

    @Test
    void testRebuildBSTFromPreorder() {
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(43, 23, 37, 29, 31, 41, 47, 53));
        TreeNode root = RebuildBSTFromPreorder.rebuildBSTFromPreorder(arr);
        assertEquals(43, root.data);
        assertEquals(23, root.left.data);
        assertEquals(47, root.right.data);
    }

}
