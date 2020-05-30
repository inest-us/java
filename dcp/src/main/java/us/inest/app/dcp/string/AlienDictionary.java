package us.inest.app.dcp.string;

public class AlienDictionary {
    public static boolean isWordsSorted(String[] words, String order) {
        // build the alphabet mapping
        int[] alphabet = new int[26];
        for (int i = 0; i < order.length(); i++) {
            alphabet[order.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < words.length - 1; i++) {
            String current = words[i];
            String next = words[i + 1];
            int min = Math.min(current.length(), next.length());
            for (int k = 0; k < min; k++) {
                char currentChar = current.charAt(k);
                char nextChar = next.charAt(k);
                if (alphabet[currentChar - 'a'] < alphabet[nextChar - 'a']) {
                    break; // current < next
                } else if (alphabet[currentChar - 'a'] > alphabet[nextChar - 'a']) {
                    return false; // current > next => not in alphabet order
                } else if (k == min - 1 && current.length() > next.length()) {
                    return false; // current > next => not in alphabet order
                }
            }
        }
        return true;
    }
}
