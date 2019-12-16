package us.inest.app.epi.hashtable;

import java.util.*;

public class CanFormPalindrome {
    public static boolean canFormPalindrome(String s) {
        Set<Character> charsWithOddFrequency = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (charsWithOddFrequency.contains(c)) {
                // c now has appear an even number of times => remove c
                charsWithOddFrequency.remove(c);
            } else {
                // c now has appear an odd number of times => add c
                charsWithOddFrequency.add(c);
            }
        }
        return charsWithOddFrequency.size() <= 1;
    }
}
