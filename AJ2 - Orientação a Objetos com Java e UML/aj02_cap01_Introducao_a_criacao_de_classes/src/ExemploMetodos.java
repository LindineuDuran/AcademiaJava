public class ExemploMetodos
{
	//void indica que o método não retorna nada
	void imprime()
	{
		System.out.println("Este metodo não retorna nada !");
	}
	
	//o método DEVE retornar um int ou tipo primitivo compatível,
	//caso contrário haverá um erro de compilação!!!
	int calculaFrete()
	{
		return 19;
	}
	
	//o método DEVE retornar um objeto da classe String,
	//ou seja, um tipo reference
	String getNome()
	{
		return "Este método retorna uma String!";
	}
}
