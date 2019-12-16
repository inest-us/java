package us.inest.app.epi.hashtable;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class NearestRepetitionTest {
    @Test
    public void testFindNearestRepetition() {
        // creating Arrays of String type
        String[] arr = new String[] { "All", "work", "and", "no", "play", "make", "for", "no", "work", "no" };

        // getting the list view of Array
        List<String> list = Arrays.asList(arr);

        int result = NearestRepetition.findNearestRepetition(list);
        assertEquals(2, result);
    }
}
