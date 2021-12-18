
public class TesteOperadoresInstanceof
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String nome1 = "";
		if (nome1 instanceof String)
		{
			System.out.println("nome1 é String");
		}
		else
		{
			System.out.println("nome1 não é String");
		}
	}

}
