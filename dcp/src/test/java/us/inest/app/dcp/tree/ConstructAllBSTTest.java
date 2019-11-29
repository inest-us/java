package us.inest.app.dcp.tree;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class ConstructAllBSTTest {
    @Test
    public void testConstructAllBST() {
        int n = 3;
        List<TreeNode> trees = ConstructAllBST.constructAllBST(n);
        assertEquals(5, trees.size());
    }
}
