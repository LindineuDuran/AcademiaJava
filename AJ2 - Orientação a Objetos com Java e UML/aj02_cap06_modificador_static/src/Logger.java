public class Logger
{
	private static int qtdLogs;
	
	public static void logIt(String mensagem)
	{
		String dataHora = "" + new java.util.Date();
		System.out.println(dataHora + " : " +qtdLogs + " : " + mensagem);
		qtdLogs++;
	}
}
