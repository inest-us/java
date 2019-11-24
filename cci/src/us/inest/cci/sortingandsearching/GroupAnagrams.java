package us.inest.cci.sortingandsearching;

import java.util.Arrays;
import java.util.Comparator;

public class GroupAnagrams {
    class AnagramComparator implements Comparator<String> {
        public String sortChars(String s) {
            if (s == null || s.length() <= 1) {
                return s;
            }
            char[] content = s.toCharArray();
            Arrays.sort(content);
            return new String(content);
        }

        @Override
        public int compare(String s1, String s2) {
            return sortChars(s1).compareTo(sortChars(s2));
        }
    }

    public String[] groupAnagrams(String[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        Arrays.sort(arr, new AnagramComparator());
        return arr;
    }
}
