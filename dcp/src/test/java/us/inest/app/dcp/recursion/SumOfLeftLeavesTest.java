package us.inest.app.dcp.recursion;

import static org.junit.Assert.*;
import org.junit.Test;

import us.inest.app.dcp.tree.TreeNode;

public class SumOfLeftLeavesTest {
    @Test
    public void testInitBST() {
        TreeNode n9 = new TreeNode(9);
        TreeNode n15 = new TreeNode(15);
        TreeNode n7 = new TreeNode(7);
        TreeNode n20 = new TreeNode(20, n15, n7);
        TreeNode root = new TreeNode(3, n9, n20);

        int sum = SumOfLeftLeaves.sumOfLeftLeaves(root);
        assertEquals(24, sum);
    }
}
