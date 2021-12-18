public class TesteSwitch
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int diaSemana = 5;

		switch (diaSemana)
		{
			case 1:
				System.out.println("Segunda-feira");
				break;
	
			case 2:
				System.out.println("Terça-feira");
				break;
	
			case 3:
				System.out.println("Quarta-feira");
				break;
	
			case 4:
				System.out.println("Quinta-feira");
				break;
	
			case 5:
				//neste caso as operações são executadas sequencialmente
				//até que seja encontrado um break
				System.out.println("Sexta-feira");
				System.out.println("Hoje é dia de balada!");
	
			case 6:
				System.out.println("Sábado");
				System.out.println("Hoje ainda é dia de balada!");
				break;
	
			case 7:
				System.out.println("Domingo");
				break;
	
			default:
				System.out.println("Dia inválido!");
				break;
		}
	}

}
