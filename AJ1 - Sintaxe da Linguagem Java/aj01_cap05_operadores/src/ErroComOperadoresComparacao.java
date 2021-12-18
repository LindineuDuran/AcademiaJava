
public class ErroComOperadoresComparacao
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int num1 = 2;
		int num2 = 3;
		boolean erro = (num1 = num2); //aqui está sendo feita uma atribuição, não uma comparação
	}

}
