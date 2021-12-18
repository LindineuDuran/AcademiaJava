public class TesteCalculadoraAmbigua
{
	public static void main(String[] args)
	{
		CalculadoraAmbigua calc = new CalculadoraAmbigua();
		
		//Chama soma(long, long)
		calc.soma(24, 25);
		
		byte a = 24;
		byte b = 25;
		
		//Chama soma(byte, byte)
		calc.soma(a, b);
		
		//Chama soma(byte, byte)
		calc.soma((byte) 24, (byte) 25);
	}
}
