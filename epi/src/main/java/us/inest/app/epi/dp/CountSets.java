package us.inest.app.epi.dp;

import java.util.HashMap;
import java.util.Map;

public class CountSets {
    public static int countSets(int[] arr, int total) {
        return countSetsRec(arr, arr.length - 1, total);
    }

    public static int countSetsV2(int[] arr, int total) {
        return countSetsMemo(arr, arr.length - 1, total, new HashMap<String, Integer>());
    }

    private static int countSetsRec(int[] arr, int index, int total) {
        // base case
        if (total == 0) {
            return 1; // only {}
        }
        if (total < 0) {
            return 0; // assuming that array only has positive numbers
        }
        if (index < 0) {
            return 0;
        }
        if (total < arr[index]) {
            return countSetsRec(arr, index - 1, total);
        }
        return countSetsRec(arr, index - 1, total) + countSetsRec(arr, index - 1, total - arr[index]);
    }

    private static int countSetsMemo(int[] arr, int index, int total, Map<String, Integer> memo) {
        String key = String.valueOf(total) + ":" + String.valueOf(index);
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        // base case
        if (total == 0) {
            return 1; // only {}
        }
        if (total < 0) {
            return 0; // assuming that array only has positive numbers
        }
        if (index < 0) {
            return 0;
        }

        int result;
        if (total < arr[index]) {
            result = countSetsMemo(arr, index - 1, total, memo);
        } else {
            result = countSetsMemo(arr, index - 1, total, memo)
                    + countSetsMemo(arr, index - 1, total - arr[index], memo);
        }
        memo.put(key, result);
        return result;
    }
}
