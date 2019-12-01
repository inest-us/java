package us.inest.app.epi.tree;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import us.inest.app.epi.common.TreeNode;

public class BuildMinHeightBSTTest {
    @Test
    public void testBuildMinHeightBST() {
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23));
        TreeNode root = BuildMinHeightBST.buildMinHeightBST(arr);
        assertEquals(11, root.data);
        assertEquals(3, root.left.data);
        assertEquals(17, root.right.data);
    }
}
