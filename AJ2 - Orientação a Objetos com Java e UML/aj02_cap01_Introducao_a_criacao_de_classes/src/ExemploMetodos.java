public class ExemploMetodos
{
	//void indica que o m�todo n�o retorna nada
	void imprime()
	{
		System.out.println("Este metodo n�o retorna nada !");
	}
	
	//o m�todo DEVE retornar um int ou tipo primitivo compat�vel,
	//caso contr�rio haver� um erro de compila��o!!!
	int calculaFrete()
	{
		return 19;
	}
	
	//o m�todo DEVE retornar um objeto da classe String,
	//ou seja, um tipo reference
	String getNome()
	{
		return "Este m�todo retorna uma String!";
	}
}
