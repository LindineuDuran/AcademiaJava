package br.com.lduran.model;

import br.com.lduran.exemplos.exceptions.NumeroInvalidoException;

public class Endereco
{
	private String rua;
	private int numero;

	/**
	 * Como o construtor chama o método setNúmero, é necessário indicar na
	 * assinatura que ele pode lançar uma exception NumeroInvalidoException
	 *
	 * @param rua
	 * @param numero
	 * @throws NumeroInvalidoException
	 */
	public Endereco(String rua, int numero) throws NumeroInvalidoException
	{
		this.setRua(rua);
		this.setNumero(numero);
	}

	/**
	 * @return the rua
	 */
	public String getRua()
	{
		return rua;
	}

	/**
	 * @param rua the rua to set
	 */
	public void setRua(String rua)
	{
		this.rua = rua;
	}

	/**
	 * @return the numero
	 */
	public int getNumero()
	{
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) throws NumeroInvalidoException
	{
		if (numero > 0)
		{
			this.numero = numero;
		}
		else
		{
			throw new NumeroInvalidoException(numero + " nao e valido! ");
		}
	}
}
