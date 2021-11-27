package us.inest.app.epi.string;

import java.util.*;

public class CheckAnagram {
    public static boolean checkAnagram(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return (s1 == null && s2 == null); 
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        s1 = sort(s1);
        s2 = sort(s2);
        
        return s1.equals(s2);
    }

    public static boolean checkAnagramV2(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return (s1 == null && s2 == null); 
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        
        int[] freq = new int[256]; // Assuming that we are using UTF-8 code
        for (int i = 0; i < s1.length(); i++) {
            int val = s1.charAt(i);
            freq[val]++; 
        }
        
        for (int i = 0; i < s2.length(); i++) {
            int val = s2.charAt(i);
            freq[val]--;
            if (freq[val] < 0) {
                return false;
            }
        }
        
        return true;
    }
    
    private static String sort(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    
    public static void main(String[] args) {
        String s1 = "dog";
        String s2 = "god";
        System.out.println(checkAnagram(s1, s2)); // true
        System.out.println(checkAnagramV2(s1, s2)); // true
        
        System.out.println(s1);
        System.out.println(s2);
    }

}
