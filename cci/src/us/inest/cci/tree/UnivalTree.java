package us.inest.cci.tree;

import us.inest.cci.common.TreeNode;

public class UnivalTree {
	public int countUnivalSubTrees(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int left = countUnivalSubTrees(root.left);
		int right = countUnivalSubTrees(root.right);
		return isUnival(root) ? 1 + left + right : left + right;
	}
	private boolean isUnival(TreeNode<Integer> root) {
		if (root == null) {
			return true;
		}
		return isUnivalHelper(root, root.data);
	}
	
	private boolean isUnivalHelper(TreeNode<Integer> root, int data) {
		if (root == null) {
			return true;
		}
		if (root.data == data) {
			return isUnivalHelper(root.left, data) && isUnivalHelper(root.right, data);
		}
		return false;
	}
	
	public int countUnivalSubTreesV2(TreeNode<Integer> root) {
		return countUnivalSubTreesV2helper(root).count;
	}
	
	public ReturnValue countUnivalSubTreesV2helper(TreeNode<Integer> root) {
		if (root == null) {
			return new ReturnValue(0, true);
		}
		ReturnValue leftResult = countUnivalSubTreesV2helper(root.left);
		ReturnValue rightResult = countUnivalSubTreesV2helper(root.right);
		int totalCount = leftResult.count + rightResult.count;
		if (leftResult.isUnival && rightResult.isUnival) {
			if (root.left != null && root.data != root.left.data) {
				return new ReturnValue(totalCount, false);
			}
			if (root.right != null && root.data != root.right.data) {
				return new ReturnValue(totalCount, false);
			}
			return new ReturnValue(totalCount + 1, true);
		}
		return new ReturnValue(totalCount, false);
	}
	
	private class ReturnValue {
		public ReturnValue(int count, boolean isUnival) {
			this.count = count;
			this.isUnival = isUnival;
		}
		public int count;
		public boolean isUnival;
	}
}


