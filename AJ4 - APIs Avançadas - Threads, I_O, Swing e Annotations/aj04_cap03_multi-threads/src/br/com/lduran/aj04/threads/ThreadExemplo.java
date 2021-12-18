package br.com.lduran.aj04.threads;

public class ThreadExemplo extends Thread
{
	int numero;
	char c;

	/**
	 * @param numero
	 * @param c
	 */
	public ThreadExemplo(int numero, char c)
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
