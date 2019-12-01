package us.inest.app.epi.tree;

import us.inest.app.epi.common.TreeNode;

public class FindLCAInBST {
    public static TreeNode findLCA(TreeNode root, TreeNode s, TreeNode b) {
        TreeNode smaller = s.data < b.data ? s : b;
        TreeNode larger = s.data < b.data ? b : s;
        TreeNode p = root;
        while (p.data < smaller.data || p.data > larger.data) {
            // keep searching since p is outside of [smaller, larger]
            while (p.data < smaller.data) { // LCA must be on the right subtree
                p = p.right; 
            }
            while (p.data > larger.data) { // LCA must be on the left subtree
                p = p.left; 
            }
        }
        // now smaller.data <= p <= larger.data
        return p;
    }
}
