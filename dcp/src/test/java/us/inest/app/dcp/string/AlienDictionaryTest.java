package us.inest.app.dcp.string;

import org.junit.Test;
import static org.junit.Assert.*;

public class AlienDictionaryTest {
    @Test
    public void testIsWordsSorted() {
        String order = "abcdefghijklmnopqrstuvwxyz";
        String[] words = new String[] { "apple", "app" };
        boolean result = AlienDictionary.isWordsSorted(words, order);
        assertFalse(result);
    }
}
