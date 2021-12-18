package br.com.lduran.util.erros;

public class ExemploLancaException
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
			throw new Exception(); // Unhandled exception type Exception. Add throws declaration
									// or surround with try/catch
		}
	}
}
