
public class TesteArrayNovo
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int[][] numeros;
		numeros = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0, 11}};
		
		for (int[] linha: numeros)
		{
			for (int elemento: linha)
			{
				System.out.print(elemento);
			}
			
			System.out.println();
		}

	}

}
