public class TesteProduto
{
	public static void main(String[] args)
	{
		Produto p1 = new Produto();
		
		//O m�todo que recebe (double, String, String) ser� chamado
		p1.valoresIniciais(9.0, "Produto X", "Marca Y");
		p1.imprime();
		
		Produto p2 = new Produto();
		
		//O m�todo que recebe (double, String) ser� chamado
		p2.valoresIniciais(1000, "Fiat");
		p2.imprime();
	}
}
