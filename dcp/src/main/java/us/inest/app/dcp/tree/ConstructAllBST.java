package us.inest.app.dcp.tree;

import java.util.ArrayList;
import java.util.List;

public class ConstructAllBST {
    public static List<TreeNode> constructAllBST(int n) {
        return constructAllBSTHelper(1, n);
    }

    private static List<TreeNode> constructAllBSTHelper(int low, int high) {
        List<TreeNode> trees = new ArrayList<>();
        if (low > high) {
            trees.add(null);
            return trees;
        }

        for (int i = low; i <= high; i++) {
            List<TreeNode> left = constructAllBSTHelper(low, i - 1);
            List<TreeNode> right = constructAllBSTHelper(i + 1, high);

            // for every possible left and right subtrees
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode n = new TreeNode(i, l, r);
                    trees.add(n);
                }
            }
        }
        return trees;
    }
}
