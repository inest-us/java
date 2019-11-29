package us.inest.app.dcp.stack;

import static org.junit.Assert.*;
import org.junit.Test;

public class BalancedBracketsTest {
    @Test
    public void testBalancedBrackets_ReturnsTrue() {
        String exp = "{[()]}";
        boolean isBalanced = BalancedBrackets.checkBalanced(exp);
        assertTrue(isBalanced);
    }
    
    @Test
    public void testUnBalancedBrackets_ReturnsFalse() {
        String exp = "{[()]]";
        boolean isBalanced = BalancedBrackets.checkBalanced(exp);
        assertFalse(isBalanced);
    }
}
