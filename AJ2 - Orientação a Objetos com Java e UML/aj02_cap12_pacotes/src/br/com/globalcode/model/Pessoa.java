package br.com.globalcode.model;

import br.com.globalcode.util.Endereco;

public class Pessoa
{
	private Endereco endereco;
	private String nome;
	private String rg;

	/**
	 * @param endereco
	 * @param nome
	 * @param rg
	 */
	public Pessoa(Endereco endereco, String nome, String rg)
	{
		super();
		this.endereco = endereco;
		this.nome = nome;
		this.rg = rg;
	}

	/**
	 * @return the endereco
	 */
	public Endereco getEndereco()
	{
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(Endereco endereco)
	{
		this.endereco = endereco;
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
	 * @return the rg
	 */
	public String getRg()
	{
		return rg;
	}

	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg)
	{
		this.rg = rg;
	}
}
