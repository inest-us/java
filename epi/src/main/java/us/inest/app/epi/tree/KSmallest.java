package us.inest.app.epi.tree;

import us.inest.app.epi.common.TreeNode;
import java.util.*;

public class KSmallest {
    
    public static int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        int n = 0;
        TreeNode cur = root;
        while (cur != null && !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            n++;
            if (n == k) {
                return cur.data; // this the kth-smallest value
            }
            cur = cur.right;
        }
        
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
