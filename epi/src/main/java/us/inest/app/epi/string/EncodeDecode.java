package us.inest.app.epi.string;

import java.util.*;

public class EncodeDecode {
    public static String encode(String[] strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(String.valueOf(str.length()) + "#" + str);
        }
        return sb.toString();
    }
    
    public static List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') j++;
            int wordLength = Integer.parseInt(str.substring(i, j));
            result.add(str.substring(j + 1, j + 1 + wordLength));
            i = j + 1 + wordLength;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(encode(new String[] {"leet", "code"})); //4#leet4#code
        List<String> result = decode("4#leet4#code");
        System.out.println(result);
    }

}
