package us.inest.app.epi.dp;

import org.junit.Test;
import static org.junit.Assert.*;

public class KnapsackTest {
    @Test
    public void testKS() {
        int[] v = new int[] {0, 5, 3, 5, 3, 2};
        int[] w = new int[] {0, 1, 2, 4, 2, 5};
        int C = 10;
        int result = Knapsack.KS(C, w, v);
    }
}
