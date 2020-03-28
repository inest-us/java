package us.inest.app.cci.hashtable;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class PairsWithSumTest {
    @Test
    public void pairsWithSumTest() {
        int[] arr = new int[] {1, 4, 2, 7, 5, 3, 9};
        int sum = 7;
        List<Pair> pairs = PairsWithSum.pairsWithSum(arr, sum);
        assertEquals(pairs.size(), 2); //(4, 3) and (2, 5)
    }
}
