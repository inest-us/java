package us.inest.app.epi.hashtable;

import java.util.*;

public class ConstructLetterFromMagazine {
    public static boolean isLetterConstructibleFromMagazine(String letterText, String magazineText) {
        // build the frequency for letter in letterText
        Map<Character, Integer> letterToFrequency = new HashMap<>();
        for (char c : letterText.toCharArray()) {
            if (!letterToFrequency.containsKey(c)) {
                letterToFrequency.put(c, 1);
            } else {
                letterToFrequency.put(c, letterToFrequency.get(c) + 1);
            }
        }

        // check if characters in magazineText can cover characters in letterText
        for (char c : magazineText.toCharArray()) {
            if (letterToFrequency.containsKey(c)) {
                letterToFrequency.put(c, letterToFrequency.get(c) - 1);
                if (letterToFrequency.get(c) == 0) {
                    letterToFrequency.remove(c);
                }
                // if all characters are cover, stop
                if (letterToFrequency.isEmpty()) {
                    break;
                }
            }
        }
        return letterToFrequency.isEmpty();
    }
}
