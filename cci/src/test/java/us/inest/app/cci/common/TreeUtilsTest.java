package us.inest.app.cci.common;

import static org.junit.Assert.assertNotNull;
import java.util.List;
import org.junit.Test;

public class TreeUtilsTest {
    @Test
    public void testInsert() {
        TreeNode<Integer> root = null;
        root = TreeUtils.init(root, new int[] { 3, 2, 1, 4, 5 });
        List<Integer> result = TreeUtils.inOrder(root);
        assertNotNull(result);
    }
}
