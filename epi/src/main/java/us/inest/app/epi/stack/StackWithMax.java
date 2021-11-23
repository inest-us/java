package us.inest.app.epi.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;

public class StackWithMax {
    public static void testStack() {
        Deque<Integer> q = new ArrayDeque<Integer>();
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        for (int num : arr) {
            q.push(num);
        }
        while (q.size() > 0) {
            System.out.println(q.pop());
        }
    }

    public static void testSet() {
        Set<Integer> numbers = new HashSet<Integer>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        for (int num : numbers) {
            System.out.println(num);
        }
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }
    }

    public static void testMap() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.put("d", "4");

        for (Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        for (String i : map.keySet()) {
            System.out.println(i);
        }

        for (String i : map.values()) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        testStack();
        testSet();
        testMap();
    }

}
