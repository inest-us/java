package us.inest.app.epi.tree;

import us.inest.app.epi.common.TreeNode;
import us.inest.app.epi.common.TreeUtils;

public class SymmetricTree {
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        return isSymmetricHelper(root.left, root.right);
    }

    private static boolean isSymmetricHelper(TreeNode subTree0, TreeNode subTree1) {
        if (subTree0 == null && subTree1 == null) {
            return true;
        } else if (subTree0 != null && subTree1 != null) {
            return (subTree0.data == subTree1.data) && isSymmetricHelper(subTree0.left, subTree1.right) && isSymmetricHelper(subTree0.right, subTree1.left);
        }
        return false;
    }
    
    public static void main(String[] args) {
        TreeNode symmetricTree = TreeUtils.initSymmetricTree();
        System.out.println(isSymmetric(symmetricTree)); // true
        
        TreeNode aSymmetricTree = TreeUtils.init01();
        System.out.println(isSymmetric(aSymmetricTree)); // false
    }

}
