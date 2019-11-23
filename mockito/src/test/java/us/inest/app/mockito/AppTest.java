package us.inest.app.mockito;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest  {
	@Test
	public void test() {
		List<String> mockList = mock(List.class);
		mockList.add("First");
		when(mockList.get(0)).thenReturn("Mockito");
		when(mockList.get(1)).thenReturn("JCG");
		assertEquals("Mockito", mockList.get(0));
		assertEquals("JCG", mockList.get(1));
	}
	
	@Test
	public void testStockService() {
		//Create a portfolio object which is to be tested
		Portfolio portfolio = new Portfolio();
		
		//Creates a list of stocks to be added to the portfolio
		List<Stock> stocks = new ArrayList<Stock>();
		Stock googleStock = new Stock("GOOG", 180);
		Stock microsoftStock = new Stock("MSFT", 140);
		stocks.add(googleStock);
		stocks.add(microsoftStock);
		
		//Create the mock object of stock service
		StockService stockServiceMock = mock(StockService.class);
		
		// mock the behavior of stock service to return the value of various stocks
		when(stockServiceMock.getPrice(googleStock)).thenReturn(50.00);
		when(stockServiceMock.getPrice(microsoftStock)).thenReturn(100.00);
		
		//add stocks to the portfolio
		portfolio.setStocks(stocks);
		
		//set the stockService to the portfolio
		portfolio.setStockService(stockServiceMock);
		
		double marketValue = portfolio.getMarketValue();
		assertEquals(marketValue, 150.00, 0.001);
	}
}
