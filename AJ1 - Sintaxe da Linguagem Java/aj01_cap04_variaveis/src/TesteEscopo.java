
public class TesteEscopo
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		{
			//as variáveis que forem declaradas dentro deste bloco
			//n�o ser�o acess�veis fora
			int quantidade = 23;
		}
		
		System.out.println("quantidade: " + quantidade);
	}

}
