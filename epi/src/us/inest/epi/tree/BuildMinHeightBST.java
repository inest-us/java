package us.inest.epi.tree;

import java.util.List;

import us.inest.epi.common.TreeNode;

public class BuildMinHeightBST {
    public static TreeNode buildMinHeightBST(List<Integer> arr) {
        return buildMinHeightBSTHelper(arr, 0, arr.size() - 1);
    }

    private static TreeNode buildMinHeightBSTHelper(List<Integer> arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        return new TreeNode(arr.get(mid), buildMinHeightBSTHelper(arr, start, mid - 1),
                buildMinHeightBSTHelper(arr, mid + 1, end));
    }
}
