public class ExemploBlocoInicializador
{
	//declara��o de atributos
	private int atributo = 15;
	
	//primeiro bloco inicializador
	{
		System.out.println("Dentro do primeiro inicializador de inst�ncia");
		System.out.println("Valor do atributo = " + atributo);
	}
	
	//construtor
	public ExemploBlocoInicializador()
	{
		System.out.println("Dentro do Construtor");
	}
	
	//segundo bloco inicializador
	{
		System.out.println("Dentro do segundo inicializador de inst�ncia");
		System.out.println("Valor do atributo = " + ++atributo);
	}
}
