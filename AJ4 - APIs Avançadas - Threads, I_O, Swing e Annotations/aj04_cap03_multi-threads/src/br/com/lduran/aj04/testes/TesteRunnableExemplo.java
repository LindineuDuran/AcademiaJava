package br.com.lduran.aj04.testes;

import br.com.lduran.aj04.threads.RunnableExemplo;

public class TesteRunnableExemplo
{
	public static void main(String[] args)
	{
		RunnableExemplo r1 = new RunnableExemplo(1000, '-');
		RunnableExemplo r2 = new RunnableExemplo(1000, '>');
		RunnableExemplo r3 = new RunnableExemplo(1000, '<');
		RunnableExemplo r4 = new RunnableExemplo(1000, 'o');

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		Thread t4 = new Thread(r4);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
