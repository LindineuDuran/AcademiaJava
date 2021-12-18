public class TesteControleFluxoIfElse
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int x = 6;
		
		//estrutura if else sem utilização de {}
		if ((x > 0) && (x % 2 == 0))
			System.out.println("x é positivo e divisível por 2");
		else
			System.out.println("x é negativo ou não é divisível por 2");
		
		//estrutura de ifs aninhados utilizando {}
		if (x % 2 == 0)
		{
			System.out.println(x + " é divisível por 2");
			
			if (x % 3 == 0)
			{
				System.out.println(x + " é divisível por 3");
			}
		} //end if
		
		//Utilizando if-else
		if (x > 0)
		{
			System.out.println("x é POSITIVO");
		}
		else if (x < 0)
		{
			System.out.println("x é NEGATIVO");
		}
		else
		{
			System.out.println("x é igual a ZERO");
		}
	}

}
