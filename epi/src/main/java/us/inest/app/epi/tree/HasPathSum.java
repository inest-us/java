package us.inest.app.epi.tree;

import us.inest.app.epi.common.TreeNode;

public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        
        //check leaf node
        if (root.left == null && root.right == null) {
            return root.data == targetSum;
        }

        //recursive calls
        boolean leftResult = hasPathSum(root.left, targetSum - root.data);
        if (leftResult == true) return true;

        return hasPathSum(root.right, targetSum - root.data);
    }

}
