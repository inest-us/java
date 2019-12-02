package us.inest.app.epi.tree;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import us.inest.app.epi.common.TreeNode;

public class RebuildBSTFromPreOrderTest {
    @Test
    public void testRebuildBSTFromPreorder() {
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(43, 23, 37, 29, 31, 41, 47, 53));
        TreeNode root = RebuildBSTFromPreorder.rebuildBSTFromPreorder(arr);
        assertEquals(43, root.data);
        assertEquals(23, root.left.data);
        assertEquals(47, root.right.data);
    }
}
