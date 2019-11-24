package us.inest.epi.tree;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import us.inest.epi.common.TreeNode;

class BuildMinHeightBSTTest {

    @Test
    void testBuildMinHeightBST() {
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23));
        TreeNode root = BuildMinHeightBST.buildMinHeightBST(arr);
        assertEquals(11, root.data);
        assertEquals(3, root.left.data);
        assertEquals(17, root.right.data);
    }
}
