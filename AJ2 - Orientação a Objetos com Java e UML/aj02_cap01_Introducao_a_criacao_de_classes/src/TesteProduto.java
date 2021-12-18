public class TesteProduto
{
	public static void main(String[] args)
	{
		Produto p = new Produto();
		p.inicializaValores(9.0, "Produto X", "Marca Y");
		p.imprime();
		
		//aumento de 10% no preço do produto
		p.preco *= 1.1;
		p.descricao = "Nova Descrição";
		p.marca = "Sem Marca";
		p.imprime();
	}
}
