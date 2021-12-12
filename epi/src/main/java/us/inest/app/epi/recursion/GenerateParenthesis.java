package us.inest.app.epi.recursion;

import java.util.*;

import us.inest.app.epi.common.ListUtils;

public class GenerateParenthesis {

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisHelper(n, 0, 0, new StringBuilder(), result);
        return result;
    }

    private static void generateParenthesisHelper(int n, int openCount, int closedCount, StringBuilder sb,
            List<String> result) {
        // base case
        if (openCount == n && closedCount == n) {
            result.add(sb.toString());
        }

        // if openCount < n, try '('
        if (openCount < n) {
            sb.append('(');
            generateParenthesisHelper(n, openCount + 1, closedCount, sb, result);

            // backtrack
            sb.setLength(sb.length() - 1);
        }

        // if (closedCount < openCount), try ')'
        if (closedCount < openCount) {
            sb.append(')');
            generateParenthesisHelper(n, openCount, closedCount + 1, sb, result);

            // backtrack
            sb.setLength(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        List<String> result = generateParenthesis(3);
        ListUtils.print(result);
    }

}
