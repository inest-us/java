package us.inest.app.epi.hashtable;

import org.junit.Test;
import static org.junit.Assert.*;

public class CanFormPalindromeTest {
    @Test
    public void testCanFormPalindrome() {
        String s = "edified";
        boolean result = CanFormPalindrome.canFormPalindrome(s);
        assertTrue(result);
    }
}
