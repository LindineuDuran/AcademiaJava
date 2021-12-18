package br.com.lduran.beans;

public class Cliente
{
	private String nome = null;
	private int id;
	private int qtdPedidos;

	/**
	 * @param nome
	 * @param id
	 * @param qtdPedidos
	 */
	public Cliente(int id, String nome, int qtdPedidos)
	{
		this.id = id;
		this.nome = nome;
		this.qtdPedidos = qtdPedidos;
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
	 * @return the qtdPedidos
	 */
	public int getQtdPedidos()
	{
		return qtdPedidos;
	}

	/**
	 * @param qtdPedidos the qtdPedidos to set
	 */
	public void setQtdPedidos(int qtdPedidos)
	{
		this.qtdPedidos = qtdPedidos;
	}

	@Override
	public boolean equals(Object obj)
	{
		// Se for um parâmetro nulo, retorna false
		if (obj == null)
		{
			return false;
		}

		// Se não for um objeto da classe Cliente, retorna false
		if (!(this.getClass().equals(obj.getClass())))
		{
			return false;
		}

		// Se for um objeto da classe Pessoa, faremos o cast down
		Cliente outroCliente = (Cliente) obj;

		// Verifica se os ids são iguais
		boolean idsIguais = this.getId() == outroCliente.getId();

		// Verifica se os nomes são iguais
		boolean nomesIguais = false;
		if (this.getNome() != null)
		{
			nomesIguais = this.getNome().equals(outroCliente.getNome());
		}
		else
		{
			nomesIguais = this.getNome() == null;
		}

		// retorna o resultado da comparação
		return idsIguais && nomesIguais;
	}

	@Override
	public int hashCode()
	{
		String atributos = nome + id;
		return atributos.hashCode();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "id: " + this.id + "\tNome: " + this.nome + "\tPedidos: " + this.qtdPedidos;
	}
}
