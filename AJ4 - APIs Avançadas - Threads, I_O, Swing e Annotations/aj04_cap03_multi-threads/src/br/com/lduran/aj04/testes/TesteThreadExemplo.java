package br.com.lduran.aj04.testes;

import br.com.lduran.aj04.threads.ThreadExemplo;

public class TesteThreadExemplo
{
	public static void main(String[] args)
	{
		ThreadExemplo t = new ThreadExemplo(1000, '-');
		ThreadExemplo u = new ThreadExemplo(1000, '>');
		ThreadExemplo v = new ThreadExemplo(1000, '<');
		ThreadExemplo x = new ThreadExemplo(1000, 'o');

		t.start();
		u.start();
		v.start();
		x.start();
	}
}
