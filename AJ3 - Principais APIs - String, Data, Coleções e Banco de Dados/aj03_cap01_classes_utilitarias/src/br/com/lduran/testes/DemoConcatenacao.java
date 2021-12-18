package br.com.lduran.testes;

public class DemoConcatenacao
{
	public static void main(String[] args)
	{
		// Lendo a quantidade de iterações da linha de comando
		int qtd = Integer.parseInt(args[0]);

		// currentTimeMillis() retorna um long com o número de ms desde 01/01/1970
		long inicio = System.currentTimeMillis();

		// concatenaString(qtd);

		long fim = System.currentTimeMillis();
		// System.out.print("Classe String <==========>");
		// System.out.println("Tempo total de processamento: " + (fim - inicio) + "ms");

		// =======================================================================
		inicio = System.currentTimeMillis();

		concatenaStringBuffer(qtd);

		fim = System.currentTimeMillis();
		System.out.print("Classe StringBuffer <==========>");
		System.out.println("Tempo total de processamento: " + (fim - inicio) + "ms");

		// =======================================================================
		inicio = System.currentTimeMillis();

		concatenaStringBuilder(qtd);

		fim = System.currentTimeMillis();
		System.out.print("Classe StringBuilder <==========>");
		System.out.println("Tempo total de processamento: " + (fim - inicio) + "ms");
	}

	private static void concatenaString(int numConcatenacoes)
	{
		String s = "";
		for (int i = 0; i <= numConcatenacoes; i++)
		{
			s += i;
		}

	}

	private static void concatenaStringBuffer(int numConcatenacoes)
	{
		StringBuffer s = new StringBuffer("");
		for (int i = 0; i <= numConcatenacoes; i++)
		{
			s.append(i);
		}

	}

	private static void concatenaStringBuilder(int numConcatenacoes)
	{
		StringBuilder s = new StringBuilder("");
		for (int i = 0; i <= numConcatenacoes; i++)
		{
			s.append(i);
		}

	}
}
