public class OCJP_03
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		if (args.length() > 0) //O () é utilizado para métodos. "length" é um atributo, sendo assim não tem ()
		{
			for (int i = 0; i < args.length; i++)
			{
				System.out.println("O valor de args: " + args[i]);
			}
		}
	}

}
