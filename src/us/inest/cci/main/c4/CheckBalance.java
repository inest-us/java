package us.inest.cci.main.c4;

public class CheckBalance {
	public int getHeight(TreeNode root) {
		if (root == null) {
			return -1;
		}
		return 1 + Math.max(getHeight(root.left), getHeight(root.right));
	}
	
	public boolean isBalance(TreeNode root) {
		if (root == null) {
			return true; //base case
		}
		int heightDiff = Math.abs(getHeight(root.left) - getHeight(root.right));
		if (heightDiff > 1) {
			return false;
		} else {
			return isBalance(root.left) && isBalance(root.right);
		}
	}
	
	public boolean isBalanceV2(TreeNode root) {
		return checkBalance(root).status;
	}
	
	public boolean isBalanceV3(TreeNode root) {
		return checkHeight(root) != Integer.MIN_VALUE;
	}
	
	private int checkHeight(TreeNode root) {
		if (root == null) {
			return -1;
		}
		int leftHeight = checkHeight(root.left);
		if (leftHeight == Integer.MIN_VALUE) {
			return leftHeight; //pass error up
		}
		int rightHeight = checkHeight(root.right);
		if (rightHeight == Integer.MIN_VALUE) {
			return rightHeight; //pass error up
		}
		
		int heightDiff = Math.abs(leftHeight - rightHeight);
		if (Math.abs(heightDiff) > 1) {
			return Integer.MIN_VALUE;
		} else {
			return 1 + Math.max(leftHeight, rightHeight);
		}
	}
	
	private StatusWithHeight checkBalance(TreeNode root) {
		if (root == null) {
			return new StatusWithHeight(true, -1);
		}
		StatusWithHeight leftTreeCheck = checkBalance(root.left);
		if (!leftTreeCheck.status) {
			return leftTreeCheck;
		}
		StatusWithHeight rightTreeCheck = checkBalance(root.right);
		if (!rightTreeCheck.status) {
			return rightTreeCheck;
		}
		
		int heightDiff = Math.abs(leftTreeCheck.height - rightTreeCheck.height);
		return new StatusWithHeight(heightDiff > 1 ? false : true, 1 + Math.max(leftTreeCheck.height, rightTreeCheck.height));
	}
}

class StatusWithHeight {
	public boolean status;
	public int height;
	
	
	public StatusWithHeight(boolean status, int height) {
		this.status = status;
		this.height = height;
	}
}
