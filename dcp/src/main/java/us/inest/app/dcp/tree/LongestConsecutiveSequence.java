package us.inest.app.dcp.tree;

public class LongestConsecutiveSequence {
    Integer max;
    public int longestConsecutive(TreeNode root) {
        findLongestConsecutive(root, 0, 0, max);
        return max;
    }
    
    private void findLongestConsecutive(TreeNode root, int count, int target, Integer max) {
        if (root == null) {
            return;
        }
        if (root.val == target) {
            count++;
        } else {
            count = 1;
        }
        max = Math.max(max, count);
        findLongestConsecutive(root.left, count, root.val + 1, max);
        findLongestConsecutive(root.right, count, root.val + 1, max);
    }

}
