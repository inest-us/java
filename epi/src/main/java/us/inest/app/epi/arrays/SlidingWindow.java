package us.inest.app.epi.arrays;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SlidingWindow {
    
    public static List<Integer> maxSlidingWindow(List<Integer> nums) {
        List<Integer> output = new ArrayList<>();
        Deque<Integer> queue = new ArrayDeque<Integer>();
        int l = 0;
        int r = 0;
        while (r < nums.size()) {
            //pop smaller value from queue
            while (queue.size() > 0 && queue.peekFirst() < nums.get(r)) {
                queue.removeFirst();
            }
            
        }
        return output;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
