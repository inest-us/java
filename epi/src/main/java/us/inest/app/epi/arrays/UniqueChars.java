package us.inest.app.epi.arrays;

import java.util.*;

public class UniqueChars {
    public static boolean isUnique(String str) {
        // Assuming that we are using Unicode UTF8
        boolean[] char_set = new boolean[256];
        Arrays.fill(char_set, false);
        
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i); // convert character c into its code e.g. a => 97
            if (char_set[val]) {
                return false; // duplicate character
            }
            char_set[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUnique("abcd")); // true
        System.out.println(isUnique("abcbd")); // false
    }

}
