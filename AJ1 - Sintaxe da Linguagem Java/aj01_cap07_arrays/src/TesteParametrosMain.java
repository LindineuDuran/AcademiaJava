
public class TesteParametrosMain
{

	/**
	 * @param args
	 * Para testes, configura os par�metros em "Run Configurantions --> Argumentos"
	 */
	public static void main(String[] args)
	{
		//Imprime os Par�metros usando o for convencional
		System.out.println("Imprime os Par�metros usando o for convencional");
		for(int i=0; i < args.length; i++)
		{
			System.out.println(args[i]);
		}
		
		//Imprime os Par�metros usando for-each
		System.out.println("Imprime os Par�metros usando for-each");
		for(String item : args)
		{
			System.out.println(item);
		}
	}

}
