public class OCJP_03
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		if (args.length() > 0) //O () � utilizado para m�todos. "length" � um atributo, sendo assim n�o tem ()
		{
			for (int i = 0; i < args.length; i++)
			{
				System.out.println("O valor de args: " + args[i]);
			}
		}
	}

}
