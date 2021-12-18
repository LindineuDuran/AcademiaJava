//Testa a passagem de parâmetros
public class TesteCalculadora
{
	public static void main(String[] args)
	{
		//instancia a calculadora
		Calculadora calc = new Calculadora();
		
		calc.print("Vamos testar a calculadora");
		
		int resultado1 = calc.soma(10, 10);
		System.out.println("10 + 10 = " + resultado1);
		
		double resultado2 = calc.multiplicacao(10, 10);
		System.out.println("10 * 10 = " + resultado2);
		
		boolean resultado3 = calc.maior(20, 100);
		System.out.println("20 > 100 = " + resultado3);
	}
}
