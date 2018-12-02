package us.inest.cci.main.c4;

public class MinimalBST {
	/*
	 * Build a BST with minimal height from an input array
	 */
	public TreeNode createMinimalBST(int[] arr) {
		return createMinimalBST(arr, 0, arr.length - 1);
	}
	
	private TreeNode createMinimalBST(int[] arr, int start, int end) {
		//base case
		if (end < start) {
			return null;
		}
		
		//divide the range into 2 halves
		int mid = (start + end) / 2;
		TreeNode n = new TreeNode(arr[mid]);
		
		//recursive calls
		n.left = createMinimalBST(arr, start, mid - 1);
		n.right = createMinimalBST(arr, mid + 1, end);
		
		return n;
	}
}
