package us.inest.app.epi.tree;

import us.inest.app.epi.common.TreeNode;
import java.util.*;

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> paths = new ArrayList<>();
        helper(root, targetSum, paths, new ArrayList<>());
        return paths;
    }
    
    private void helper(TreeNode root, int targetSum, List<List<Integer>> paths, List<Integer> path) {
        if (root == null) {
            return;
        }
        
        path.add(root.data);

        // Check leaf node
        if (root.left == null && root.right == null && root.data == targetSum) {
            paths.add(new ArrayList<Integer>(path));
        } else {
            helper(root.left, targetSum - root.data, paths, path);
            helper(root.right, targetSum - root.data, paths, path);
        }
        
        //backtrack
        path.remove(path.size() - 1);
    }

}
