package us.inest.app.dcp.string;

import org.junit.Test;
import static org.junit.Assert.*;

public class LongestCommonPrefixTest {
    @Test
    public void testLongestCommonPrefix() {
        String[] strs = new String[] { "flower", "flow", "flight" };
        String longestCommonPrefix = LongestCommonPrefix.longestCommonPrefix(strs);
        assertEquals("fl", longestCommonPrefix);
    }
}
