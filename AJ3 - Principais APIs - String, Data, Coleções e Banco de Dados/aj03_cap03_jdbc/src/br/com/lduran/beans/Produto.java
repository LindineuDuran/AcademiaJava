package br.com.lduran.beans;

public class Produto
{
	private int id;
	private String nome;
	private int preco;

	/**
	 * @param id
	 * @param nome
	 * @param preco
	 */
	public Produto(int id, String nome, int preco)
	{
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	/**
	 * @param nome
	 * @param preco
	 */
	public Produto(String nome, int preco)
	{
		this(0, nome, preco);
	}

	/**
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id)
	{
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome()
	{
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	/**
	 * @return the preco
	 */
	public int getPreco()
	{
		return preco;
	}

	/**
	 * @param preco the preco to set
	 */
	public void setPreco(int preco)
	{
		this.preco = preco;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "[Nome do Produto: " + nome + "][ID: " + id + "][R$: " + preco + "]";
	}
}
