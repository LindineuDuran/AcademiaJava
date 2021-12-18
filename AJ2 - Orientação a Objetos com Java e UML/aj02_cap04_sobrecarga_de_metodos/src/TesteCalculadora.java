public class TesteCalculadora
{
	public static void main(String[] args)
	{
		Calculadora calc = new Calculadora();
		System.out.println("1 + 9 = " + calc.soma(1,9));
		System.out.println("1 + 9.0F = " + calc.soma(1, 9.0F));
		
		int num[] = {1, 3, 6};
		System.out.println("1 + 3 + 6 = " + calc.soma(num));
	}
}
