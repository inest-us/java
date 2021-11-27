package us.inest.app.epi.graph;

import java.util.*;

public class MaxIsland {
    
    public static int findMaxIsland(int[][] graph) {
        int maxArea = 0;
        boolean[][] visited = new boolean[graph.length][graph[0].length];
        
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[0].length; j++) {
                String key = String.format("%d,%d", i, j);
                if (graph[i][j] != 0 && !visited[i][j]) {
                    //explore a new island
                    int area = explore(graph, i, j, visited);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }
    
    private static int explore(int[][] graph, int r, int c, boolean[][] visited) {
        if (r < 0 || r >= graph.length || c < 0 || c >= graph[0].length) {
            return 0; // out of bound
        }
        
        if (graph[r][c] == 0) {
            return 0; // this cell is water
        }
        
        String key = String.format("%d,%d", r, c);
        if (visited[r][c]) {
            return 0; // this cell is already visited
        }
        
        // mark this cell as visited
        visited[r][c] = true;
        
        int area = 1;
        area += explore(graph, r + 1, c, visited); // going down
        area += explore(graph, r - 1, c, visited); // going up
        area += explore(graph, r, c - 1, visited); // going left
        area += explore(graph, r, c + 1, visited); // going right
        
        return area;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
