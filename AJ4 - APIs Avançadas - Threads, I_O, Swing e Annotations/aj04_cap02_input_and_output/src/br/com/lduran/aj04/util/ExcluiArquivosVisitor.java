package br.com.lduran.aj04.util;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class ExcluiArquivosVisitor extends SimpleFileVisitor<Path>
{
	private PathMatcher matcher;

	/**
	 * @param matcher
	 */
	public ExcluiArquivosVisitor(PathMatcher matcher)
	{
		this.matcher = matcher;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException
	{
		if (matcher.matches(file))
		{
			Files.delete(file);
		}

		return FileVisitResult.CONTINUE;
	}
}
