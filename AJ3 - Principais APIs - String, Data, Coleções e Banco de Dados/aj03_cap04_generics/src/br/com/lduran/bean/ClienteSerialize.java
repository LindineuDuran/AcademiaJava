package br.com.lduran.bean;

import java.io.Serializable;

public class ClienteSerialize implements Serializable
{
	private String nome;
	private String telefone;
	private String cpf;
	private int id;

	/**
	 * @param nome     Nome do Cliente
	 * @param telefone Telefone do Cliente
	 * @param cpf      CPF do Cliente
	 * @param id       ID do Cliente
	 */
	public ClienteSerialize(String nome, String telefone, String cpf, int id)
	{
		this(nome, telefone, cpf);
		this.id = id;
	}

	/**
	 * Este construtor podera ser utilizado quando o id do ClienteSerialize precisar
	 * ser atribuido depois, como por exemplo quando é necessario criar o Cliente
	 * para salvar no banco de dados, onde o id é gerado automaticamente.
	 *
	 * @param nome     Nome do Cliente
	 * @param telefone Telefone do Cliente
	 * @param cpf      CPF do Cliente
	 *
	 */
	public ClienteSerialize(String nome, String telefone, String cpf)
	{
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
	}

	/**
	 * @return CPF do ClienteSerialize
	 */
	public String getCpf()
	{
		return cpf;
	}

	/**
	 * @return ID do ClienteSerialize
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * @return Nome do ClienteSerialize
	 */
	public String getNome()
	{
		return nome;
	}

	/**
	 * @return Telefone do ClienteSerialize
	 */
	public String getTelefone()
	{
		return telefone;
	}

	/**
	 * @param cpf CPF do ClienteSerialize
	 */
	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}

	/**
	 * @param id ID do ClienteSerialize
	 */
	public void setId(int id)
	{
		this.id = id;
	}

	/**
	 * @param nome Nome do ClienteSerialize
	 */
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	/**
	 * @param telefone Telefone do ClienteSerialize
	 */
	public void setTelefone(String telefone)
	{
		this.telefone = telefone;
	}

	@Override
	public String toString()
	{
		String cliente = " ID [" + this.id + "]";
		cliente += this.nome + "\t CPF (" + this.cpf + " ) \t";
		cliente += "- Tel: {" + this.telefone + "}";
		return cliente;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (getClass() != obj.getClass())
		{
			return false;
		}
		ClienteSerialize other = (ClienteSerialize) obj;
		if (cpf == null)
		{
			if (other.cpf != null)
			{
				return false;
			}
		}
		else if (!cpf.equals(other.cpf))
		{
			return false;
		}
		return true;
	}
}