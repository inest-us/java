package us.inest.epi.tree;

import us.inest.epi.common.TreeNode;

public class CheckBST {
    public static boolean isBinaryTreeBST(TreeNode root) {
        return checkBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean checkBSTHelper(TreeNode root, int minValue, int maxValue) {
        if (root == null) {
            return true;
        }
        if (root.data < minValue || root.data > maxValue) {
            return false;
        }
        return checkBSTHelper(root.left, minValue, root.data) && checkBSTHelper(root.right, root.data, maxValue);
    }
}
