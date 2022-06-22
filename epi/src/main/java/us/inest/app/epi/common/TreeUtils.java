package us.inest.app.epi.common;

import java.util.ArrayList;
import java.util.List;

public class TreeUtils {

    public static TreeNode init(TreeNode root, int[] input) {
        for (int data : input) {
            root = bstInsert(root, data);
        }
        return root;
    }

    public static TreeNode bstInsert(TreeNode root, int data) {
        TreeNode n = new TreeNode(data);
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

    public static List<Integer> inOrder(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        inOrderHelper(root, result);
        return result;
    }

    private static void inOrderHelper(TreeNode root, List<Integer> result) {
        if (root == null) { // base case
            return;
        }
        inOrderHelper(root.left, result);
        result.add(root.data);
        inOrderHelper(root.right, result);
    }
    
    public static List<Integer> preOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrderHelper(root, result);
        return result;
    }
    
    private static void preOrderHelper(TreeNode root, List<Integer> result) {
        if (root == null) { // base case
            return;
        }
        result.add(root.data);
        preOrderHelper(root.left, result);
        preOrderHelper(root.right, result);
    }
    
    public static List<Integer> postOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrderHelper(root, result);
        return result;
    }
    
    private static void postOrderHelper(TreeNode root, List<Integer> result) {
        if (root == null) { // base case
            return;
        }
        postOrderHelper(root.left, result);
        postOrderHelper(root.right, result);
        result.add(root.data);
    }
    
    public static TreeNode init01() {
        TreeNode root = new TreeNode(314);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n271 = new TreeNode(271);
        TreeNode n561 = new TreeNode(561);
        TreeNode n2 = new TreeNode(2);
        TreeNode n272 = new TreeNode(272);
        TreeNode n28 = new TreeNode(28);
        TreeNode n0 = new TreeNode(0);
        TreeNode n3 = new TreeNode(3);
        TreeNode n1 = new TreeNode(1);
        TreeNode n29 = new TreeNode(29);
        TreeNode n17 = new TreeNode(17);
        TreeNode n401 = new TreeNode(401);
        TreeNode n257 = new TreeNode(257);
        TreeNode n641 = new TreeNode(641);
        
        // level 0
        root.left = n6;
        root.right = n7;
        
        // level 1
        n6.left = n271;
        n6.right = n561;
        n7.left = n2;
        n7.right = n272;
        
        // level 2
        n271.left = n28;
        n271.right = n0;
        n561.right = n3;
        n2.right = n1;
        n272.right = n29;
        
        //level 3
        n3.left = n17;
        n1.left = n401;
        n1.right = n257;
        
        // level 4
        n401.right = n641;
        
        return root;
    }
    
    public static TreeNode initSymmetricTree() {
        TreeNode A = new TreeNode(314);
        TreeNode B = new TreeNode(6);
        TreeNode C = new TreeNode(2);
        TreeNode D = new TreeNode(3);
        TreeNode E = new TreeNode(6);
        TreeNode F = new TreeNode(2);
        TreeNode G = new TreeNode(3);
        
        A.left = B;
        A.right = E;
        B.right = C;
        E.left = F;
        C.right = D;
        F.left = G;
        
        return A;
    }
}
