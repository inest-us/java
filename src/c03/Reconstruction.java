package c03;

import java.util.List;

public class Reconstruction {
    void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.value);// process root
        inOrder(root.right);
    }

    void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.value);// process root
    }

    void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.value);// process root
        preOrder(root.left);
        preOrder(root.right);
    }

    Node reconstruct_tree(List<Integer> inorder, List<Integer> preorder) {
        Node root = null;
        int inorder_pos;
        int preorder_pos;
        List<Integer> left_preorder;
        List<Integer> right_preorder;
        List<Integer> left_inorder;
        List<Integer> right_inorder;

        if (preorder.size() != 0 && inorder.size() != 0) {
            root = new Node(preorder.get(0));

            inorder_pos = inorder.indexOf(preorder.get(0));
            left_inorder = inorder.subList(0, inorder_pos);
            right_inorder = inorder.subList(inorder_pos + 1, inorder.size());

            preorder_pos = left_inorder.size();
            left_preorder = preorder.subList(1, preorder_pos + 1);
            right_preorder = preorder.subList(preorder_pos + 1, preorder.size());

            root.left = reconstruct_tree(left_inorder, left_preorder);
            root.right = reconstruct_tree(right_inorder, right_preorder);
        }
        return root;
    }
}
