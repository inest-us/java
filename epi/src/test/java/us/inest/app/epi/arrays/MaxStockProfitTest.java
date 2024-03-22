package us.inest.app.epi.arrays;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class MaxStockProfitTest {
    @Test
    public void testComputeMaxProfit() {
        Double[] arr = new Double[] { 310d, 315d, 275d, 295d, 260d, 270d, 290d, 230d, 255d, 250d };
        List<Double> prices = Arrays.asList(arr);
        double maxProfit = MaxStockProfit.computeMaxProfit(prices);
        assertEquals(30, maxProfit, 0.001);
    }
}
