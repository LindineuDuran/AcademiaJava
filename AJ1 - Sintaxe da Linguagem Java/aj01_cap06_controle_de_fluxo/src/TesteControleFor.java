public class TesteControleFor
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		for (int i = 0; i < 5; i = i + 1)
		{
			System.out.println("i = " + i);
		}
		
		for (int i = 0, z = 15; i < z; i++, z--)
		{
			System.out.println("i = " + i);
		}
	}

}
