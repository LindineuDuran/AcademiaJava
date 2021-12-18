package br.com.season.java8_lab02a;

import java.util.Arrays;
import java.util.List;

/**
 * Print in the following sequence:
 *
 * Freedom at Midnight:10.0 Gone with the wind:5.0 Midnight
 * Cowboy:15.0
 *
 */
public class App
{
	public static void main(String[] args)
	{
		List<Book> books = Arrays.asList(new Book("Freedom at Midnight", 5.0), new Book("Gone with the wind", 5.0), new Book("Midnight Cowboy", 15.0));

		books.stream().forEach(b ->
		{
			if (b.getTitle().equals("Freedom at Midnight"))
			{
				b.setPrice(b.getPrice() + 5);
			}
			System.out.println(b.getTitle() + ":" + b.getPrice());
		});
	}
}
