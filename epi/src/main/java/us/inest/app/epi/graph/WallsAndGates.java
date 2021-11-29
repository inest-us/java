package us.inest.app.epi.graph;

import java.util.*;

class Pos {
    public int r;
    public int c;

    public Pos(int r, int c) {
        this.r = r;
        this.c = c;
    }
}

public class WallsAndGates {

    public static int[][] wallsAndGates(int[][] rooms) {
        int rows = rooms.length;
        int cols = rooms[0].length;
        boolean[][] visited = new boolean[rows][cols];
        Deque<Pos> q = new ArrayDeque<>();

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (rooms[r][c] == 0) { // gate
                    visited[r][c] = true;
                    q.add(new Pos(r, c));
                }
            }
        }

        int dist = 0;
        while (!q.isEmpty()) {
            int currentQueueLength = q.size();
            for (int i = 0; i < currentQueueLength; i++) {
                Pos p = q.removeFirst();
                rooms[p.r][p.c] = dist;

                // check all neighbors
                if (isValidPos(rooms, visited, rows, cols, p.r + 1, p.c)) {
                    visited[p.r + 1][p.c] = true;
                    q.add(new Pos(p.r + 1, p.c));
                }
                if (isValidPos(rooms, visited, rows, cols, p.r - 1, p.c)) {
                    visited[p.r - 1][p.c] = true;
                    q.add(new Pos(p.r - 1, p.c));
                }
                if (isValidPos(rooms, visited, rows, cols, p.r, p.c + 1)) {
                    visited[p.r][p.c + 1] = true;
                    q.add(new Pos(p.r, p.c + 1));
                }
                if (isValidPos(rooms, visited, rows, cols, p.r, p.c - 1)) {
                    visited[p.r][p.c - 1] = true;
                    q.add(new Pos(p.r, p.c - 1));
                }
            }
        }
        return rooms;
    }

    private static boolean isValidPos(int[][] rooms, boolean[][] visited, int rows, int cols, int r, int c) {
        if (r < 0 || r == rows || c < 0 || c == cols || visited[r][c] || rooms[r][c] == -1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
