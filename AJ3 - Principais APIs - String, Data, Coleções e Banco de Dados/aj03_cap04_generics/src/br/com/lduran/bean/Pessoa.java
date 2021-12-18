package br.com.lduran.bean;

public class Pessoa implements Comparable<Pessoa>
{
	private String nome;
	private String rg;
	private String dataNascimento;

	/**
	 * @param nome
	 * @param rg
	 * @param dataNascimento
	 */
	public Pessoa(String nome, String rg, String dataNascimento)
	{
		this.nome = nome;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
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

	/**
	 * @return the dataNascimento
	 */
	public String getDataNascimento()
	{
		return dataNascimento;
	}

	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(String dataNascimento)
	{
		this.dataNascimento = dataNascimento;
	}

	@Override
	public int compareTo(Pessoa outraPessoa)
	{
		String dadosCompletos = this.nome + this.rg;
		String dadosCompletosOutraPessoa = outraPessoa.nome + outraPessoa.rg;
		return dadosCompletos.compareTo(dadosCompletosOutraPessoa);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Pessoa [nome=" + nome + ", rg=" + rg + ", dataNascimento=" + dataNascimento + "]";
	}
}
