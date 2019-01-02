package us.inest.common;

public class TreeNodeWithParent extends TreeNode {
	public TreeNode parent;
	
	public TreeNodeWithParent(int data) {
		this(data, null, null, null);
	}
	
	public TreeNodeWithParent(int data, TreeNodeWithParent left, TreeNodeWithParent right, TreeNodeWithParent parent) {
		super(data, left, right);
		this.parent = parent;
	}
}
