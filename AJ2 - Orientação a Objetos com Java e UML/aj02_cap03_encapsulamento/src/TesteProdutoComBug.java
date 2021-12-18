public class TesteProdutoComBug
{
	public static void main(String[] args)
	{
		Produto p1 = new Produto();
		ProdutoComBug p2 = new ProdutoComBug();
		
		p1.setMarca("Brastemp");
		p2.setMarca("Eletrolux");
		
		System.out.println("Produto 1 = " + p1.getMarca());
		System.out.println("Produto 2 = " + p2.getMarca());
	}
}
