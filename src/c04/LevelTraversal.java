package c04;

import java.util.LinkedList;
import java.util.Queue;

public class LevelTraversal {
	void level_traversal(Node root) {
		if (root == null) {
			return;
		}
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node n = queue.poll();
			if (n.left != null) {
				queue.add(n.left);
			}
			if (n.right != null) {
				queue.add(n.right);
			}
			System.out.println(n.data);
		}
	}
	
	void level_traversal_with_separation_token(Node root) {
		if (root == null) {
			return;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		queue.add(null); //using null as a LEVEL_TOKEN
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			if (node == null) {
				if (!queue.isEmpty()) {
					System.out.println("END LEVEL");
					queue.add(null); //Add a LEVEL_TOKEN
				}
				continue;
			}
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
			System.out.println(node.data);
		}
	}
}
