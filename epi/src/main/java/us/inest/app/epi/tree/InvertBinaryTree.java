package us.inest.app.epi.tree;

import us.inest.app.epi.common.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        // Base case
        if (root == null) {
            return null;
        }
        
        //swap 2 children
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        
        // Recursive calls
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }

}
