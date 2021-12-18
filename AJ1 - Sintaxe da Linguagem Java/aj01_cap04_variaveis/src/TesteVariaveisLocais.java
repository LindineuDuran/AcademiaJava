public class TesteVariaveisLocais
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		//variável local nome (String) inicializada com o valor Globalcode
		String nome = "Globalcode";
		
		//variável local float f inicializada com o valor 23.5f
		float f = 23.5f;
		
		//variável local int i não inicializada
		int i;
		
		System.out.println("nome: " + nome);
		System.out.println("f: " + f);
		System.out.println("i: " + i); //A variável i não foi inicializada
	}

}
