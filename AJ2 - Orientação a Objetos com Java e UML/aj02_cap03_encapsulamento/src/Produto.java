

public class Produto
{
	private String descricao;
	private String marca;
	private double preco;
	
	/* CONSTRUTOR PADRÃO */
	public Produto() {}
	
	/* CONSTRUTOR COM 3 PARÂMETROS */
	public Produto(String descricao, String marca, double preco)
	{
		this.descricao = descricao;
		this.marca = marca;
		this.preco = preco;
	}

	public String getDescricao()
	{
		return descricao;
	}

	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}

	public String getMarca()
	{
		return marca;
	}

	public void setMarca(String marca)
	{
		this.marca = marca;
	}

	public double getPreco()
	{
		return preco;
	}

	public void alteraPreco(double preco)
	{
		if (preco > 0)
		{
			this.preco = preco;
		}		
	}
	
	public void aumentaPreco(double porcentagem)
	{
		if (porcentagem > 0)
		{
			System.out.println("aumentando o preço em " + porcentagem + " %");
			porcentagem = 1 +(porcentagem / 100);
			preco *= porcentagem;
			System.out.println("Novo preço = " + preco);
		}
		else
		{
			System.out.println("aumento deve ser maior que zero");
		}
	}
	
	void imprime()
	{
		System.out.println("----------------------");
		System.out.println("Produto: " + descricao);
		System.out.println("Marca: " + marca);
		System.out.println("Preço: " + preco);
		System.out.println("----------------------");
	}
}
