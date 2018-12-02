package us.inest.cci.main.c4;

public class CheckBST {
	/*
	 * validate if a binary tree is a BST by using the last visited node
	 */
	public boolean isBST(TreeNode root) {
		Integer lastVisited = null;
		return checkBST(root, lastVisited);
	}
	
	/*
	 * if we do an inOrder traversal on a BST, current root value must have been greater than last visited value
	 */
	private boolean checkBST(TreeNode n, Integer lastVisited) {
		if (n == null) {
			return true; //base case, a null tree is a BST
		}
		
		//check left sub-tree
		if (!checkBST(n.left, lastVisited)) {
			return false;
		}
		
		//check current, current value must be greater than the last visited value
		if (lastVisited != null && n.data <= lastVisited) {
			return false;
		}
		lastVisited = n.data;
		
		if (!checkBST(n.right, lastVisited)) {
			return false;
		}
		
		return true;
	}
	
	/*
	 * validate if a binary tree is a BST by using [min, max] range 
	 */
	public boolean isBSTV2(TreeNode root) {
		return checkBSTMinMax(root, null, null);
	}
	
	private boolean checkBSTMinMax(TreeNode root, Integer min, Integer max) {
		//base case 1
		if (root == null) {
			return true;
		}
		//base case 2, root's data is out of range
		if ((min != null && root.data <= min) || (max != null && root.data >= max)) {
			return false;
		}
		
		//recursive calls to check left and right subtrees
		if (!checkBSTMinMax(root.left, min, root.data) || !checkBSTMinMax(root.right, root.data, max)) {
			return false;
		}
		
		return true;
	}
}