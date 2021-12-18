package br.com.lduran.aj04.threads;

import br.com.lduran.aj04.model.Banco;

public class Transferencia implements Runnable
{
	private Banco banco;
	private int contaSaque;
	private int limiteTransferencia = 0;

	/**
	 * @param banco
	 * @param contaSaque
	 * @param limiteTransferencia
	 */
	public Transferencia(Banco banco, int contaSaque, int limiteTransferencia)
	{
		this.banco = banco;
		this.contaSaque = contaSaque;
		this.limiteTransferencia = limiteTransferencia;
	}

	@Override
	public void run()
	{
		while (!Thread.currentThread().isInterrupted())
		{
			int contaDeposito = (int) (banco.getNumeroContas() * Math.random());
			int valor = (int) (limiteTransferencia * Math.random());
			banco.transferir(contaSaque, contaDeposito, valor);
		}
	}

}
