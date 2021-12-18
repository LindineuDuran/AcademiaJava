package br.com.season.java8_lab01g;

import java.util.*;

public class StreamFilterList {

	public static void main(String[] args) {
		List<String> days = Arrays
				.asList(new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" });

		// Filter list using old method
		List<String> filteredDays1 = getFilteredDays(days, "T");
		System.out.println(filteredDays1);

		// Filter list using stream filter() method
		List<String> filteredDays2 = getStreamFilteredDays(days, "S");
		System.out.println(filteredDays2);
	}

	private static List<String> getFilteredDays(List<String> days, String str) {
		List<String> list = new ArrayList<>();
		for (String day : days) {
			if (day.startsWith(str)) {
				list.add(day);
			}
		}
		return list;
	}


	private static List<String> getStreamFilteredDays(List<String> days, String str) {
		// code here

		return null;
	}

}
