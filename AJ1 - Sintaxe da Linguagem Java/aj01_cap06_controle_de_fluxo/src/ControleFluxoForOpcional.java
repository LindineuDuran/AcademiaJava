/**
 * Classe com o objetivo de praticar a utilização de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoForOpcional
{
	/**
	 * Método para que esta classe possa ser executada com o utilitário java.
	 * 
	 * @param args
	 *            - argumentos para o método main
	 */
	public static void main(String[] args)
	{
		for (int i = 100; i <= 200; i++)
		{
			if ((i % 2 == 0) && (i % 3 != 0))
			{
				System.out.println("O número " + i + " é divisível por 2");
			}
			else if  ((i % 2 != 0) && (i % 3 == 0))
			{
				System.out.println("O número " + i + " é divisível por 3");
			}
			else if  ((i % 2 == 0) && (i % 3 == 0))
			{
				System.out.println("O número " + i + " é divisível por 2 e por 3, e portanto divisível por 6");
			}
			else
			{
				System.out.println("O número " + i + " não é divisível por 2 nem por 3");
			}
		}
	}
}