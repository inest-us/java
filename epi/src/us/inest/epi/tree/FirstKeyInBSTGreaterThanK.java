package us.inest.epi.tree;

import us.inest.epi.common.TreeNode;

public class FirstKeyInBSTGreaterThanK {
    public static TreeNode findFirstKeyInBSTGreaterThanK(TreeNode root, int k) {
        TreeNode n = root;
        TreeNode firstSoFar = null;
        while (n != null) {
            if (n.data > k) {
                firstSoFar = n;
                n = n.left;
            } else {
                n = n.right;
            }
        }
        return firstSoFar;
    }
}
