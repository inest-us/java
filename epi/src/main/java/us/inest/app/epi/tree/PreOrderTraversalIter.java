package us.inest.app.epi.tree;

import java.util.*;

import us.inest.app.epi.common.TreeNode;
import us.inest.app.epi.common.TreeUtils;

public class PreOrderTraversalIter {
    public static List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) {
            stack.push(root);
        }
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            result.add(current.data);
            
            if (current.right != null) {
                stack.push(current.right);
            }
            
            if (current.left != null) {
                stack.push(current.left);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = null;
        root = TreeUtils.init(root, new int[] { 19, 7, 43, 3, 11, 23, 47, 2, 5, 17, 37, 53, 13, 29, 41, 31 });
        
        List<Integer> result = preOrderTraversal(root);

    }

}
