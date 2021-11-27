package us.inest.app.epi.recursion;
import java.util.*;

public class LetterCombinations {
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) {
            return result;
        }
        Map<Character, List<Character>> map = new HashMap<>();
        map.put('2', Arrays.asList('a', 'b', 'c'));
        map.put('3', Arrays.asList('d', 'e', 'f'));
        map.put('4', Arrays.asList('g', 'h', 'i'));
        map.put('5', Arrays.asList('j', 'k', 'l'));
        map.put('6', Arrays.asList('m', 'n', 'o'));
        map.put('7', Arrays.asList('p', 'q', 'r', 's'));
        map.put('8', Arrays.asList('t', 'u', 'v'));
        map.put('9', Arrays.asList('w', 'x', 'y', 'z'));
        
        helper(digits, 0, new StringBuilder(), map, result);
        return result;
    }
    
    private static void helper(String digits, int index, StringBuilder sb, Map<Character, List<Character>> map, List<String> result) {
        if (index == digits.length()) {
            // found 1 combination
            result.add(sb.toString());
        } else {
            for (char c : map.get(digits.charAt(index))) {
                // try this character
                sb.append(c);
                helper(digits, index + 1, sb, map, result);
                
                // backtrack
                sb.setLength(sb.length() - 1);
            }
        }
    }
    public static void main(String[] args) {
        List<String> result = letterCombinations("23");
        System.out.println(result);

    }

}
