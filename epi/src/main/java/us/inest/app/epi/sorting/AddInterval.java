package us.inest.app.epi.sorting;

import java.util.ArrayList;
import java.util.List;

public class AddInterval {
    public static List<Interval> addInterval(List<Interval> disjointIntervals, Interval newInterval) {
        List<Interval> result = new ArrayList<Interval>();
        int i = 0;

        // process intervals that come before newInterval
        while (i < disjointIntervals.size() && disjointIntervals.get(i).right < newInterval.left) {
            result.add(disjointIntervals.get(i));
            i++;
        }

        // process overlap intervals
        while (i < disjointIntervals.size() && disjointIntervals.get(i).left <= newInterval.right) {
            newInterval = new Interval(Math.min(newInterval.left, disjointIntervals.get(i).left),
                    Math.max(newInterval.right, disjointIntervals.get(i).right));
            i++;
        }
        result.add(newInterval);

        // process intervals that come after newInterval
        result.addAll(disjointIntervals.subList(i, disjointIntervals.size()));
        return result;
    }
}

class Interval {
    public int left, right;

    public Interval(int left, int right) {
        this.left = left;
        this.right = right;
    }
}
