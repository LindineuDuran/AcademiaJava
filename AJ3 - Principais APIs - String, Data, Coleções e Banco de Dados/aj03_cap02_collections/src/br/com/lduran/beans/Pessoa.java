package br.com.lduran.beans;

public class Pessoa implements Comparable
{
	private String nome;
	private long rg;
	private String dataNascimento;

	/**
	 * @param nome
	 * @param rg
	 * @param dataNascimento
	 */
	public Pessoa(String nome, long rg, String dataNascimento)
	{
		super();
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
	public long getRg()
	{
		return rg;
	}

	/**
	 * @param rg the rg to set
	 */
	public void setRg(long rg)
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
	public boolean equals(Object obj)
	{
		// Se for um parâmetro nulo, retorna false
		if (obj == null)
		{
			return false;
		}

		// Se não for um objeto da classe Pessoa, retorna false
		if (!(this.getClass().equals(obj.getClass())))
		{
			return false;
		}

		// Se for um objeto da classe Pessoa, faremos o cast down
		Pessoa outraPessoa = (Pessoa) obj;

		// Verifica se os rgs são iguais
		boolean rgsIguais = this.getRg() == outraPessoa.getRg();

		// Verifica se os nomes são iguais
		boolean nomesIguais = false;
		if (this.getNome() != null)
		{
			nomesIguais = this.getNome().equals(outraPessoa.getNome());
		}
		else
		{
			nomesIguais = this.getNome() == null;
		}

		// retorna o resultado da comparação
		return rgsIguais && nomesIguais;
	}

	@Override
	public int compareTo(Object obj)
	{
		Pessoa outraPessoa = (Pessoa) obj;
		String atributos = nome + rg;

		String outrosAtributos = outraPessoa.getNome() + outraPessoa.getRg();

		return atributos.compareTo(outrosAtributos);
	}

	@Override
	public int hashCode()
	{
		String atributos = nome + rg;
		return atributos.hashCode();
	}

	@Override
	public String toString()
	{
		return " Nome: " + nome + "\tRG: " + rg + "\n\t  data de nascimento: " + dataNascimento + "\n";
	}
}
