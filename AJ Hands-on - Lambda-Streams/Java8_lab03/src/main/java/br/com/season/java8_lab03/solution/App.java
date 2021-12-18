package br.com.season.java8_lab03.solution;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Correctly populate genreList with the genres of the books present in books
 * List.
 *
 */
public class App {
	public static void main(String[] args) {

		List<Book> books = Arrays.asList(new Book("Gone with the wind", "Fiction"),
				new Book("Bourne Ultimatum", "Thriller"), new Book("The Client", "Thriller"));
		List<String> genreList = new ArrayList<String>();

		// INSERT CODE HERE
		genreList = books.stream().map(Book::getGenre).collect(Collectors.toList());

		System.out.println(genreList);

	}
}
