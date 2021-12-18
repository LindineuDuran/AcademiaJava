public class Produto
{
	private String descricao;
	private String marca;
	private double preco;
	
	public void valoresIniciais(double umPreco, String umaMarca)
	{
		this.alterarPreco(umPreco);
		this.setMarca(umaMarca);
	}
	
	public void valoresIniciais(double umPreco, String umaDescricao, String umaMarca)
	{
		this.valoresIniciais(umPreco, umaMarca);
		this.setDescricao(umaDescricao);
	}
	
	public String getDescricao()
	{
		return this.descricao;
	}
	
	public void setDescricao(String novaDescricao)
	{
		this.descricao = novaDescricao;
	}
	
	public String getMarca()
	{
		return this.marca;
	}
	
	public void setMarca(String novaMarca)
	{
		this.marca = novaMarca;
	}
	
	public double getPreco()
	{
		return this.preco;
	}
	
	public void alterarPreco(double novoPreco)
	{
		if (novoPreco > 0)
		{
			this.preco = novoPreco;
		}
	}
	
	public void aumentarPreco(double porcentagem)
	{
		if (porcentagem > 0)
		{
			System.out.println("Aumenta o preço em " + porcentagem + " %");
			porcentagem = 1 + (porcentagem / 100);
			preco *= porcentagem;
			System.out.println("Novo preço = " + this.getPreco());
		}
		else
		{
			System.out.println("Aumento deve ser maior do que zero");
		}
	}
	
	public void imprime()
	{
		System.out.println("---------------------------------------");
		System.out.println("Produto: " + this.getDescricao() + "\n");
		System.out.println("Marca: " + this.getMarca() + "\n");
		System.out.println("Preço: " + this.getPreco() + "\n");
		System.out.println("---------------------------------------");
	}
}
