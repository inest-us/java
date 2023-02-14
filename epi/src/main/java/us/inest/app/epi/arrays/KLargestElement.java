package us.inest.app.epi.arrays;

import java.util.PriorityQueue;

public class KLargestElement {
    
    public static int findKLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }
        return minHeap.remove();
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 5, 7, 3, 9, 6};
        int k = 2;
        int result = findKLargest(nums, k);
        System.out.println(result); // 7
    }

}
