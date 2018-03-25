package c03;

import java.util.*;

public class TreeProperties {
	int size(Node root) {
		if (root == null) {
			return 0;
		}
		
		return 1 + size(root.left) + size(root.right);
	}
	
	/*
	 * using a queue
	 * Breath-First-Search
	 */
	int size_iterative(Node root) {
		if (root == null) {
			return 0;
		}
		int count = 0;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while (!q.isEmpty()) {
			Node front = q.poll();
			count++;
			if (front.left != null) {
				q.add(front.left);
			}
			if (front.right != null) {
				q.add(front.right);
			}
		}
		return count;
	}
	
	int depth(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(depth(root.left), depth(root.right));
	}
	
	/*
	 * using a stack
	 * Depth-First-Search
	 */
	int depth_iterative(Node root) {
		if (root == null) {
			return 0;
		}
		int max_depth = 0;
		Set<Node> visited = new HashSet<Node>();
		Stack<Node> s = new Stack<Node>();
		s.push(root);
		while (!s.isEmpty()) {
			Node top = s.peek();
			//process current node
			if (top.left != null && !visited.contains(top.left)) {
				s.push(top.left);
			} else if (top.right != null && !visited.contains(top.right)) {
				s.push(top.right);
			} else {
				//done with visiting current node
				visited.add(top);
				max_depth = Math.max(max_depth, s.size());
				s.pop();
			}
		}
		return max_depth;
	}
	
	/*
	 * to determine whether or not a binary tree is balanced we must evaluate whether or not every sub-tree is balanced.
	 */
	boolean balanced_naive(Node root) {
		if (root == null) {
			return true;
		}
		
		if (!balanced_naive(root.left) || !balanced_naive(root.right)) {
			return false;
		}
		int left_depth = depth(root.left);
		int right_depth = depth(root.right);
		return Math.abs(right_depth - left_depth) <= 1;
	}
	
	/*
	 * A linear solution would require modifying the recursion to return the depth of the sub-tree
	 * as well as if it is balanced or not
	 */
	boolean balanced_depth(Node root, int[] depth) {
		if (root == null) {
			depth[0] = 0;
			return true;
		}
		/*
		 * Note that since Java does not allow primitives or immutable objects to be passed by reference
		 * We wrap the primitive integer within an int[] to pass the depth by reference
		 */
		int[] left = new int[1];
		int[] right = new int[1];
		if (!balanced_depth(root.left, left)) {
			return false;
		}
		if (!balanced_depth(root.right, right)) {
			return false;
		}
		
		depth[0] = 1 + Math.max(left[0], right[0]);
		if (Math.abs(left[0] - right[0]) > 1) {
			return false;
		}
		return true;
	}
	
	boolean balanced(Node root) {
		int[] depth = new int[1];
		return balanced_depth(root, depth);
	}
	
	boolean find_path(Node root, Node target, List<Node> path) {
		if (target == null) {
			return true;
		}
		while (root != null && (path.isEmpty() || path.get(path.size() - 1) != target)) {
			path.add(root);
			if (target.value < root.value) {
				root = root.left;
			} else {
				root = root.right;
			}
		}
		if (path.get(path.size() - 1) == target) {
			return true;
		} else {
			path.clear();
			return false;
		}
	}
	
	Node lca_from_path(Node root, Node x, Node y) {
		List<Node> x_path = new ArrayList<>();
		List<Node> y_path = new ArrayList<>();
		find_path(root, x, x_path);
		find_path(root, y, y_path);
		
		Node lca = null;
		Iterator<Node> x_path_iterator = x_path.iterator();
		Iterator<Node> y_path_iterator = y_path.iterator();
		Node current_x, current_y;
		
		while (x_path_iterator.hasNext() && y_path_iterator.hasNext()) {
			current_x = x_path_iterator.next();
			current_y = y_path_iterator.next();
			if (current_x != current_y) {
				break;
			}
			lca = current_x;
		}
		return lca;
	}
	
	Node lca_recursive(Node root, Node x, Node y) {
		if (root == null || x == null || y == null) {
			return null;
		}
		if (root.value == x.value || root.value == y.value) {
			return root;
		}
		if ((x.value < root.value && y.value >= root.value) || (y.value < root.value && x.value >= root.value)) {
			return root;
		}
		if (x.value < root.value) {
			return lca_recursive(root.left, x, y);
		}
		return lca_recursive(root.right, x, y);
	}
	
	Node lca_iterative(Node root, Node x, Node y) {
		if (x != null && y!= null && x.value > y.value) {
			//swap x and y so that y.value > x.value => simplify our if condition
			Node temp = y;
			y = x;
			x = temp;
		}
		while (root != null && root.value != x.value && root.value != y.value &&
				(y.value < root.value || x.value >= root.value)) {
			if (y.value < root.value) {
				root = root.left;
			} else {
				root = root.right;
			}
		}
		return root;
	}
}

