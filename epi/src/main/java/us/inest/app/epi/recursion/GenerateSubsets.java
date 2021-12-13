package us.inest.app.epi.recursion;

import java.util.*;

public class GenerateSubsets {
    public static List<List<Integer>> generateSubSets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        doCombine(nums, 0, subset, result);
        return result;
    }

    private static void doCombine(int[] nums, int index, List<Integer> subset, List<List<Integer>> result) {
        // base case
        if (index == nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }

        // chose nums[index]
        subset.add(nums[index]);
        doCombine(nums, index + 1, subset, result);

        // backtrack, do not choose nums[index]
        subset.remove(subset.size() - 1);
        doCombine(nums, index + 1, subset, result);
    }

    public static void main(String[] args) {
        List<List<Integer>> result = generateSubSets(new int[] { 1, 2, 3 });
        System.out.println(result.size()); // 8
    }

}
