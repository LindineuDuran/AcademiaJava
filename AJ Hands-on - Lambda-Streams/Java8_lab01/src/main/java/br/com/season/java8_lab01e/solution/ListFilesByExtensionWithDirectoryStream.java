package br.com.season.java8_lab01e.solution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * List files of certain extention with Files.newDirectoryStream().
 *
 * @author Daniel Melo
 *
 */
public class ListFilesByExtensionWithDirectoryStream
{
	public static void main(String[] args) throws IOException
	{
		Files.newDirectoryStream(Paths.get("."),
		        path -> path.toString().endsWith(".xml"))
		        .forEach(System.out::println);
	}
}
