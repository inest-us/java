package us.inest.app.dcp.recursion;

import us.inest.app.dcp.tree.TreeNode;

public class SumOfLeftLeaves {
    public static int sumOfLeftLeaves(TreeNode root) {
        // base case
        if (root == null) {
            return 0;
        }

        // left child is a leaf node
        if (root.left != null && root.left.left == null && root.left.right == null) {

            return root.left.val + sumOfLeftLeaves(root.right);
        }

        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
