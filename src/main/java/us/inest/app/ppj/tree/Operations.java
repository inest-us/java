package us.inest.app.ppj.tree;

public class Operations {
    /*
     * Insert into a Binary Search Tree
     */
    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            // empty tree
            return new TreeNode(val);
        }
        if (val < root.value) {
            // insert into the left sub-tree
            root.left = insert(root.left, val);
        } else {
            // insert into the right sub-tree
            root.right = insert(root.right, val);
        }
        return root;
    }

    /*
     * Find a Node with value equals to val in a BST
     */
    public TreeNode find(TreeNode root, int val) {
        if (root == null || root.value == val) {
            return root;
        }

        if (val < root.value) {
            // find in the left sub-tree
            return find(root.left, val);
        } else {
            // find in the right sub-tree
            return find(root.right, val);
        }
    }

    public TreeNode find_parent(TreeNode root, TreeNode target) {
        if (root == target) {
            return null; // root does not have parent
        }
        while (root.left != target && root.right != target) {
            if (target.value < root.value) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return root;
    }

    public TreeNode find_successor(TreeNode root, TreeNode target) {
        TreeNode successor = target.right;

        if (successor != null) {
            // find the left-most node of the right sub-tree
            while (successor.left != null) {
                successor = successor.left;
            }
            return successor;
        }

        do {
            if (successor != null) {
                target = successor;
            }
            successor = find_parent(root, target);
        } while (successor != null && successor.right == target);

        return successor;
    }

    public TreeNode remove(TreeNode root, TreeNode target) {
        // if target has 2 children
        if (target.left == null && target.right == null) {
            TreeNode next = find_successor(root, target);
            int data = next.value;
            remove(root, next);
            target.value = data;
            return root;
        }
        // if target has one child
        if (target.left != null || target.right != null) {
            TreeNode temp = (target.left != null) ? target.left : target.right;
            target.value = temp.value;
            target.left = temp.left;
            target.right = temp.right;
            return root;
        }
        // if target is a leaf node
        if (root == target) {
            return null;
        }
        TreeNode parent = find_parent(root, target);
        if (parent.left == target) {
            parent.left = null;
        } else {
            parent.right = null;
        }
        return root;
    }
}
