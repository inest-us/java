package us.inest.app.epi.tree;

import java.util.List;

import us.inest.app.epi.common.TreeNode;

public class RebuildBSTFromPreorder {
    public static TreeNode rebuildBSTFromPreorder(List<Integer> arr) {
        return rebuildBSTFromPreorderHelper(arr, 0, arr.size());
    }

    private static TreeNode rebuildBSTFromPreorderHelper(List<Integer> arr, int start, int end) {
        // base case
        if (start >= end) {
            return null;
        }
        int transitionPoint = start + 1;
        while (transitionPoint < end && arr.get(transitionPoint) < arr.get(start)) {
            transitionPoint++;
        }
        return new TreeNode(arr.get(start), rebuildBSTFromPreorderHelper(arr, start + 1, transitionPoint),
                rebuildBSTFromPreorderHelper(arr, transitionPoint, end));
    }
}
