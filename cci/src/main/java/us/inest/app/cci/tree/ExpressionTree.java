package us.inest.app.cci.tree;

import us.inest.app.cci.common.TreeNode;

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
