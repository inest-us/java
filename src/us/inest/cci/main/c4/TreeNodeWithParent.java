package us.inest.cci.main.c4;

public class TreeNodeWithParent {
	public int data;
	public TreeNodeWithParent left;
	public TreeNodeWithParent right;
	public TreeNodeWithParent parent;
	
	public TreeNodeWithParent(int data) {
		this(data, null, null, null);
	}
	
	public TreeNodeWithParent(int data, TreeNodeWithParent left, TreeNodeWithParent right, TreeNodeWithParent parent) {
		this.data = data;
		this.left = left;
		this.right = right;
		this.parent = parent;
	}
}
