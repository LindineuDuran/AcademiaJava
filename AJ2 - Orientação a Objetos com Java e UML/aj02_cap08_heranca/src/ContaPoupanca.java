public class ContaPoupanca
{
	protected double saldo;

	/**
	 * @param saldo
	 */
	public ContaPoupanca(double saldo)
	{
		super();
		this.saldo = saldo;
	}
	
	public final void saque(double valor)
	{
		if (saldo > valor)
		{
			saldo -= valor;
		}
		else
		{
			System.out.println("Saldo insuficiente");
		}
	}
}
