package us.inest.app.epi.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListsIntersection {
    public static List<Integer> intersectTwoSortedArrays(List<Integer> a, List<Integer> b) {
        List<Integer> intersection = new ArrayList<Integer>();
        int i = 0, j = 0;
        while (i < a.size() && j < b.size()) {
            if ((a.get(i) == b.get(j)) && (i == 0 || a.get(i) != a.get(i - 1))) {
                intersection.add(a.get(i));
                i++;
                j++;
            } else if (a.get(i) < b.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return intersection;
    }

    public static List<Integer> intersectTwoSortedArraysV2(List<Integer> a, List<Integer> b) {
        List<Integer> intersection = new ArrayList<Integer>();
        for (int i = 0; i < a.size(); i++) {
            if ((i == 0 || a.get(i) != a.get(i - 1)) && Collections.binarySearch(b, a.get(i)) >= 0) {
                intersection.add(a.get(i));
            }
        }
        return intersection;
    }
}
