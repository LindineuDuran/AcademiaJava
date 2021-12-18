package br.com.lduran.aj04.exemplos;

import java.io.IOException;
import java.nio.file.*;

import br.com.lduran.aj04.util.NavegadorArquivosComFiltro;

public class ExemploFileVisitorComFiltro
{

	public static void main(String[] args) throws IOException
	{
		Path path = Paths.get(".");

		String padrao = "glob:**/*.class";
		PathMatcher filtro = FileSystems.getDefault().getPathMatcher(padrao);

		NavegadorArquivosComFiltro visitor = new NavegadorArquivosComFiltro(filtro);
		Files.walkFileTree(path, visitor);
	}

}