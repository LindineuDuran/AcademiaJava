public class TesteRuntimeExceptions
{
	public static void main(String[] args)
	{
		try
		{
			// Leitura do(s) parametro(s) digitado(s) pelo usuario como parametro(s) do main
			for (String item : args)
			{
				String parametro = item;
				int numero = Integer.parseInt(parametro);
			}

		} catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Forneça ao menos um parâmetro");
		} catch (NumberFormatException e)
		{
			System.out.println("Parâmetro(s) deve(m) ser numérico(s)");
		} finally
		{
			System.out.println("Fim do Processo");
		}
	}
}
