package br.com.lduran.aj04.exemplos;

import br.com.lduran.aj04.threads.ThreadExemplo;

public class ExemploUsoIncorretoRun
{
	public static void main(String[] args)
	{
		ThreadExemplo t = new ThreadExemplo(1000, '-');
		ThreadExemplo u = new ThreadExemplo(1000, '>');
		ThreadExemplo v = new ThreadExemplo(1000, '<');
		ThreadExemplo x = new ThreadExemplo(1000, 'o');

		t.run();
		u.run();
		v.run();
		x.run();
	}
}
