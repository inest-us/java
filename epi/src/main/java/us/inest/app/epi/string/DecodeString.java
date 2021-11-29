package us.inest.app.epi.string;

import java.util.*;

public class DecodeString {
    public static String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ']') {
                stack.push(c);
            } else {
                StringBuilder chars = new StringBuilder();
                while (!stack.isEmpty() && stack.peek() != '[') {
                    chars.insert(0, stack.pop());
                }
                //remove '['
                stack.pop();
                StringBuilder nums = new StringBuilder();
                while (!stack.isEmpty() && stack.peek() >= '0' && stack.peek() <= '9') {
                    nums.insert(0, stack.pop());
                }

                int k = Integer.valueOf(nums.toString());
                for (int j = 0; j < k; j++) {
                    for (int l = 0; l < chars.length(); l++) {
                        stack.push(chars.charAt(l));
                    }
                }
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeString("2[ab]")); // abab
        System.out.println(decodeString("2[a2[b]]")); // abbabb

    }

}
