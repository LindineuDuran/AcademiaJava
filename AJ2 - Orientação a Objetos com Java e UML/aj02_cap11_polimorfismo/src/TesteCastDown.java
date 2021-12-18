public class TesteCastDown
{
	public static void main(String[] args)
	{
		Cliente c1 = new Cliente();
		
		//Casta Up de Cliente para Pessoa
		Pessoa p1 = c1;
		
		//Cast Down de Pessoa para Cliente
		Cliente c2 = (Cliente) p1;
		
		//Criação de uma instânciada classe Pessoa
		Pessoa p2 = new Pessoa();
		
		//Cast Down INVÁLIDO de Pessoa para Cliente, pois o tipo real de p2 é Pessoa
		Cliente c3 = (Cliente) p2;
	}
}
