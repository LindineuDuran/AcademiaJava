public class TesteImpressoraSemVarargs
{
	public static void main (String[] args)
	{
		ImpressoraSemVarargs imp = new ImpressoraSemVarargs();
		
		//inicializando cada elemento do array individualmente
		String[] candidatos = new String[3];
		candidatos[0] = "Marcos da Silva";
		candidatos[1] = "Roberto da Costa";
		candidatos[2] = "Ana Maria Soares";
		imp.listaNomes(candidatos);
		
		//inicializando o array todo de uma vez
		imp.listaNotas(new double[] {7.5, 8.75, 5.5});
	}
}
