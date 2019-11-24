package us.inest.epi.common;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class TreeUtilsTest {

    @Test
    void testInsert() {
        TreeNode root = null;
        root = TreeUtils.init(root, new int[] { 19, 7, 43, 3, 11, 23, 47, 2, 5, 17, 37, 53, 13, 29, 41, 31 });
        List<Integer> result = TreeUtils.inOrder(root);
        assertNotNull(result);
    }

}
