public class TesteCastUp
{
	public static void main(String[] args)
	{
		//O objeto c foi declarado e instanciado como Cliente
		Cliente c = new Cliente();
		
		//Casting Up explícito do objeto da classe Cliente para a classe Pessoa
		Pessoa p1 = (Pessoa) c;
		
		//Casting Up do objeto da classe Cliente para a classe Pessoa
		Pessoa p2 = c;
		
		//Casting Up do objeto da classe Cliente para Pessoa
		Pessoa p3 = new Cliente();
		
		//Casting Up explícito do objeto da classe Cliente para a classe Object
		Object o1 = (Object)c;
		
		//Casting Up do objeto da classe Cliente para a classe Object
		Object o2 = c;
	}
}
