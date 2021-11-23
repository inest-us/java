package us.inest.app.epi.graph;

import java.util.*;

public class CloneGraph {
    class Node {
        public Node(int val) {
            this.val = val;
        }
        public int val;
        public List<Node> neighbors;
    }

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Map<Node, Node> oldToNew = new HashMap<>();
        return clone(node, oldToNew);
    }
    
    public Node clone(Node node, Map<Node, Node> oldToNew) {
        if (oldToNew.containsKey(node)) {
            return oldToNew.get(node);
        }
        
        Node copy = new Node(node.val);
        oldToNew.put(node, copy);
        for (Node neighbor : node.neighbors) {
            copy.neighbors.add(clone(neighbor, oldToNew));
        }
        return copy;
    }
    
    public static void main(String[] args) {
        new CloneGraph().cloneGraph(null);
    }
}
