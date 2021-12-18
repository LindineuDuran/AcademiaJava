package br.com.season.java8_lab01b.solution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * You can use filters to filter out sub-directories and print only file names, if you need it.
 *
 * @author emeloda
 *
 */
public class ListOnlyFilesInsideDirectory
{
	public static void main(String[] args) throws IOException
	{
		Files.list(Paths.get("."))
				.filter(Files::isRegularFile)
				.forEach(System.out::println);		
		
		System.out.println(" ");
		System.out.println("-----Using walk -----");
		System.out.println(" ");
		
		Files.walk(Paths.get("."))
				.filter(Files::isRegularFile)
				.forEach(System.out::println);
	}
}
