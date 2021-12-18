public class TesteImpressoraComVarargs
{
	public static void main(String[] args)
	{
		ImpressoraComVarargs imp = new ImpressoraComVarargs();
		imp.listaNomes("Marcos da Silva", "Roberto da Costa", "Ana Maria Soares");
		imp.listaNotas("Lista de notas recebidas:", 7.5, 8.75, 5.5);
	}
}
