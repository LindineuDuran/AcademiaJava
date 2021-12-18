public class ImpressoraComVarargs
{
	void listaNomes(String ... nomes)
	{
		System.out.println("Lista de nomes recebidos: ");
		for (int i = 0; i < nomes.length; i++)
		{
			System.out.println("\t" + nomes[i]);
		}
	}
	
	void listaNotas(String msg, double ... notas)
	{
		System.out.println(msg);
		for (int i = 0; i < notas.length; i++)
		{
			System.out.println("\t" + notas[i]);
		}
	}
}
