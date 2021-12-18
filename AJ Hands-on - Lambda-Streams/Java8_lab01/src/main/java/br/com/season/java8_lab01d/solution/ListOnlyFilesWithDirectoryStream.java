package br.com.season.java8_lab01d.solution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * List only files with Files.newDirectoryStream().
 *
 * @author Daniel Melo
 *
 */
public class ListOnlyFilesWithDirectoryStream
{
	public static void main(String[] args) throws IOException
	{
		// code here
		Files.newDirectoryStream(Paths.get("."), path -> path.toFile().isFile())
				.forEach(System.out::println);
	}
}
