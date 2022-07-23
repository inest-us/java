package us.inest.app.epi.common;

public class TreeNodeWithSize {
    public int data;
    public TreeNodeWithSize left;
    public TreeNodeWithSize right;
    public int size;

    public TreeNodeWithSize(int data) {
        this(data, null, null, 0);
    }

    public TreeNodeWithSize(int data, TreeNodeWithSize left, TreeNodeWithSize right, int size) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.size = size;
    }

}
