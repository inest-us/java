package us.inest.epi.tree;

import us.inest.epi.common.TreeNode;

public class FindLCA {

    public static TreeNode findLCA(TreeNode root, TreeNode s, TreeNode b) {
        TreeNode smaller = s.data < b.data ? s : b;
        TreeNode larger = s.data < b.data ? b : s;
        TreeNode p = root;
        while (p.data < smaller.data || p.data > larger.data) {
            // keep searching since p is outside of [smaller, larger]
            while (p.data < smaller.data) {
                p = p.right; // LCA must be on the right subtree
            }
            while (p.data > larger.data) {
                p = p.left; // LCA must be on the left subtree
            }
        }
        // now smaller.data <= p <= larger.data
        return p;
    }
}
