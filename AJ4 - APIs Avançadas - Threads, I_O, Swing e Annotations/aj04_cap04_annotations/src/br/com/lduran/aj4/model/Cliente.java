package br.com.lduran.aj4.model;

import br.com.lduran.aj4.annotations.GUIVisible;

public class Cliente
{
	private int codigo;

	@GUIVisible(nomeCampo = "Nome:")
	private String nome;

	@GUIVisible(nomeCampo = "Endereco:")
	private String endereco;

	/**
	 * @return the codigo
	 */
	public int getCodigo()
	{
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo)
	{
		this.codigo = codigo;
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
	 * @return the endereco
	 */
	public String getEndereco()
	{
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}

}
