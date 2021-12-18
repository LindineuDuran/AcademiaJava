package br.com.lduran.exemplos.exceptions;

public class ExemploRuntimeExceptionComTratamentoException
{
	public static void main(String[] args)
	{
		int i = 23;
		int j = 0;

		try
		{
			double res = i / j;

			System.out.println(i + " / " + j + " = " + res);
		}
		catch (Exception e)
		{
			System.out.println("Divisão inválida!");
		}

	}
}
