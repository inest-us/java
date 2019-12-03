package us.inest.app.ppj.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelTraversal {
    public void level_traversal(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode n = queue.poll();
            if (n.left != null) {
                queue.add(n.left);
            }
            if (n.right != null) {
                queue.add(n.right);
            }
            System.out.println(n.value);
        }
    }

    public void level_traversal_with_separation_token(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        queue.add(null); // using null as a LEVEL_TOKEN
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                if (!queue.isEmpty()) {
                    System.out.println("END LEVEL");
                    queue.add(null); // Add a LEVEL_TOKEN
                }
                continue;
            }
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            System.out.println(node.value);
        }
    }
}
