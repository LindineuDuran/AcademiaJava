public final class ContaCorrente
{
	protected double saldo;
	private String numero;
	private double acumuladorIFN;
	private static double taxaIFN = 0.038;

	/**
	 * @param saldoInicial
	 *            Saldo Inicial da conta
	 * @param num
	 *            Numero da conta
	 * @param tit
	 *            Titular da conta
	 * @param ag
	 *            Agencia a qual a conta pertence
	 * @param bc
	 *            Banco a qual a agencia pertence
	 */
	public ContaCorrente(double saldoInicial, String num)
	{
		saldo = saldoInicial;
		numero = num;
	}

	/**
	 * @param num
	 *            Numero da conta
	 * @param tit
	 *            Titular da conta
	 * @param ag
	 *            Agencia a qual a conta pertence
	 * @param bc
	 *            Banco a qual a agencia pertence
	 */
	public ContaCorrente(String num)
	{
		this(0, num);
	}

	/**
	 * @param valor
	 *            Valor a ser sacado da conta
	 */
	public void saque(double valor)
	{
		System.out.println(
				"Realizando saque de R$ " + valor + " da conta " + numero);
		if (valor > 0)
		{
			if (saldo >= valor)
			{
				saldo -= valor;
				acumularIFN(valor);
			} else
				System.out.println("Saldo insuficiente");
		} else
		{
			System.out.println("O valor de saque deve ser positivo");
		}
	}

	/**
	 * @param valor
	 *            Valor a ser depositado da conta
	 */
	public void deposito(double valor)
	{
		System.out.println(
				"Realizando deposito de R$" + valor + " da conta " + numero);
		if (valor >= 0)
		{
			this.saldo += valor;
		} else
			System.out.println("O valor do deposito deve ser positivo");
	}

	/**
	 * Este metodo deve imprimir todos os dados da conta corrente
	 */
	public void imprimeDados()
	{
		System.out.println("======================================");
		System.out.println("Numero da conta: " + numero);
		System.out.println("Saldo  : R$" + saldo);
		System.out.println("IFN devido: R$" + acumuladorIFN);
		System.out.println("========================================");
	}

	/**
	 * @return saldo da conta
	 */
	public double getSaldo()
	{
		return saldo;
	}

	/**
	 * @return numero numero da conta
	 */
	public String getNumero()
	{
		return numero;
	}

	public static double getTaxaIFN()
	{
		return taxaIFN;
	}

	public static void setTaxaIFN(double taxaIFN)
	{
		ContaCorrente.taxaIFN = taxaIFN;
	}

	protected void acumularIFN(double valorSaque)
	{
		acumuladorIFN += taxaIFN * valorSaque;
	}

	public double getIFNAcumulado()
	{
		return acumuladorIFN;
	}
}
