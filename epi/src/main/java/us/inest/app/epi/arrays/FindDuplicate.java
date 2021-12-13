package us.inest.app.epi.arrays;

public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast) {
                break;
            }
        }

        int head = 0;
        while (true) {
            head = nums[head];
            slow = nums[slow];
            if (head == slow) {
                return head;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[] { 1, 3, 4, 2, 2, })); // 2

    }

}
