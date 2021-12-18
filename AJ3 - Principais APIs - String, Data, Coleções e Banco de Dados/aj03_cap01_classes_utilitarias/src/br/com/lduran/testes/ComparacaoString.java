package br.com.lduran.testes;

public class ComparacaoString
{
	public static void main(String[] args)
	{
		if (args.length == 2)
		{
			String str1 = args[0];
			String str2 = args[1];

			// utilizando o operador ==
			if (str1 == str2)
			{
				System.out.println("Strings são iguais, utilizando o operador ==");
			}
			else
			{
				System.out.println("Strings NÃO são iguais, utilizando o operador ==");
			}

			// utilizando o equals
			if (str1.equals(str2))
			{
				System.out.println("Strings são iguais, utilizando o equals");
			}
			else
			{
				System.out.println("Strings NÃO são iguais, utilizando o equals");
			}

			// utilizando o equalsIgnoreCase
			if (str1.equalsIgnoreCase(str2))
			{
				System.out.println("Strings são iguais, utilizando o equalsIgnoreCase");
			}
			else
			{
				System.out.println("Strings NÃO são iguais, utilizando o equalsIgnoreCase");
			}

			// utilizando o método compareTo(String str)
			int dif = str1.compareTo(str2);
			if (dif == 0)
			{
				System.out.println("Strings são iguais, utilizando o método compareTo(String str)");
			}
			else
			{
				System.out.println("Strings NÃO são iguais, utilizando o método compareTo(String str)");
			}
		}
		else
		{
			String msg = "Sintaxe correta: java ComparacaoString <str1> <str2>";
			System.out.println(msg);
		}
	}
}