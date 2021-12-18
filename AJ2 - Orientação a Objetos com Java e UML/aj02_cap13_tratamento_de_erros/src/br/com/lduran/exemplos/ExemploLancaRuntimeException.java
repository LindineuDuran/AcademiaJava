package br.com.lduran.exemplos;

public class ExemploLancaRuntimeException
{
	public static void main(String[] args)
	{
		if (args.length > 0)
		{
			for (String item : args)
			{
				System.out.println("Valor do parâmetro recebido = " + item);
			}
		} else
		{
			throw new RuntimeException();
		}
	}
}
