package us.inest.app.mockito;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Calendar;
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
	
	@Test
	public void testCalendar() {
		Calendar mockedCalendar = mock(Calendar.class);
		when(mockedCalendar.get(Calendar.YEAR)).thenReturn(2020);
		assertEquals(2020, mockedCalendar.get(Calendar.YEAR));
	}
	
	@Test
	public void testList() {
		List<Integer> myMockedList = mock(ArrayList.class);
		when(myMockedList.get(anyInt())).thenReturn(5);
		when(myMockedList.isEmpty()).thenReturn(false);
		
		assertEquals(5, (int)myMockedList.get(1));
		assertEquals(5, (int)myMockedList.get(15));
		assertFalse(myMockedList.isEmpty());
	}
	
	@Test
	public void testSequentialMethodCalls() {
		List<String> myMockedList = mock(ArrayList.class);
		when(myMockedList.get(0)).thenReturn("target").thenReturn("others");
		
		assertEquals("target", myMockedList.get(0));
		assertEquals("others", myMockedList.get(0));
		assertEquals("others", myMockedList.get(0));
	}
	
	@Test
	public void testThrowException() {
		List<String> myMockedList = mock(ArrayList.class);
		when(myMockedList.get(anyInt())).thenThrow(new NullPointerException());
		doThrow(new RuntimeException()).when(myMockedList).clear();
		
		try {
			myMockedList.get(1);
		} catch (Exception e) {
			assertTrue(e instanceof NullPointerException);
		}
		
		try {
			myMockedList.clear();
		} catch (Exception e) {
			assertTrue(e instanceof RuntimeException);
		}
	}
	
	@Test
	public void testVerifyMethodCalls() {
		List<String> myMockedList = mock(ArrayList.class);
		
		myMockedList.get(0);
		myMockedList.clear();
		
		verify(myMockedList).get(0);
		verify(myMockedList).clear();
	}
	
	@Test
	public void testVerfifyMethodCallCount() {
		List<String> myMockedList = mock(ArrayList.class);
		
		myMockedList.clear();
		myMockedList.get(0);
		myMockedList.get(1);
		myMockedList.add("a");
		myMockedList.add("b");
		myMockedList.add("c");
		
		verify(myMockedList).clear();
		verify(myMockedList, times(1)).clear();
		verify(myMockedList, times(2)).get(anyInt());
		verify(myMockedList, times(3)).add(anyObject());
		verify(myMockedList, never()).remove(anyObject());
		verify(myMockedList, atLeast(2)).add(anyObject());
		verify(myMockedList, atMost(1)).clear();
	}
	
}
