package br.com.lduran.aj04.model;

public class Banco
{
	private Conta contas[];
	private static final int TRANSACOES_PARA_IMPRESSAO = 10000;
	private int contadorTransacoes = 0;

	/**
	 * construtor do banco: Criamos um banco com numeroContas, sendo que cada conta tem um saldo inicial = saldoInicial
	 *
	 * @param numeroContas
	 * @param saldoInicial
	 */
	public Banco(int numeroContas, int saldoInicial)
	{
		contas = new Conta[numeroContas];
		for (int i = 0; i < numeroContas; i++)
		{
			Conta c = new Conta(saldoInicial);
			contas[i] = c;
		}
	}

	public synchronized void transferir(int contaSaque, int contaDeposito, int valor)
	{
		// se não houver saldo sufuciente, sai do método
		if (contas[contaSaque].getSaldo() < valor)
		{
			return;
		}

		// tiramos o $ de uma conta e colocamos em outra
		contas[contaSaque].setSaldo(contas[contaSaque].getSaldo() - valor);
		contas[contaDeposito].setSaldo(contas[contaDeposito].getSaldo() + valor);

		contadorTransacoes++;
		if (contadorTransacoes % TRANSACOES_PARA_IMPRESSAO == 0)
		{
			imprimeTotal();
		}
	}

	public int getNumeroContas()
	{
		return contas.length;
	}

	private void imprimeTotal()
	{
		int total = 0;
		for (int i = 0; i < contas.length; i++)
		{
			total += contas[i].getSaldo();
			System.out.println("Transação = " + contadorTransacoes + " total = " + total);
		}
	}
}
