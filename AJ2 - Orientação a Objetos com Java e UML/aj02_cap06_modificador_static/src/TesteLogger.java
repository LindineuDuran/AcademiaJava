public class TesteLogger
{
	public static void main(String[] args)
	{
		Logger.logIt("Logger");
		
		Logger log1 = new Logger();
		log1.logIt("log1");
		
		Logger log2 = new Logger();
		log2.logIt("log2");		
		
		Logger.logIt("Logger");
	}
}
