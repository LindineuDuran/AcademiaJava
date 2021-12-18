package br.com.lduran.aj04.util;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class NavegadorArquivos extends SimpleFileVisitor<Path>
{
	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException
	{
		System.out.println("Pasta " + dir);
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException
	{
		System.out.println(file.getFileName());
		return FileVisitResult.CONTINUE;
	}
}
