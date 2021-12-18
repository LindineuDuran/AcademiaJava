public class TesteCalculadoraHeranca
{
	public static void main(String[] args)
	{
		Calculadora calculadora = new Calculadora();
		int resultado1 = calculadora.soma(10, 37);
		System.out.println("10 + 37 = " + resultado1);
		
		CalculadoraPlus calcPlus = new CalculadoraPlus();
		
		//Utilização do método herdado da classe Calculadora
		int resultado2 = calcPlus.soma(20, 79);
		System.out.println("20 + 79 = " + resultado2);
		
		//Utilização do método definido na classe CalculadoraPlus
		double resultado3 = calcPlus.multiplicacao(10, 30);
		System.out.println("10 * 30 = " + resultado3);
	}
}
