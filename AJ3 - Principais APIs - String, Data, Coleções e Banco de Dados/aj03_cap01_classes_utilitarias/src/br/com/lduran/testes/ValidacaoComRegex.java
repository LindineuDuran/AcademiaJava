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
			System.out.println(param + " � um email v�lido");
		}
		else
		{
			System.out.println(param + " n�o � um email v�lido");
		}

		if (validaFormatoCpf(param))
		{
			System.out.println(param + " � um cpf v�lido");
		}
		else
		{
			System.out.println(param + " n�o � um cpf v�lido");
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
