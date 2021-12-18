
public class TesteEscopo
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		{
			//as variÃ¡veis que forem declaradas dentro deste bloco
			//não serão acessíveis fora
			int quantidade = 23;
		}
		
		System.out.println("quantidade: " + quantidade);
	}

}
