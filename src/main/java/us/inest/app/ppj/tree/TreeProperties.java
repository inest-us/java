package us.inest.app.ppj.tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class TreeProperties {
    /*
     * return the number of nodes
     */
    public int size(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + size(root.left) + size(root.right);
    }

    /*
     * using a queue Breath-First-Search
     */
    public int size_iterative(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode front = q.poll();
            count++;
            if (front.left != null) {
                q.add(front.left);
            }
            if (front.right != null) {
                q.add(front.right);
            }
        }
        return count;
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return -1;
        }
        return 1 + Math.max(depth(root.left), depth(root.right));
    }

    /*
     * using a stack Depth-First-Search
     */
    public int depth_iterative(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int max_depth = 0;
        Set<TreeNode> visited = new HashSet<TreeNode>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);
        while (!s.isEmpty()) {
            TreeNode top = s.peek();
            // process current node
            if (top.left != null && !visited.contains(top.left)) {
                s.push(top.left);
            } else if (top.right != null && !visited.contains(top.right)) {
                s.push(top.right);
            } else {
                // done with visiting current node
                visited.add(top);
                max_depth = Math.max(max_depth, s.size());
                s.pop(); //backtrack so that we can check another path
            }
        }
        return max_depth;
    }

    /*
     * to determine whether or not a binary tree is balanced we must evaluate
     * whether or not every sub-tree is balanced.
     */
    public boolean balanced_naive(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (!balanced_naive(root.left) || !balanced_naive(root.right)) {
            return false;
        }
        int left_depth = depth(root.left);
        int right_depth = depth(root.right);
        return Math.abs(right_depth - left_depth) <= 1;
    }

    /*
     * A linear solution would require modifying the recursion to return the depth
     * of the sub-tree as well as if it is balanced or not
     */
    public boolean balanced_depth(TreeNode root, int[] depth) {
        if (root == null) {
            depth[0] = 0;
            return true;
        }
        /*
         * Note that since Java does not allow primitives or immutable objects to be
         * passed by reference We wrap the primitive integer within an int[] to pass the
         * depth by reference
         */
        int[] left = new int[1];
        int[] right = new int[1];
        if (!balanced_depth(root.left, left)) {
            return false;
        }
        if (!balanced_depth(root.right, right)) {
            return false;
        }

        depth[0] = 1 + Math.max(left[0], right[0]);
        if (Math.abs(left[0] - right[0]) > 1) {
            return false;
        }
        return true;
    }

    public boolean balanced(TreeNode root) {
        int[] depth = new int[1];
        return balanced_depth(root, depth);
    }

    public boolean find_path(TreeNode root, TreeNode target, List<TreeNode> path) {
        if (target == null) {
            return true;
        }
        while (root != null && (path.isEmpty() || path.get(path.size() - 1) != target)) {
            path.add(root);
            if (target.value < root.value) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        if (path.get(path.size() - 1) == target) {
            return true; //found a path
        } else {
            path.clear();
            return false; //did not find any path
        }
    }

    public TreeNode lca_from_path(TreeNode root, TreeNode x, TreeNode y) {
        List<TreeNode> x_path = new ArrayList<>();
        List<TreeNode> y_path = new ArrayList<>();
        find_path(root, x, x_path);
        find_path(root, y, y_path);

        TreeNode lca = null;
        Iterator<TreeNode> x_path_iterator = x_path.iterator();
        Iterator<TreeNode> y_path_iterator = y_path.iterator();
        TreeNode current_x, current_y;

        while (x_path_iterator.hasNext() && y_path_iterator.hasNext()) {
            current_x = x_path_iterator.next();
            current_y = y_path_iterator.next();
            if (current_x != current_y) {
                break;
            }
            lca = current_x;
        }
        return lca;
    }

    public TreeNode lca_recursive(TreeNode root, TreeNode x, TreeNode y) {
        if (root == null || x == null || y == null) {
            return null;
        }
        if (root.value == x.value || root.value == y.value) {
            return root;
        }
        if ((x.value < root.value && y.value >= root.value) || (y.value < root.value && x.value >= root.value)) {
            return root;
        }
        if (x.value < root.value) {
            return lca_recursive(root.left, x, y);
        }
        return lca_recursive(root.right, x, y);
    }

    public TreeNode lca_iterative(TreeNode root, TreeNode x, TreeNode y) {
        if (x != null && y != null && x.value > y.value) {
            // swap x and y so that y.value > x.value => simplify our if condition
            TreeNode temp = y;
            y = x;
            x = temp;
        }
        while (root != null && root.value != x.value && root.value != y.value
                && (y.value < root.value || x.value >= root.value)) {
            if (y.value < root.value) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return root;
    }
}
