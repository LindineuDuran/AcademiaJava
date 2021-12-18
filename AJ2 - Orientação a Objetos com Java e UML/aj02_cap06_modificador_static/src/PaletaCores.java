public class PaletaCores
{
	private static int[] cores = new int[7];
	
	//primeiro bloco inicializador
	{
		System.out.println("Dentro do primeiro inicializador de inst�ncia");
	}
	
	public PaletaCores()
	{
		System.out.println("Criando inst�ncia da classe PaletaCores");
	}
	
	static
	{
		//hipoteticamente, ser�o atribu�dos n�meros inteiros �s cores,
		//como por exemplo: 0 branco, 1 azul, 2 vermelho, etc...
		System.out.println("Inicializando array de cores no bloco de inicializa��o est�tico...");
		
		for(int i = 0; i < cores.length; i++)
		{
			cores[i] = i;
		}
	}
	
	//segundo bloco inicializador
	{
		System.out.println("Dentro do segundo inicializador de inst�ncia");
	}
}
