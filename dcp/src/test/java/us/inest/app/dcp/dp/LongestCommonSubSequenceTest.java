package us.inest.app.dcp.dp;

import org.junit.Test;
import static org.junit.Assert.*;

public class LongestCommonSubSequenceTest {
    @Test
    public void testLCS() {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        int result = LongestCommonSubSequence.LCS(s1, s2);
        assertEquals(4, result);
    }
    
    @Test
    public void testLCS_DP() {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        int result = LongestCommonSubSequence.LCS_DP(s1, s2);
        assertEquals(4, result);
    }
}
