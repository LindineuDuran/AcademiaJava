package br.com.season.java8_lab03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Correctly populate genreList with the genres of the books present
 * in books List.
 *
 */
public class App
{
	public static void main(String[] args)
	{

		List<Book> books = Arrays.asList(new Book("Gone with the wind", "Fiction"), new Book("Bourne Ultimatum", "Thriller"), new Book("The Client", "Thriller"));
		List<String> genreList = books.stream().map(Book::getGenre).collect(Collectors.toList());

		// INSERT CODE HERE

		System.out.println(genreList);

	}
}
