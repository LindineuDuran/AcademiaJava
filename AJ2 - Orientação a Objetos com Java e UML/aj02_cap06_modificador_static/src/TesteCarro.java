public class TesteCarro
{
	public static void main(String[] args)
	{
		System.out.println("Velocidade máxima permitida: " + Carro.velocidadeMaximaPermitida);
		
		Carro c1 = new Carro("GM", "IBM9876", 50);
		Carro c2 = new Carro("Volks", "SUN3344", 42);
		
		c1.acelerar(16);
		c2.acelerar(30);
		
		System.out.println("Carro " + c1.getPlaca() + " ultrapassou o limite? " + c1.ultrapassouLimite());
		System.out.println("Carro " + c2.getPlaca() + " ultrapassou o limite? " + c2.ultrapassouLimite());
		
		Carro.velocidadeMaximaPermitida = 70;
		System.out.println("Velocidade máxima permitida: " + Carro.velocidadeMaximaPermitida);
		
		System.out.println("Carro " + c1.getPlaca() + " ultrapassou o limite? " + c1.ultrapassouLimite());
		System.out.println("Carro " + c2.getPlaca() + " ultrapassou o limite? " + c2.ultrapassouLimite());
	}
}
