package us.inest.app.epi.dp;

import java.util.Arrays;

public class MinStepsToOne {
    public static int getMinSteps(int n) {
        int[] memo = new int[n + 1];
        
        // init memo
        Arrays.fill(memo, -1);
        
        return getMinStepsDP(n, memo);
    }
    
    public static int getMinStepsTab(int n) {
        int[] table = new int[n + 1];
        // init table
        Arrays.fill(table, n);
        table[1] = 0;
        
        for (int i = 1; i < n; i++) {
            //try +1
            table[i + 1] = Math.min(table[i + 1], table[i] + 1);
            
            //try *2
            if (i * 2 <= n) {
                table[i * 2] = Math.min(table[i * 2], table[i] + 1);
            }
            
            //try *3
            if (i * 3 <= n) {
                table[i * 3] = Math.min(table[i * 3], table[i] + 1);
            }
        }
        
        return table[n];
    }
    
    public static int getMinStepsDP(int n, int[] memo) {
        //base case
        if (n == 1) {
            return 0;
        }
        
        if (memo[n] != -1) {
            //we already calculated this n
            return memo[n];
        }
        
        // try - 1
        int result = getMinStepsDP(n - 1, memo);
        
        // try  %2
        if (n % 2 == 0) {
            result = Math.min(result, getMinStepsDP(n / 2, memo));
        }
        
        // try % 3
        if (n % 3 == 0) {
            result = Math.min(result, getMinStepsDP(n / 3, memo));
        }
        
        memo[n] = result + 1;
        return result + 1;
    }
    
    public static int getMinStepsRec(int n) {
        //base case
        if (n == 1) {
            return 0;
        }
        
        // try - 1
        int result = getMinStepsRec(n - 1);
        
        // try  %2
        if (n % 2 == 0) {
            result = Math.min(result, getMinStepsRec(n / 2));
        }
        
        // try % 3
        if (n % 3 == 0) {
            result = Math.min(result, getMinStepsRec(n / 3));
        }
        
        return result + 1;
    }

}
