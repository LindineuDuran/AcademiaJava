public class TesteCalculadoraStatic
{
	public static void main(String[] args)
	{
		System.out.println("1 + 9 = " + CalculadoraStatic.soma(1, 9));
		System.out.println("1 + 9.0F = " + CalculadoraStatic.soma(1, 9.0F));
		
		int num[] = {1, 3, 6};
		System.out.println("1 + 3 + 6 = " + CalculadoraStatic.soma(num));
	}
}
