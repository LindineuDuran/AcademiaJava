/*
 * Globalcode - "The Developers Company"
 *
 * Academia do Java
 */
package br.com.globalcode.aj3.er;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.globalcode.aj3.util.Teclado;

public class TesteExpressaoRegular
{
	public static void main(String args[])
	{
		String nome, telefone, data;

		System.out.println("Nome: ");
		nome = Teclado.le();

		System.out.println("Telefone: ");
		telefone = Teclado.le();

		System.out.println("Data: ");
		data = Teclado.le();

		if (validaNome(nome) && validaTelefone(telefone) && validaData(data))
		{
			System.out.println("Nome: " + nome);
			System.out.println("Telefone: " + telefone);
			System.out.println("Data: " + data);
		}
		else
		{
			System.out.println("Nome deve de 5 a 20 caracteres entre letras e espacos.");
			System.out.println("Telefone deve estar no formato: (xx)xxxx-xxxx");
			System.out.println("Data deve estar no formato: xx/xx/xxxx");
		}
	}

	public static boolean validaNome(String nome)
	{
		Pattern padrao = Pattern.compile("[A-Za-z]{5,20}");
		Matcher matcher = padrao.matcher(nome);
		return matcher.matches();
	}

	public static boolean validaTelefone(String telefone)
	{
		// Implemente a regra para validar o telefone tal que o formato aceito seja:
		// (xx)xxx-xxxx ou (xx)xxxx-xxxx
		Pattern padrao = Pattern.compile("\\(\\d{2}\\)\\d{3,5}-\\d{4}");
		Matcher matcher = padrao.matcher(telefone);

		return matcher.matches();
	}

	private static boolean validaData(String data)
	{
		Pattern padrao = Pattern.compile("\\d{2}/\\d{2}/\\d{2,4}");
		Matcher matcher = padrao.matcher(data);
		return matcher.matches();
	}
}
