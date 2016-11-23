package main.java.com.java.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeDemo {
	public void demo() {
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("Current local date time is: " + now);
		System.out.println("Conversion to LocalDate: " + now.toLocalDate());
		System.out.println("Conversion to LocalTime: " + now.toLocalTime());

		DateTimeFormatter dtf1 = DateTimeFormatter.ISO_DATE_TIME;
		
		System.out.println("Current DateTime in ISO format: " + dtf1.format(now));
		
		String dateTime = "2016-10-31 12:34:56";
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println("Creating date from string: "+ LocalDateTime.parse(dateTime, dtf2));
		
		System.out.println("Adding 100 hours to current time: " + now.plusHours(100));
		System.out.println("Changing month to january and year to 2010: " + now.withMonth(1).withYear(2010));	
	}
}
