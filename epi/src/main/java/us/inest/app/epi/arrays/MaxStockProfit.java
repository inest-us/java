package us.inest.app.epi.arrays;

import java.util.*;

public class MaxStockProfit {
    public static double computeMaxProfit(List<Double> prices) {
        double minPrice = Double.MAX_VALUE;
        double maxProfit = 0.0;
        for (double price : prices) {
            maxProfit = Math.max(maxProfit, price - minPrice);
            minPrice = Math.min(minPrice, price);
        }
        return maxProfit;
    }
}
