package us.inest.app.epi.tree;

import java.util.*;

import us.inest.app.epi.common.TreeNode;
import us.inest.app.epi.common.TreeUtils;

public class InorderTraversalIter {
    
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        
        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                // push the current node before going to the left
                stack.push(current);
                
                // Going left
                current = current.left;
            } else {
                // going up
                current = stack.pop();
                result.add(current.data);                
                
                // going right
                current = current.right;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = null;
        root = TreeUtils.init(root, new int[] { 19, 7, 43, 3, 11, 23, 47, 2, 5, 17, 37, 53, 13, 29, 41, 31 });
        
        List<Integer> result = inorderTraversal(root);
    }

}
