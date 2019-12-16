package us.inest.app.epi.arrays;

import java.util.*;

public class CanReachEnd {
    public static boolean canReachEnd(List<Integer> list) {
        int furthestReachSoFar = 0;
        int lastIndex = list.size() - 1;
        for (int i = 0; i <= furthestReachSoFar && furthestReachSoFar < lastIndex; i++) {
            furthestReachSoFar = Math.max(furthestReachSoFar, i + list.get(i));
        }
        return furthestReachSoFar >= lastIndex;
    }
}
