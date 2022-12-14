package us.inest.app.epi.common;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateUtils {
	public static void sample1() {
		LocalDateTime localDate = LocalDateTime.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM dd, YYYY");
		System.out.println(dateFormatter.format(localDate));
	}
	
	public static void sample2() {
		LocalDate date = LocalDate.of(2022, 12, 7);
		System.out.println(date);
		
		LocalDate date2 = LocalDate.of(2022,Month.DECEMBER, 7);
		System.out.println(date2);
		
		LocalDate date3 = LocalDate.ofEpochDay(18269);
		System.out.println(date3);
		
		LocalDate date4 = LocalDate.ofYearDay(2022, 125);
		System.out.println(date4);
		
		LocalDate date5 = LocalDate.parse("2022-12-07");
		System.out.println(date5);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date6 = LocalDate.parse("2022-12-07", formatter);
		System.out.println(date6);
	}
	
	public static void main(String[] args) {
		LocalDate date5 = LocalDate.parse("2022-12");
		System.out.println(date5);
	}

}
