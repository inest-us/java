package us.inest.cci.tree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Graph {
    public GraphNode[] nodes;
}

public class GraphSearch {
    boolean search(Graph g, GraphNode start, GraphNode end) {
        Set<GraphNode> visited = new HashSet<GraphNode>();
        if (start == end) {
            return true;
        }
        Queue<GraphNode> q = new LinkedList<GraphNode>();
        q.add(start);
        while (!q.isEmpty()) {
            GraphNode u = q.remove();
            if (u != null) {
                if (!visited.contains(u)) {
                    visited.add(u);
                    for (GraphNode v : u.children) {
                        if (!visited.contains(v)) {
                            if (v == end) {
                                return true;
                            } else {
                                visited.add(v);
                                q.add(v);
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
