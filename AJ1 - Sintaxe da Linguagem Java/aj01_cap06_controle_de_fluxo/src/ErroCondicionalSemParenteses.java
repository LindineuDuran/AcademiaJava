public class ErroCondicionalSemParenteses
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int num1 = 2;
		int num2 = 3;
		
		if num1 == num2 //faltou () envolvendo a expressão
		{
			System.out.println("O número 1 é igual ao número 2");
		}
	}
}
