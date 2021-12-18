package br.com.season.java8_lab01c.solution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * List files and sub-directories with Files.newDirectoryStream()
 *
 * @author Daniel Melo
 *
 */
public class ListFilesAndSubDirectoriesWithDirectoryStream
{
	public static void main(String[] args) throws IOException
	{
		// code here

		Files.newDirectoryStream(Paths.get("."))
				.forEach(System.out::println);
	}
}
