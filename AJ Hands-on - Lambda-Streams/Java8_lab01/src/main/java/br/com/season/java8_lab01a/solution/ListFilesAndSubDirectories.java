package br.com.season.java8_lab01a.solution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Use Files.list() and Files.walk() methods to list all file names and
 * sub-directories in current directory.
 *
 * @author emeloda
 *
 */
public class ListFilesAndSubDirectories
{
	public static void main( String[] args )
	{
		try {
			Files.list(Paths.get("."))
					.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(" ");
		System.out.println("-----Using walk -----");
		System.out.println(" ");

		try {
			Files.walk(Paths.get("."))
					.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
