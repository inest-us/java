package us.inest.cci.sortingandsearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagramsV2 {
    public void groupAnagrams(String[] arr) {
        Map<String, List<String>> mapList = new HashMap<>();

        /* build the hashtable */
        for (String s : arr) {
            String key = sortChars(s);
            if (!mapList.containsKey(key)) {
                List<String> list = new ArrayList<>();
                list.add(s);
                mapList.put(key, list);
            } else {
                mapList.get(key).add(s);
            }
        }

        /* convert hash table to array */
        int index = 0;
        for (String key : mapList.keySet()) {
            List<String> list = mapList.get(key);
            for (String s : list) {
                arr[index++] = s;
            }
        }
    }

    private String sortChars(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
}
