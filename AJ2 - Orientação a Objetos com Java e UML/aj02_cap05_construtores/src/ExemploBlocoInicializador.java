public class ExemploBlocoInicializador
{
	//declaração de atributos
	private int atributo = 15;
	
	//primeiro bloco inicializador
	{
		System.out.println("Dentro do primeiro inicializador de instância");
		System.out.println("Valor do atributo = " + atributo);
	}
	
	//construtor
	public ExemploBlocoInicializador()
	{
		System.out.println("Dentro do Construtor");
	}
	
	//segundo bloco inicializador
	{
		System.out.println("Dentro do segundo inicializador de instância");
		System.out.println("Valor do atributo = " + ++atributo);
	}
}
