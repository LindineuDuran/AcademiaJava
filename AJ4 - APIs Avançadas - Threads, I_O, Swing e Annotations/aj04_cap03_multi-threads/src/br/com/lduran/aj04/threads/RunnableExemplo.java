package br.com.lduran.aj04.threads;

public class RunnableExemplo implements Runnable
{
	int numero;
	char c;

	/**
	 * @param numero
	 * @param c
	 */
	public RunnableExemplo(int numero, char c)
	{
		this.numero = numero;
		this.c = c;

		System.out.printf("Thread vai imprimir %d vezes o caracter %c %n", numero, c);
	}

	@Override
	public void run()
	{
		for (int i = 0; i < numero; i++)
		{
			System.out.print(c);
		}
	}

}
