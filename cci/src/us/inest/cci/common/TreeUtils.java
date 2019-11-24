package us.inest.cci.common;

import java.util.ArrayList;
import java.util.List;

public class TreeUtils {

    public static TreeNode<Integer> init(TreeNode<Integer> root, int[] input) {
        for (int data : input) {
            root = bstInsert(root, data);
        }
        return root;
    }

    public static TreeNode<Integer> bstInsert(TreeNode<Integer> root, int data) {
        TreeNode<Integer> n = new TreeNode<Integer>(data);
        if (root == null) {
            return n;
        }
        if (data < root.data) {
            // insert data into the left subtree
            root.left = bstInsert(root.left, data);
        } else {
            // insert data into the right subtree
            root.right = bstInsert(root.right, data);
        }
        return root;
    }

    public static List<Integer> inOrder(TreeNode<Integer> root) {
        List<Integer> result = new ArrayList<Integer>();
        inOrderHelper(root, result);
        return result;
    }

    private static void inOrderHelper(TreeNode<Integer> root, List<Integer> result) {
        if (root == null) {
            return;
        }
        inOrderHelper(root.left, result);
        result.add(root.data);
        inOrderHelper(root.right, result);
    }
}
