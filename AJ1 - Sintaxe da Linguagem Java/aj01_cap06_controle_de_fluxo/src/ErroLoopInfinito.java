public class ErroLoopInfinito
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int i = 0;
		while (i < 10); //<== erro ao colocar ';' no final da sentença
		{
			System.out.println("O valor de i é: " + i++);
		}
	}

}
