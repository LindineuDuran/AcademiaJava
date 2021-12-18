package br.com.season.java8_lab06;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class App
{

	public static void LocalDateTimeApi()
	{

		// the current date
		LocalDate date = LocalDate.now();

		System.out.println("the current date is " + date);

		// the current time
		LocalTime time = LocalTime.now();
		System.out.println("the current time is " + time);

		// will give us the current time and date
		LocalDateTime current = LocalDateTime.now();
		System.out.println("current date and time : " + current);

		// to print in a particular format
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		String formatedDateTime = current.format(formatador);
		System.out.println("in foramatted manner " + formatedDateTime);

		// printing months days and seconds
		int month = current.getMonthValue();
		int day = current.getDayOfMonth();
		int seconds = current.getSecond();
		System.out.println("Month : " + month + " day : " + day + " seconds : " + seconds);

		// printing some specified date
		LocalDate date2 = LocalDate.of(1889, 11, 15);
		System.out.println("the repulic day :" + date2);

		// printing date with current time.
		LocalDate specificDate = LocalDate.of(1968, 12, 31);

		System.out.println("specfic date with " + "current time : " + specificDate);
	}

	// Driver code
	public static void main(String[] args)
	{
		LocalDateTimeApi();
	}
}
