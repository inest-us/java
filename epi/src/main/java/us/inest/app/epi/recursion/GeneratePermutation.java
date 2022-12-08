package us.inest.app.epi.recursion;

import java.util.*;

public class GeneratePermutation {
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, 0, used, new ArrayList<Integer>(), results);
        return results;
    }

    private void backtrack(int[] nums, int index, boolean[] used, List<Integer> partial, List<List<Integer>> results) {
        if (index == nums.length) {
            results.add(new ArrayList<>(partial));
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                partial.add(nums[i]);
                backtrack(nums, index + 1, used, partial, results);
                partial.remove(partial.size() - 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
