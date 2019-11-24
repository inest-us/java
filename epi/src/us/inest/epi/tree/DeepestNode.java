package us.inest.epi.tree;

import us.inest.epi.common.TreeNode;

public class DeepestNode {
    public TreeNode findDeepestNode(TreeNode root) {
        Integer maxLevel = -1;
        TreeNode result = null;
        findDeepestNodeHelper(root, 0, maxLevel, result);
        return result;
    }

    private void findDeepestNodeHelper(TreeNode root, Integer level, Integer maxLevel, TreeNode result) {
        if (root == null) {
            return;
        }

        Integer nextLevel = level + 1;
        findDeepestNodeHelper(root.left, nextLevel, maxLevel, result);

        // process root
        if (level > maxLevel) {
            result = root;
            maxLevel = level;
        }

        findDeepestNodeHelper(root.right, nextLevel, maxLevel, result);
    }

    public TreeNode findDeepestNodeV2(TreeNode root) {
        int height = getHeight(root);
        return findDeepestNodeV2Helper(root, height);
    }

    public TreeNode findDeepestNodeV2Helper(TreeNode root, int level) {
        if (root == null) {
            return null;
        }
        if (level == 1) {
            return root;
        }
        TreeNode leftResult = findDeepestNodeV2Helper(root.left, level - 1);
        if (leftResult != null) {
            return leftResult;
        }
        TreeNode rightResult = findDeepestNodeV2Helper(root.right, level - 1);
        if (rightResult != null) {
            return rightResult;
        }
        return null;
    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
