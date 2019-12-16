package us.inest.app.epi.hashtable;

import java.util.*;

public class NearestRepetition {
    public static int findNearestRepetition(List<String> paragraph) {
        Map<String, Integer> wordToLastestIndex = new HashMap<>();
        int nearestDistance = Integer.MAX_VALUE;
        for (int i = 0; i < paragraph.size(); i++) {
            String word = paragraph.get(i);
            if (wordToLastestIndex.containsKey(word)) {
                nearestDistance = Math.min(nearestDistance, i - wordToLastestIndex.get(word));
            }
            wordToLastestIndex.put(word, i);
        }
        return nearestDistance != Integer.MAX_VALUE ? nearestDistance : -1;
    }
}
