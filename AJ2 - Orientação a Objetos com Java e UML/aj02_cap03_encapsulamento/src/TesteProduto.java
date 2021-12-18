

public class TesteProduto
{
	public static void main(String[] args)
	{
		Produto p = new Produto("Produto X", "Marca Y", 9.0);
		p.imprime();
		
		p.aumentaPreco(10);
		p.setDescricao("Casual Class");
		p.setMarca("Globalcode");
		p.imprime();		
	}
}
