package us.inest.app.epi.tree;

import us.inest.app.epi.common.TreeNode;
import java.util.*;

public class RightSideTreeView {
    public static List<Integer> rightSide(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        TreeNode rightSideNode;
        while (!q.isEmpty()) {
            int currentLevelLength = q.size();
            rightSideNode = null;
            for (int i = 0; i < currentLevelLength; i++) {
                TreeNode node = q.removeFirst();
                if (node != null) {
                    rightSideNode = node;
                    q.add(rightSideNode.left);
                    q.add(rightSideNode.right);
                }
            }
            if (rightSideNode != null) {
                result.add(rightSideNode.data);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
