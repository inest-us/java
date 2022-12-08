package us.inest.app.epi.arrays;

import java.util.*;

public class SpiralOrder {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int columnBegin = 0;
        int columnEnd = matrix[0].length - 1;
        
        while (rowBegin <= rowEnd && columnBegin <= columnEnd) {
            for (int j = columnBegin; j <= columnEnd; j++) {
                list.add(matrix[rowBegin][j]);
            }
            rowBegin++;
            
            for (int i = rowBegin; i <= rowEnd; i++) {
                list.add(matrix[i][columnEnd]);
            }
            columnEnd--;
            
            if (rowBegin <= rowEnd) {
                for (int j = columnEnd; j >= columnBegin; j--) {
                    list.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;
            
            if (columnBegin <= columnEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    list.add(matrix[i][columnBegin]);
                }
            }
            
            columnBegin++;
        }
        return list;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
