package br.com.lduran.testes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuscaComRegex
{
	private static String texto = "O 2º colocado chegou as 11h26m33s";

	public static void main(String[] args)
	{
		Pattern padrao = Pattern.compile(args[0]);
		Matcher matches = padrao.matcher(texto);

		while (matches.find())
		{
			System.out.println("Encontrei o valor '" + matches.group() + "' na posição " + matches.start());
		}
	}
}
