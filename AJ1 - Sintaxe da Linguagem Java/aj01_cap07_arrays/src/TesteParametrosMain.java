
public class TesteParametrosMain
{

	/**
	 * @param args
	 * Para testes, configura os parāmetros em "Run Configurantions --> Argumentos"
	 */
	public static void main(String[] args)
	{
		//Imprime os Parāmetros usando o for convencional
		System.out.println("Imprime os Parāmetros usando o for convencional");
		for(int i=0; i < args.length; i++)
		{
			System.out.println(args[i]);
		}
		
		//Imprime os Parāmetros usando for-each
		System.out.println("Imprime os Parāmetros usando for-each");
		for(String item : args)
		{
			System.out.println(item);
		}
	}

}
