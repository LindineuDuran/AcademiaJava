package br.com.lduran.testes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacaoComRegex
{
	public static void main(String[] args)
	{
		String param = args[0];
		if (validaEmail(param))
		{
			System.out.println(param + " é um email válido");
		}
		else
		{
			System.out.println(param + " não é um email válido");
		}

		if (validaFormatoCpf(param))
		{
			System.out.println(param + " é um cpf válido");
		}
		else
		{
			System.out.println(param + " não é um cpf válido");
		}
	}

	private static boolean validaEmail(String param)
	{
		return Pattern.matches("[A-Za-z0-9._-]+@([A-Za-z]+\\.)+[A-Za-z]+", param);
	}

	private static boolean validaFormatoCpf(String param)
	{
		Pattern padraoCpf = Pattern.compile("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
		Matcher matcher = padraoCpf.matcher(param);
		return matcher.matches();
	}
}
