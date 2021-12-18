package br.com.lduran.aj04.model;

public class Conta
{
	private int saldo;

	/**
	 * @param saldo
	 */
	public Conta(int saldo)
	{
		this.saldo = saldo;
	}

	/**
	 * @return the saldo
	 */
	public int getSaldo()
	{
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(int saldo)
	{
		this.saldo = saldo;
	}
}
