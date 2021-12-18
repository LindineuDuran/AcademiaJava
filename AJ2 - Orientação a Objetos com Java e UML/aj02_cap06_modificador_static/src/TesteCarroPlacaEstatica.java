public class TesteCarroPlacaEstatica
{
	public static void main(String[] args)
	{
		System.out.println("Velocidade máxima permitida: " + CarroPlacaEstatica.velocidadeMaximaPermitida);
		
		CarroPlacaEstatica c1 = new CarroPlacaEstatica("GM", "IBM9876", 50);
		CarroPlacaEstatica c2 = new CarroPlacaEstatica("Volks", "SUN3344", 42);
		
		c1.acelerar(16);
		c2.acelerar(30);
		
		System.out.println("Carro " + c1.getPlaca() + " ultrapassou o limite? " + c1.ultrapassouLimite());
		System.out.println("Carro " + c2.getPlaca() + " ultrapassou o limite? " + c2.ultrapassouLimite());
		
		CarroPlacaEstatica.velocidadeMaximaPermitida = 70;
		System.out.println("Velocidade máxima permitida: " + CarroPlacaEstatica.velocidadeMaximaPermitida);
		
		System.out.println("Carro " + c1.getPlaca() + " ultrapassou o limite? " + c1.ultrapassouLimite());
		System.out.println("Carro " + c2.getPlaca() + " ultrapassou o limite? " + c2.ultrapassouLimite());
	}
}
