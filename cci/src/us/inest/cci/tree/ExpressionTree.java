package us.inest.cci.tree;

import us.inest.cci.common.TreeNode;

public class ExpressionTree {
    public int evaluate(TreeNode<String> root) {
        switch (root.data) {
        case "+":
            return evaluate(root.left) + evaluate(root.right);
        case "-":
            return evaluate(root.left) - evaluate(root.right);
        case "*":
            return evaluate(root.left) * evaluate(root.right);
        case "/":
            return evaluate(root.left) / evaluate(root.right);
        default:
            return Integer.valueOf(root.data);
        }
    }
}
