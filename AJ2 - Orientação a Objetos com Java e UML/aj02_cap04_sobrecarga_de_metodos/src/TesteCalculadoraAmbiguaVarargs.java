public class TesteCalculadoraAmbiguaVarargs
{
	public static void main(String[] args)
	{
		CalculadoraAmbiguaVarargs calc = new CalculadoraAmbiguaVarargs();
		
		//Chama soma(long, long)
		calc.soma(15, 20);
		
		//Chama soma(int...)
		calc.soma(15, 20, 25);
	}
}
