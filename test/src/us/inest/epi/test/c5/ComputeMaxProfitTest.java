package us.inest.epi.test.c5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import us.inest.epi.main.c5.ComputeMaxProfit;

class ComputeMaxProfitTest {
	private ComputeMaxProfit obj = new ComputeMaxProfit();

	@Test
	void computeMaxProfitTest() {
        List<Double> prices = new ArrayList<Double>(Arrays.asList(310.0, 315.0, 275.0, 295.0, 260.0, 270.0, 290.0, 230.0, 255.0, 250.0)); 
		double maxProfit = obj.computeMaxProfit(prices);
		assertEquals(30, maxProfit);
	}
}
