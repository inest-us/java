package us.inest.app.epi.arrays;

import java.util.*;

public class ValidSudoku {
    public static boolean isValidSudoku(String[][] board) {
        Map<Integer, Set<String>> rows = new HashMap<>();
        Map<Integer, Set<String>> cols = new HashMap<>();
        Map<String, Set<String>> squares = new HashMap<>();
        
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == ".") continue;
                String pos = String.valueOf(r / 3) + "," + String.valueOf(c / 3); 
                if ((rows.getOrDefault(r, new HashSet<>()).contains(board[r][c])) ||
                    (cols.getOrDefault(c, new HashSet<>()).contains(board[r][c])) ||
                    (squares.getOrDefault(pos, new HashSet<>()).contains(board[r][c]))) {
                    return false; // invalid sudoku                    
                }
                if (!rows.containsKey(r)) {
                    rows.put(r, new HashSet<>());
                }
                if (!cols.containsKey(c)) {
                    cols.put(c, new HashSet<>());
                }
                if (!squares.containsKey(pos)) {
                    squares.put(pos, new HashSet<>());
                }
                rows.get(r).add(board[r][c]);
                cols.get(c).add(board[r][c]);
                squares.get(pos).add(board[r][c]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
