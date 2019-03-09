package us.inest.epi.main.c5;

import java.util.List;

public class ComputeMaxProfit {
	public double computeMaxProfit(List<Double> prices) {
		double minPrice = Double.MAX_VALUE;
		double maxProfit = 0.0;
		for (Double price : prices) {
			maxProfit = Math.max(maxProfit, price - minPrice);
			minPrice = Math.min(minPrice, price);
		}
		return maxProfit;
	}
}
