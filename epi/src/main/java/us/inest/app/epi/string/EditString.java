package us.inest.app.epi.string;

public class EditString {
    
    public static boolean oneEditAway(String first, String second) {
        if (first.length() == second.length()) {
            return oneReplaceAway(first, second);
        } else if (first.length() + 1 == second.length()) {
            return oneInsertAway(first, second);
        } else if (first.length() - 1 == second.length()) {
            return oneInsertAway(second, first);
        }
        return false;
    }

    public static boolean oneReplaceAway(String first, String second) {
        boolean foundDifference = false;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }
    
    public static boolean oneInsertAway(String first, String second) {
        int i = 0;
        int j = 0;
        while (i < first.length() && j < second.length()) {
            if (first.charAt(i) != second.charAt(j)) {
                if (i != j) {
                    return false; // this is not the first time we found the different
                }
                j++;
            } else {
                i++;
                j++;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(oneEditAway("1245", "12345")); // true
        System.out.println(oneEditAway("12645", "12345")); // true
        System.out.println(oneEditAway("126457", "12345")); // false
    }

}
