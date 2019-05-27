package us.inest.epi.tree;

import java.util.ArrayList;
import java.util.List;

import us.inest.epi.common.TreeNode;

public class FindKLargestInBST {
	public static List<Integer> findKLargestInBST(TreeNode root, int k) {
		List<Integer> kLargestElements = new ArrayList<>();
		findKLargestInBSTHelper(root, k, kLargestElements);
		return kLargestElements;
	}

	private static void findKLargestInBSTHelper(TreeNode root, int k, List<Integer> kLargestElements) {
		if (root != null && kLargestElements.size() < k) {
			findKLargestInBSTHelper(root.right, k, kLargestElements);
			if (kLargestElements.size() < k) {
				kLargestElements.add(root.data);
				findKLargestInBSTHelper(root.left, k, kLargestElements);
			}
		}
	}
}
