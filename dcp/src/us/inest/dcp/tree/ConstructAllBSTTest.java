package us.inest.dcp.tree;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import us.inest.dcp.common.TreeNode;

class ConstructAllBSTTest {

    @Test
    void testConstructAllBST() {
        int n = 3;
        List<TreeNode> trees = ConstructAllBST.constructAllBST(n);
        assertEquals(5, trees.size());
    }

}
