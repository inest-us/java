package us.inest.cci.main.c4;

public class SubTree {
	/*
	 * Check if r1 contains r2
	 */
	public boolean containsTree(TreeNode r1, TreeNode r2) {
		if (r2 == null) {
			return true;
		}
		return subTree(r1, r2);
	}
	
	/*
	 * Check if r2 is a subtree of r1
	 */
	private boolean subTree(TreeNode r1, TreeNode r2) {
		if (r1 == null) {
			//large tree is empty, cannot contains smaller tree
			return false;
		} else if (r1.data == r2.data && matchTree(r1, r2)) {
			return true;
		}
		return subTree(r1.left, r2) || subTree(r1.right, r2);
	}
	
	/*
	 * Check if r1 and r2 are matched
	 */
	private boolean matchTree(TreeNode r1, TreeNode r2) {
		if (r1 == null && r2 == null) {
			return true;
		} else if (r1 != null && r2 != null) {
			if (r1.data != r2.data) {
				return false;
			} else {
				return matchTree(r1.left, r2.left) && matchTree(r1.right, r2.right);
			}
		}
		return false;
	}
}