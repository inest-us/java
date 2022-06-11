package us.inest.app.epi.arrays;

import java.util.*;

public class RescueBoats {
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int numBoats = 0;
        int i = 0;
        int j = people.length - 1;
        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;
                j--;
            } else {
                j--;
            }
            numBoats++;
        }
        return numBoats;
    }

    public static void main(String[] args) {
        System.out.println(numRescueBoats(new int[] { 3, 2, 2, 1 }, 3)); // 3

    }

}
